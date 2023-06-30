package com.poly.duonglh.ph22902.demo.service;

import com.poly.duonglh.ph22902.demo.entity.KhachHang;

import java.util.List;

public interface KhachHangService {

    List<KhachHang> getAll();

    void add(KhachHang khachHang);

    void delete(Long ma);

    void update(KhachHang khachHang,Long ma);

    KhachHang detail(Long ma);
}
