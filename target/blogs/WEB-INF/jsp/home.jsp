<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>主页</title>
</head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/articleList.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top transparent">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">TZ</a>
        </div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav" id="meun">
                <c:forEach var="ml" items="${meunList}">
                    <li>
                        <a href="#">${ml.meunName}</a>
                    </li>
                </c:forEach>
            </ul>
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="searchinput" placeholder="请输入...">
                </div>
                <button type="submit" class="searchbtn">搜索</button>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <a href="#" class="management">
                        <span class="glyphicon glyphicon-cog"></span>
                        <span>管理</span>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="content">
    <c:if test="">

    </c:if>
    <%@include file="articleList.jsp"%>
</div>
<div class="bottom transparent">
</div>
</body>
</html>