<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/articleList1.css"/>
<body>
<div id="list" class="artucleList">
</div>
<div class="right">
    <div class="module">
       <div class="title">
           <span class="glyphicon glyphicon-time"></span>
           <span>最近文章</span>
       </div>
        <ol id="recentArticle" >
        </ol>
    </div>
    <div class="module">
        <div class="title">
            <span class="glyphicon glyphicon-tags"></span>
            <span>标签</span>
        </div>
        <div id="tags" class="tags">
        </div>
    </div>
    <div id="friendshipLink" class="module">
        <div class="title">
            <span class="glyphicon glyphicon-heart"></span>
            <span>友情链接</span>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/1articleList.js"></script>
<script type="text/javascript">
    articleList.main.init();
</script>
</html>
