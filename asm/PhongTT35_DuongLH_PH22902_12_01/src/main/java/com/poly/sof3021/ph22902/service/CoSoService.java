package com.poly.sof3021.ph22902.service;

import com.poly.sof3021.ph22902.entity.CoSo;

import java.util.List;
import java.util.UUID;

public interface CoSoService {

    List<CoSo> getAll();

    void delete(UUID id);

    CoSo detail(UUID id);


}
