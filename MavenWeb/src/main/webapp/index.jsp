<%@page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="com.wp.vo.User" %>
<%@page isELIgnored="false" %>
<%
    List all = (List)request.getAttribute("userlist");
    Iterator it = all.iterator();
%>

<html>
    <head>
        <title>用户列表</title>
        <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
        <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <div class="navbar-collapse collapse">
        <ul class="nav navbar-nav">
            <li><a href="#"><span class="glyphicon glyphicon-user"></span> 用户管理</a></li>
            <li><a href="/MavenWeb/userlist"><span class="glyphicon glyphicon-lock"></span> 管理员</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-list"></span> 栏目设置</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-cog"></span> 网站设置</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <li>
                <a href="#">
                    <span class="glyphicon glyphicon-envelop"></span> Wp
                </a>
            </li>
            <li>
                <a href="#">
                    <span class="glyphicon glyphicon-log-out"></span> 退出
                </a>
            </li>
        </ul>
    </div>
    <body>
        <table class="table table-bordered table-striped">
            <tr>
                <th>编号</th>
                <th>姓名</th>
                <th>生日</th>
                <th>性别</th>
                <th width="20%">操作</th>
            </tr>

            <%
                while(it.hasNext()){
                    Object vo = it.next();
                    pageContext.setAttribute("user",vo);
            %>
            <tr>
                <td>${user.s_id}</td>
                <td>${user.s_name}</td>
                <td>${user.s_birth}</td>
                <td>${user.s_sex}</td>
                <td>
                    <!--btn-primary:原始按钮样式（未被操作） btn-xs:	制作一个超小按钮-->
                    <a href="" class="btn btn-primary btn-xs">
                        <!--glyphicon:字体图标-->
                        <span class="glyphicon glyphicon-info-sign"></span> 详情
                    </a>
                    <a href="" class="btn btn-info btn-xs">
                        <span class="glyphicon glyphicon-edit"></span> 编辑
                    </a>
                    <a href="" class="btn btn-danger btn-xs">
                        <span class="glyphicon glyphicon-remove"></span> 删除
                    </a>
                </td>
            </tr>

            <%
                }
            %>
        </table>

        <ul class="pagination pagination-lg" style="position:relative; left:50%; float:left;">
            <li>
                <a href="#" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li>
                <a href="#" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </body>
</html>
