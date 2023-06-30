package com.poly.duonglh.ph22902.demo.repository;

import com.poly.duonglh.ph22902.demo.entity.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HangKhachHangRepository extends JpaRepository<HangKhachHang, Long> {
}
