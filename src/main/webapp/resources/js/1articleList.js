var articleList={
    url:{
        articleList:function () {
            return '/blogs/article/articleList';
        },
        tagsList:function () {
            return '/blogs/tags/findAllTags';
        }
    },
    main:{
        init:function () {
            var pageIndex=0;
            var pageSize=5;
            articleList.getData.getArticleList(pageIndex,pageSize);
            articleList.getData.getRecentArticle();
            articleList.getData.getTags();
        }
    },
    getData:{
        getArticleList:function (pageIndex,pageSize) {
            $.get(articleList.url.articleList(),{field:'visit_number',pageIndex:pageIndex,pageSize:pageSize},function (result) {
                if (result&&result['success']){
                    articleList.bindingData.articleList(result['data']);
                }else{
                    console.log(result['error']);
                }
            });
        },
        getRecentArticle:function () {
            $.get(articleList.url.articleList(),{field:'create_time',pageIndex:0,pageSize:10},function (result) {
                if (result&&result['success']){
                    articleList.bindingData.recentArticle(result['data']);
                }else{
                    console.log(result['error']);
                }
            });
        },
        getTags:function () {
            $.get(articleList.url.tagsList(),{},function (result) {
                if (result&&result['success']){
                    articleList.bindingData.tags(result['data']);
                }else{
                    console.log(result['error']);
                }
            });
        },
    },
    bindingData:{
        articleList:function (list) {
            console.log(list);
            var html='';
            for(var i in list){
                var time =list[i].createTime;
                html+='<div class="artucleDiv">' +
                    '<h3><a>'+list[i].articleTitle+'</a></h3>' +
                    '<div>' +
                    '<span class="glyphicon glyphicon-calendar"></span>' +
                    '<span class="describe">'+time.substring(0,time.length-2)+'</span>' +
                    '<span class="glyphicon glyphicon-folder-open"></span>' +
                    '<span class="describe">'+list[i].articleTypeName+'</span>' +
                    '<span class="glyphicon glyphicon-eye-open"></span>' +
                    '<span class="describe">'+list[i].visitNumber+'</span>' +
                    '<span class="glyphicon glyphicon-edit"></span>' +
                    '<span class="describe">'+list[i].estimateNumber+'</span>' +
                    '</div>' +
                    '</div>';
            }
            $('#list').append(html);
        },
        recentArticle:function (list) {
            var html ='';
            for(var i in list){
                html+='<li><a href="#">'+list[i].articleTitle+'</a></li>';
            }
            $('#recentArticle').html(html);
        },
        tags:function (list) {
            var html ='';
            for(var i in list){
                html+='<span class="label" style="background-color: '+list[i].tagsColor+'">'+list[i].tagsName+'</span>';
            }
            $('#tags').append(html);
        }
    }
}