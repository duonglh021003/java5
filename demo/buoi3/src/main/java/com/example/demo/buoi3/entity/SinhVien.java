package com.example.demo.buoi3.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder // tao ra contructor co so luong tham so tuy y
// neu truyen vao 1 tham so  => contructor 1 tham so
public class SinhVien {

    @NotEmpty(message = "ch nhap ma")
    @Size(min = 5,message = "toi thieu bang 5")
    private String mssv;

    @NotNull(message = "ten k dc rong")
    @Pattern(regexp = "[a-z A-Z]+",message = "ten khong dung dinh dang")
    @Size(max = 10,message = "ten phai < 10 ky tu")
    private String ten;

    @NotNull
    @Min(20)
    @Max(50)
    private Integer tuoi;

    private String diaChi;

    private Boolean gioiTinh;

}
