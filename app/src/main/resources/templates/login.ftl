<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8"/>
    <title>登录</title>
    <link rel="stylesheet" th:href="@{css/bootstrap.min.css}"/>
    <link rel="stylesheet" th:href="@{css/signin.css}"/>
    <style type="text/css">
        body {
            padding-top: 50px;
        }

        .starter-template {
            padding: 40px 15px;
            text-align: center;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Spring Security演示</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a th:href="@{/}">首页</a></li>
                <li><a th:href="@{http://www.baidu.com}">百度</a></li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <div class="starter-template">
        <p th:if="${param.logout}" class="bg-warning">已注销</p>
        <p th:if="${param.error}" class="bg-danger">有错误，请重试</p>
        <h2>使用账号密码登录</h2>
        <form class="form-signin" role="form" name="form" th:action="@{/login}" action="/login" method="post">
            <div class="form-group">
                <label for="username">账号</label>
                <input type="text" class="form-control" name="username" value="" placeholder="账号"/>
            </div>
            <div class="form-group">
                <label for="password">密码</label>
                <input type="password" class="form-control" name="password" placeholder="密码"/>
            </div>
            <input type="submit" id="login" value="Login" class="btn btn-primary"/>
        </form>
    </div>
</div>
</body>
</html>