package com.poly.tiennh21.ph22902.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class DongVat {

    @NotEmpty(message = "bạn chưa nhâp mã")
    @NotNull(message = "null")
    private String ma;

    private String khuVuc;

    @NotEmpty(message = "bạn chưa nhâp mã")
    private String ten;

    @NotNull(message = "bạn chưa nhập cân nặng")
    private Double canNang;

    private Boolean gioiTinh;
}
