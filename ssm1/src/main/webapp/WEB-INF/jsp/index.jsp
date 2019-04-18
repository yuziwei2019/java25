
<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2019/4/18
  Time: 14:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <head>
        <title>Title</title>
        <link rel="stylesheet" href="/css/bootstrap-3.3.4.css"/>
        <script src="/js/jquery-1.10.2.js"></script>
        <script src="/js/jqPaginator.js"></script>
    </head>
<body>
<div class="container">
    <table class="table">
        <tr>
            <td>学号</td>
            <td>姓名</td>
            <td>班级号</td>
            <td>操作</td>

        </tr>

        <c:forEach items="${userPageInfo.list}" var="s">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.sid}</td>
                <td>
                    <button type="button" name="shanchu" onclick="fun3(${s.id})">删除</button>
                    <button type="button" name="xiugai" onclick="fun2(${s.id})">修改</button>
                </td>
            </tr>
        </c:forEach>

    </table>
    <button type="button" name="zengjia" onclick="fun1()">增加</button>

    <!-- 分页的导航栏 -->
    <div class="pagination-layout">

        <div class="pagination">
            <ul class="pagination">

            </ul>


        </div>
    </div>


</div>

<script>

    window.onload = function() {
        var if_fistime = true;
        $(".pagination")
            .jqPaginator(
                {
                    totalPages : ${userPageInfo.pages},
                    visiblePages : 5,
                    currentPage : ${userPageInfo.pageNum},
                    first : '<li class="first"><a href="javascript:void(0);">第一页</a></li>',
                    prev : '<li class="prev"><a href="javascript:void(0);">上一页</a></li>',
                    next : '<li class="next"><a href="javascript:void(0);">下一页</a></li>',
                    last : '<li class="last"><a href="javascript:void(0);">最后一页</a></li>',
                    page : '<li class="page"><a href="javascript:void(0);">{{page}}</a></li>',

                    onPageChange : function(num) {

                        /* alert(num); */
                        if (if_fistime) {
                            if_fistime = false;
                        } else {
                            changePage(num);
                        }

                    }

                })

    }

    function changePage(num) {

        window.location.href = "Hello?pageNum=" + num;
    }

    function fun1() {
        window.location.href = "zengjia1";
    }


    function fun3(id) {
        window.location.href = "shanchu?id="+id;
    }

    function fun2(id) {
        window.location.href = "update1?id="+id;
    }



</script>


</body>
</html>
