package com.example.th02160_LeQuangPhuc.Test;

import java.util.ArrayList;
import java.util.List;

public class Chiahetcho5 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> Chiahetcho5(String check){
        if (check == null){
            throw new IllegalArgumentException("check null");
        }
        for (int i = 0; i <= 100 ; i++) {
            if (i % 5 == 0){
                continue;
            } else {
                list.add(i);
            }
        }
        return list;
    }
}
