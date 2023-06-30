package com.example.demo.buoi3.service;

import com.example.demo.buoi3.entity.SinhVien;

import java.util.List;

public interface SinhVienService {

    List<SinhVien> getAll();

    void addSinhVien(SinhVien sv);

    SinhVien detailSinhVien(String ma);

    void deleteSinhVien(String ma);

    void update(SinhVien sv, String ma);

}
