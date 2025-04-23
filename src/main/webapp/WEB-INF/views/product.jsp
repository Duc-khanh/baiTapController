<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Danh sách sản phẩm</h2>
<table border="1px">
    <tr>
        <td>id</td>
        <td>Tên Sản Phẩm</td>
        <td>Giá</td>
    </tr>
    <c:forEach items="${products}" var="product" varStatus="status">
        <tr>
            <td>${status.index+1}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
