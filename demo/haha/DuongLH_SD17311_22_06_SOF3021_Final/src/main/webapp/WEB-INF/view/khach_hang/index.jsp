<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>
<header><h2 style="text-align: center;">Quản Lý Nhân Viên</h2></header>

<form:form action="/khach-hang/add" method="POST" modelAttribute="khachHang">


    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="mb-3">
                <label class="form-label">hạng khách hàng</label>
                <select name="hangKhachHang">
                    <c:forEach items="${listHangKhachHang}" var="hangKhachHang">
                        <option value="${hangKhachHang.ma}">${hangKhachHang.ten}</option>
                    </c:forEach>
                </select>
                <span>${khachHang.hangKhachHang.ten}</span>
            </div>
        </div>
        <div class="col-md-4"></div>
    </div>

    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="mb-3">
                <label class="form-label">tên</label>
                <form:input path="ten" class="form-control"/>
                <form:errors path="ten" cssStyle="color: red"/><br>
            </div>
        </div>
        <div class="col-md-4"></div>
    </div>

    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="mb-3">
                <label class="form-label">sdt</label>
                <form:input path="sdt" class="form-control"/>
                <form:errors path="sdt" cssStyle="color: red"/><br>
            </div>
        </div>
        <div class="col-md-4"></div>
    </div>

    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <div class="mb-3">
                <label class="form-label">giới tính</label>
                <input type="radio" name="gioiTinh" value="true" ${khachHang.gioiTinh == "true" ? "checked" : ""} checked=""/>nam
                <input type="radio" name="gioiTinh" value="false" ${khachHang.gioiTinh == "false" ? "checked" : ""}/>nữ

            </div>
        </div>
        <div class="col-md-4"></div>
    </div>

    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-6">
            <div class="mb-3">
                <form:button type="submit" class="btn btn-primary" onclick="add()">Add</form:button>
            </div>
        </div>
        <div class="col-md-3"></div>
    </div>


</form:form>



<main>
    <section>
        <div class="container">
            <table class="table">
                <thead>
                <tr>
                    <th scope="col">STT</th>
                    <th scope="col">tên khách hàng</th>
                    <th scope="col">số điện thoại</th>
                    <th scope="col">giới tính</th>
                    <th scope="col">tên hạng</th>
                    <th scope="col">action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${ listKhachHang }" var="khachHang" varStatus="stt">
                    <tr>
                        <td>${stt.index+1}</td>
                        <td>${khachHang.ten}</td>
                        <td>${khachHang.sdt}</td>
                        <td>${khachHang.gioiTinh == true ? "nam" : "nữ"}</td>
                        <td>${khachHang.hangKhachHang.ten}</td>

                        <td>
                            <a class="btn btn-default" href="/khach-hang/detail?ma=${khachHang.ma}">detail</a>
                            <a class="btn btn-default" href="/khach-hang/view-update?id=${staff.id}">update</a>
                            <a class="btn btn-default" href="/khach-hang/delete?ma=${khachHang.ma}"
                                onclick="if(!confirm('Bạn có muốn xoá?')){return false}else{alert('xoá thành công');}" >delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </section>
</main>

<script>
    function add(){
        if(!confirm('Bạn có muốn thêm?')){
            return false
        }else{
            alert('Thêm thành công');
        }
    }
</script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
