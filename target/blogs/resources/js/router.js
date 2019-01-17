app.config(function($stateProvider, $urlRouterProvider){
    var url='resources/html/';
    $urlRouterProvider.otherwise('/index');
    $stateProvider
        .state('index',{
            url: '/index',
            templateUrl: url+'articleList.html',
            controller: 'articleListController'
        })
        .state('java',{
            url: '/java',
            template: '<h1>java</h1>'
        })
        .state('linux',{
            url: '/linux',
            template: '<h1>Linux</h1>'
        });
})