package com.example.demo.buoi3.service.impl;

import com.example.demo.buoi3.entity.SinhVien;
import com.example.demo.buoi3.service.SinhVienService;

import java.util.ArrayList;
import java.util.List;

public class SinhVienServiceImpl implements SinhVienService {

    private List<SinhVien> sinhViens = new ArrayList<>();

    public SinhVienServiceImpl() {

        sinhViens.add((new SinhVien("ph1001","aaa",4,"aaa",true)));
        sinhViens.add((new SinhVien("ph1002","aaa",4,"aaa",true)));
        sinhViens.add((new SinhVien("ph1003","aaa",4,"aaa",false)));
        sinhViens.add((new SinhVien("ph1004","aaa",4,"aaa",true)));
        sinhViens.add((new SinhVien("ph1005","aaa",4,"aaa",false)));

    }

    @Override
    public List<SinhVien> getAll() {
        return sinhViens;
    }

    @Override
    public void addSinhVien(SinhVien sv) {
        sinhViens.add(sv);
    }



    @Override
    public SinhVien detailSinhVien(String ma) {
        for(SinhVien sv : sinhViens){
            if(sv.getMssv().equalsIgnoreCase(ma)){
                return sv;
            }
        }
        return null;
    }
    @Override
    public void deleteSinhVien(String ma) {
        SinhVien sv = detailSinhVien(ma);
        sinhViens.remove(sv);

    }

    @Override
    public void update(SinhVien sv, String ma) {
        SinhVien sinhVien= detailSinhVien(ma);
        sinhVien.setMssv(sv.getMssv());
        sinhVien.setTen(sv.getTen());
        sinhVien.setTuoi(sv.getTuoi());
        sinhVien.setDiaChi(sv.getDiaChi());
        sinhVien.setGioiTinh(sv.getGioiTinh());
    }



    public class SearchModel {
        public ArrayList<String> searchData(ArrayList<String> data, String keyword) {
            // Tìm kiếm trong danh sách các ngôn ngữ lập trình
            ArrayList<String> results = new ArrayList<String>();
            for (String item : data) {
                if (item.toLowerCase().contains(keyword.toLowerCase())) {
                    results.add(item);
                }
            }
            return results;
        }
    }

}
