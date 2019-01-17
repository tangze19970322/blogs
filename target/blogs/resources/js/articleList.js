(function() {

    'use strict';

    app.controller('articleListController', function ($scope, $http) {
        var recentArticle ={
            field: 'visit_number',
            pageIndex: 0,
            pageSize: 5
        }
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
    })

})()





var url = {
    articleList: function () {
        return '/blogs/article/articleList';
    }
}
var bindingData = {
    articleList: function (list) {
        console.log(list)
        var html = '';
        for (var i in list) {
            var time = list[i].createTime;
            html += '<div class="artucleDiv">' +
                '<h3><a>' + list[i].articleTitle + '</a></h3>' +
                '<div>' +
                '<span class="glyphicon glyphicon-calendar"></span>' +
                '<span class="describe">' + time.substring(0, time.length - 2) + '</span>' +
                '<span class="glyphicon glyphicon-folder-open"></span>' +
                '<span class="describe">' + list[i].articleTypeName + '</span>' +
                '<span class="glyphicon glyphicon-eye-open"></span>' +
                '<span class="describe">' + list[i].visitNumber + '</span>' +
                '<span class="glyphicon glyphicon-edit"></span>' +
                '<span class="describe">' + list[i].estimateNumber + '</span>' +
                '</div>' +
                '</div>';
        }
        $('#content').append(html);
    }
}
var getData = {
    getArticleList: function (pageIndex, pageSize) {
        $.get(url.articleList(), {
            field: 'visit_number',
            pageIndex: pageIndex,
            pageSize: pageSize
        }, function (result) {
            if (result && result['success']) {
                bindingData.articleList(result['data']);
            } else {
                console.log(result['error']);
            }
        });
    }
}
getData.getArticleList(0,5);
