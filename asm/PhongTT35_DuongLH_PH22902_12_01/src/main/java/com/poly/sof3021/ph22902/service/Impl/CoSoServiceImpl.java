package com.poly.sof3021.ph22902.service.Impl;

import com.poly.sof3021.ph22902.entity.CoSo;
import com.poly.sof3021.ph22902.repository.CoSoReposytory;
import com.poly.sof3021.ph22902.service.CoSoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CoSoServiceImpl implements CoSoService {

    @Autowired
    private CoSoReposytory coSoReposytory;

    @Override
    public List<CoSo> getAll() {
        return coSoReposytory.findAll();
    }

    @Override
    public void delete(UUID id) {
        coSoReposytory.deleteById(id);
    }

    @Override
    public CoSo detail(UUID id) {
        return coSoReposytory.getById(id);
    }
}
