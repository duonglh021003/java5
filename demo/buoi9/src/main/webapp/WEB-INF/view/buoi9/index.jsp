<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div style="border: 1px solid black;width: 250px">
    <form action="">
        category:
        <br>
        <input type="text" name="id"/>
        <br>
        category code:
        <br>
        <input type="text" name="categoryCode"/> <br>
        <button type="submit">Search</button>
        <br>
    </form>

</div>

<form action="/category/add" method="post">
    code: <input type="text" name="categoryCode"/>
    <br/>
    name: <input type="text" name="categoryName"/>

    <br/>
    <button type="submit">Add</button>
</form>


<table border="1">

    <br/>
    <tr>
        <th>stt</th>
        <th>code</th>
        <th>name</th>
        <th colspan="2">Action</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${listCategory}" var="category " varStatus="stt">
        <tr>

            <td>${stt.index+1}</td>
            <td>${category.code}</td>
            <td>${category.name}</td>
            <td>
                <button><a href="/category/delete?id=${ sv.id }">remove</a></button>
                <button><a href="/category/view-update?id=${ sv.id }">edit</a></button>
            </td>

        </tr>
    </c:forEach>
    </tbody>
</table>


</body>
</html>