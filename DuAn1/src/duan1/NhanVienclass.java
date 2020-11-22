/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan1;

import java.sql.Date;

/**
 *
 * @author dell
 */
public class NhanVienclass {
    String manv,hoten,sdt,password,socmt;
    String ngaysinh;
    boolean chucvu;

    public NhanVienclass() {
    }

    public NhanVienclass(String manv, String hoten, String sdt, String password, String socmt, String ngaysinh, boolean chucvu) {
        this.manv = manv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.password = password;
        this.socmt = socmt;
        this.ngaysinh = ngaysinh;
        this.chucvu = chucvu;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSocmt() {
        return socmt;
    }

    public void setSocmt(String socmt) {
        this.socmt = socmt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isChucvu() {
        return chucvu;
    }

    public void setChucvu(boolean chucvu) {
        this.chucvu = chucvu;
    }
    
    
   
}
