<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 style="text-align: center">Quản lý cơ sở</h3>
<div>
    from: <input type="date">
    to: <input type="date">
    <button>search</button>
</div>

<table border="1">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Mã cơ sở</th>
        <th scope="col">mã tài khoản</th>
        <th scope="col">sdt</th>
        <th scope="col">ngày tạo</th>
        <th scope="col">trạng thái</th>
        <th scope="col">action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ listCoSo }" var="coSo" varStatus="stt">
        <tr>
            <td>${stt.index+1}</td>

            <td>${coSo.ma}</td>
            <td>${coSo.taiKhoan.ma}</td>
            <td>${coSo.sdt}</td>
            <td>${coSo.ngayTao}</td>
            <td>${coSo.trangThai == 0 ? "hoạt động" : "ngừng hoạt động"}</td>

            <td>
                <a href="/co-so/detail/${coSo.id}">detail</a>
                <a href="/co-so/view-update?id=${coSo.id}">update</a>
                <a  href="/co-so/delete/${coSo.id}"
                   onclick="if(!confirm('Bạn có muốn xoá?')){return false}else{alert('xoá thành công');}" >delete</a>

            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
