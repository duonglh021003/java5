
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/category/update">
    id: <input type="text" name="id" value="${sv.id}" disabled/>
    <br>
    code: <input type="text" name="categoryCode" value="${sv.categoryCode}"/>
    <br/>
    name: <input type="text" name="categoryName" value="${sv.categoryName}"/>
    <br/>
    <button>Update</button>
</form>

</body>
</html>
