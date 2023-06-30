<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<div>
    <form action="/san-pham/search">
        tên: <input name="ten"/>
        <br>
        max: <input name="ten"/>
        <br>
        min: <input name="ten"/>
        <button type="submit">Search</button>
    </form>
</div>
<br>

<div>
    <form:form action="/dong-vat/add" method="POST" modelAttribute="dv">
        mã: <form:input path="ma" value="${dv.ma}"/>
        <form:errors path="ma"/>
        <br>
        Khu vực sống:<select name="khuVuc">
        <option value="1" ${ dv.khuVuc == "1" ? "selected" : "" }>CV01</option>
        <option value="2" ${ dv.khuVuc == "2" ? "selected" : "" }>CV02</option>
        <option value="3" ${ dv.khuVuc == "3" ? "selected" : "" }>CV03</option>
        <option value="4" ${ dv.khuVuc == "4" ? "selected" : "" }>CV04</option>
        </select>
        <br>
        Tên: <form:input path="ten" value="${dv.ten}"/>
        <form:errors path="ten"/>
        <br>
        cân nặng: <form:input path="canNang" value="${dv.canNang}"/>
        <form:errors path="canNang"/>
        <br>
        Giới tính:
        <input type="radio" name="gioiTinh" checked value="true"/>Nam
        <input type="radio" name="gioiTinh" value="false"/>Nữ
        <br>

        <form:button type="submit">Add</form:button>
    </form:form>
</div>


<div>
    <table border=1>
        <thead>
        <tr>
            <th>STT</th>
            <th>ma</th>
            <th>khuvuc</th>
            <th>ten</th>
            <th>cannang</th>
            <th>gioitinh</th>
            <th colspan="2">Action</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach items="${lists}" var="dv" varStatus="stt">
            <tr>
                <td>${stt.index+1}</td>
                <td>${dv.ma}</td>
                <td>${dv.khuVuc}</td>
                <td>${dv.ten}</td>
                <td>${dv.canNang}</td>
                <td>${dv.gioiTinh}</td>
                <td>
                    <button><a href="/dong-vat/remove/${dv.ma}">Delete </a></button>
                    <button><a href="/dong-vat/view-update/${dv.ma}">Update </a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>