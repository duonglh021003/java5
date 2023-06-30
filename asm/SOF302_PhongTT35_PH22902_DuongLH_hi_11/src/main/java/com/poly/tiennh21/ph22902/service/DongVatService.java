package com.poly.tiennh21.ph22902.service;

import com.poly.tiennh21.ph22902.entity.DongVat;

import java.util.List;

public interface DongVatService {

    List<DongVat> getAll();

    DongVat getByMa(String ma);

    void delete(String ma);

    void add(DongVat dv);
}
