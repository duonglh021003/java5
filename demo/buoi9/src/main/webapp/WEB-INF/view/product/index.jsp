<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/product/add" method="post">
    code: <input type="text" name="code"/>
    <br/>
    name: <input type="text" name="name"/>
    <br/>
    price: <input type="text" name="price"/>
    <br/>
    description: <input type="text" name="description"/>
    <br/>
    Category_name:
    <select name="categoryy" class="form-select"  >
        <c:forEach items="${ listCategory }" var="category">
            <option value="${ category.id }">${ category.name }</option>
        </c:forEach>
    </select>
    <br/>
    <button type="submit">Add</button>
</form>

<table border="1">

    <br/>
    <tr>
        <th>stt</th>
        <th>code</th>
        <th>name</th>
        <th>price</th>
        <th>category code</th>
        <th>category name</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${listProduct}" var="product" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>
            <td>${product.code}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.category.code}</td>
            <td>${product.category.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>