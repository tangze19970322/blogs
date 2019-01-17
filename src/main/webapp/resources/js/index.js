var app = angular.module('showPageApp',['ui.router']);

app.controller('indexController', function ($scope, $http) {

    var recentArticle = {
        field: 'create_time',
        pageIndex: 0,
        pageSize: 10
    }

    //请求菜单
    $http({
        method: 'GET',
        url: '/blogs/menu/menuList'
    }).then(function successCallback(response) {
        var data = response.data;
        if (data.success == false) {
            alert(data.error)
        } else {
            $scope.menus = data.data;
        }
    }, function errorCallback(response) {
        // 请求失败执行代码
    });

    //请求最新文章
    $http.get('/blogs/article/articleList',{params: recentArticle}).
    then(function(response){
        var data = response.data;
        if (data.success == false) {
            alert(data.error)
        } else {
            $scope.recentArticle = data.data;
        }
    })

    //请求标签
    $http.get('/blogs/tags/findAllTags').
    then(function(response){
        var data = response.data;
        if (data.success == false) {
            alert(data.error)
        } else {
            $scope.tags = data.data;
        }
    })


    $scope.menuStyle = function($event) {
        $("#menuUl li").attr("class","");
        var li = $($event.target).parents('li');
        $(li).attr("class","active");
    }

});