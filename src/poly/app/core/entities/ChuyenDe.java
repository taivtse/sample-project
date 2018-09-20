package poly.app.core.entities;
// Generated Sep 20, 2018 2:53:45 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * ChuyenDe generated by hbm2java
 */
public class ChuyenDe  implements java.io.Serializable {


     private String maCd;
     private String tenCd;
     private int hocPhi;
     private int thoiLuong;
     private String hinh;
     private String moTa;
     private Set<KhoaHoc> khoaHocs = new HashSet<KhoaHoc>(0);

    public ChuyenDe() {
    }

	
    public ChuyenDe(String maCd, String tenCd, int hocPhi, int thoiLuong, String hinh, String moTa) {
        this.maCd = maCd;
        this.tenCd = tenCd;
        this.hocPhi = hocPhi;
        this.thoiLuong = thoiLuong;
        this.hinh = hinh;
        this.moTa = moTa;
    }
    public ChuyenDe(String maCd, String tenCd, int hocPhi, int thoiLuong, String hinh, String moTa, Set<KhoaHoc> khoaHocs) {
       this.maCd = maCd;
       this.tenCd = tenCd;
       this.hocPhi = hocPhi;
       this.thoiLuong = thoiLuong;
       this.hinh = hinh;
       this.moTa = moTa;
       this.khoaHocs = khoaHocs;
    }
   
    public String getMaCd() {
        return this.maCd;
    }
    
    public void setMaCd(String maCd) {
        this.maCd = maCd;
    }
    public String getTenCd() {
        return this.tenCd;
    }
    
    public void setTenCd(String tenCd) {
        this.tenCd = tenCd;
    }
    public int getHocPhi() {
        return this.hocPhi;
    }
    
    public void setHocPhi(int hocPhi) {
        this.hocPhi = hocPhi;
    }
    public int getThoiLuong() {
        return this.thoiLuong;
    }
    
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    public String getHinh() {
        return this.hinh;
    }
    
    public void setHinh(String hinh) {
        this.hinh = hinh;
    }
    public String getMoTa() {
        return this.moTa;
    }
    
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public Set<KhoaHoc> getKhoaHocs() {
        return this.khoaHocs;
    }
    
    public void setKhoaHocs(Set<KhoaHoc> khoaHocs) {
        this.khoaHocs = khoaHocs;
    }
}

