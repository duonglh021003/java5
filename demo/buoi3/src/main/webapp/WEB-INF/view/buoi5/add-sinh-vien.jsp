<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--<form action="/sinh-vien/add" method="post">--%>
<%--    MSSV: <input type="text" name="mssv"/>--%>
<%--    <br/>--%>
<%--    Tên: <input type="text" name="ten"/>--%>
<%--    <br/>--%>
<%--    Tuổi: <input type="text" name="tuoi"/>--%>
<%--    <br/>--%>
<%--    Địa chỉ: <input type="text" name="diaChi"/>--%>
<%--    <br/>--%>
<%--    Giới tính:--%>
<%--    <input type="radio" name="gioiTinh" checked value="true"/>Nam--%>
<%--    <input type="radio" name="gioiTinh" value="false"/>Nữ--%>
<%--    <br/>--%>
<%--    <button type="submit">Add</button>--%>
<%--</form>--%>

<form:form action="/sinh-vien/add" method="POST" modelAttribute="sv">
    MSSV: <form:input path="mssv"/>
    <form:errors path="mssv"/>

    <br>
    Tên: <form:input path="ten"/>
    <form:errors path="ten"/>
    <br>
    Tuổi: <form:input path="tuoi"/>
    <form:errors path="tuoi"/>
    <br>
    Địa chỉ: <form:input path="diaChi"/>
    <form:errors path="diaChi"/>
    <br>
    Giới tính:
    <form:radiobutton checked ="true" value="true" path="gioiTinh"/>Nam
    <form:radiobutton value="false" path="gioiTinh"/>Nu
    <br>
    <form:button type="submit">Add</form:button>
</form:form>
</body>
</html>
