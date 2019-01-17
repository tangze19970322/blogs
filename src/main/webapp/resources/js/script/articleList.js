var articleList={
    url:{
        articleList:function () {
            return '/blogs/article/articleList';
        }
    },
    main:{
        init:function () {
            var pageIndex=0;
            var pageSize=5;
            $.get(articleList.url.articleList(),{pageIndex:pageIndex,pageSize:pageSize},function (result) {
                if (result&&result['success']){
                    articleList.bindingList(result['data']);
                }else{
                    console.log(result['error']);
                }
            });
        }
    },
    bindingList:function (list) {
        var html='';
        for(var i in list){
            html+='<div class="titleDiv">' +
                '<h3>'+list[i].articleTitle+'</h3>' +
                '<div>' +
                '<span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>' +
                '<span class="describe">'+list[i].createTime+'</span>' +
                '<span class="glyphicon glyphicon-folder-open" aria-hidden="true"></span>' +
                '<span class="describe">'+list[i].articleTypeName+'</span>' +
                '</div></div>';
        }
        $('#list').append(html);
    }
}