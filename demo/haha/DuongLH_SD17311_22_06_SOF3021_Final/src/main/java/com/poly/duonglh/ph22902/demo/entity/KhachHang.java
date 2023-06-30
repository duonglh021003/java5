package com.poly.duonglh.ph22902.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "KhachHang")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class KhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaKhachHang")
    private Long ma;

    @Column(name = "TenKhachHang")
    @NotBlank(message = "tên không được trống!")
    private String ten;

    @Column(name = "SoDienThoai")
    @NotBlank(message = "sdt không được trống!")
    private String sdt;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HangKhachHang",referencedColumnName = "MaHang")
    private HangKhachHang hangKhachHang;

}
