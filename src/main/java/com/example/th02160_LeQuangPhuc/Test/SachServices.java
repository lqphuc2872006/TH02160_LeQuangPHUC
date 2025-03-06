package com.example.th02160_LeQuangPhuc.Test;

import com.example.th02160_LeQuangPhuc.Sach;

import java.util.ArrayList;
import java.util.List;

public class SachServices {
       List<Sach> list  = new ArrayList<Sach>();
    public String add(Sach sach){
        list.add(sach);
        return "add thanh cong";
    }

    public String update(String id, Sach sach){
        if (sach == null){
            throw  new IllegalArgumentException("check null");
        }
        for (int i = 0; i < list.size() ; i++) {
            list.get(i).getMaSach().equals(id);
            list.set(i,sach);
        }
        return "ko tim thay Ma";
    }
}
