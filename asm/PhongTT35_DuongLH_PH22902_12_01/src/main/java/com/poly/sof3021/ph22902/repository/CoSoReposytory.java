package com.poly.sof3021.ph22902.repository;

import com.poly.sof3021.ph22902.entity.CoSo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CoSoReposytory extends JpaRepository<CoSo, UUID> {
}
