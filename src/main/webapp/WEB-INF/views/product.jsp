<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Danh sách sản phẩm</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>

<form action="/search" method="get">
    <input type="text" name="keyword" placeholder="Nhập từ khóa tìm kiếm" />
    <button type="submit">Tìm kiếm</button>
</form>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Hành động</th>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>
                <a href="/deleteProduct?id=${p.id}">
                    Xóa

                </a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
