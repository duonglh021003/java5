<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">


</head>
<body>
<form:form action="/co-so/update/${coSo.id}"  modelAttribute="coSo">
    <label class="form-label">mã cơ sở</label>
    <form:input path="ma" /> <br>

    <label class="form-label">mã tk</label>
    <span>${coSo.taiKhoan.ma}</span> <br>


    <label class="form-label">sdt</label>
    <form:input path="sdt" /> <br>

    <label class="form-label">ngaỳ tạo</label>
    <form:input path="ngayTao" /> <br>

    <label class="form-label">trạng thái</label>
    <form:input path="trangThai" /> <br>

    <button type="submits">update</button>

</form:form>


</body>
</html>
