package com.poly.tiennh21.ph22902.service.DongVatServiceImpl;

import com.poly.tiennh21.ph22902.entity.DongVat;
import com.poly.tiennh21.ph22902.service.DongVatService;

import java.util.ArrayList;
import java.util.List;

public class DongVatServiceImpl implements DongVatService {

    List<DongVat> dongVats = new ArrayList<>();

    public DongVatServiceImpl(){
        dongVats.add(new DongVat("ma1","1","aaa",10.5,true));
        dongVats.add(new DongVat("ma2","2","aaa",10.5,false));
        dongVats.add(new DongVat("ma3","3","aaa",10.5,true));
        dongVats.add(new DongVat("ma4","2","aaa",10.5,true));
        dongVats.add(new DongVat("ma5","1","aaa",10.5,true));
    }

    @Override
    public List<DongVat> getAll() {
        return dongVats;
    }

    @Override
    public DongVat getByMa(String ma) {
        for(DongVat dv : dongVats){
            if(dv.getMa().equalsIgnoreCase(ma)){
                return dv;
            }
        }
        return null;
    }

    @Override
    public void delete(String ma) {
        DongVat dv = getByMa(ma);
        dongVats.remove(dv);
    }

    @Override
    public void add(DongVat dv) {
        dongVats.add(dv);
    }
}
