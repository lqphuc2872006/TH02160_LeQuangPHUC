package com.example.th02160_LeQuangPhuc.Test;

import com.example.th02160_LeQuangPhuc.Sach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Bai2Test {
    SachServices sachServices = new SachServices();
    @Test
    public void UpdateTC(){
        Sach sach = new Sach("S1","Phuc","Phuc",2006,10000);
        sachServices.add(sach);

        Sach sachupdate = new Sach("S1","Huan","Phuc",2006,10000);
        sachServices.update("S1",sachupdate);
    }
    @Test
    public void UpdateTG(){
        Sach sach = new Sach("S1","Phuc","Phuc",2006,10000);
        sachServices.add(sach);

        Sach sachupdate = new Sach("S1","Phuc","Sasuke",2006,10000);
        sachServices.update("S1",sachupdate);
    }
    @Test
    public void UpdateNXB(){
        Sach sach = new Sach("S1","Phuc","Phuc",2006,10000);
        sachServices.add(sach);

        Sach sachupdate = new Sach("S1","Huan","Phuc",2025,10000);
        sachServices.update("S1",sachupdate);
    }
    @Test
    public void UpdateGia(){
        Sach sach = new Sach("S1","Phuc","Phuc",2006,10000);
        sachServices.add(sach);

        Sach sachupdate = new Sach("S1","Huan","Phuc",2006,50000);
        sachServices.update("S1",sachupdate);
    }
    @Test
    public void NullSach(){
        Exception exp = assertThrows(IllegalArgumentException.class, () -> sachServices.update("S1",null));
        assertEquals("check null",exp.getMessage());
    }
}