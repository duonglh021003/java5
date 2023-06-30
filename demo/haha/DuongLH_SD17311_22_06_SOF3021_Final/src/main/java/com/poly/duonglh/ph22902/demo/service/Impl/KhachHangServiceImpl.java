package com.poly.duonglh.ph22902.demo.service.Impl;

import com.poly.duonglh.ph22902.demo.entity.KhachHang;
import com.poly.duonglh.ph22902.demo.repository.KhachHangRepository;
import com.poly.duonglh.ph22902.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;

    @Override
    public List<KhachHang> getAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public void add(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void delete(Long ma) {
        khachHangRepository.deleteById(ma);
    }

    @Override
    public void update(KhachHang khachHang, Long ma) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public KhachHang detail(Long ma) {
        return khachHangRepository.getById(ma);
    }
}
