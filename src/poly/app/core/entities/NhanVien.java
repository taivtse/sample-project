package poly.app.core.entities;
// Generated Sep 21, 2018 5:51:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * NhanVien generated by hbm2java
 */
public class NhanVien  implements java.io.Serializable {


     private String maNv;
     private String matKhau;
     private String hoTen;
     private String email;
     private boolean vaiTro;
     private Set<KhoaHoc> khoaHocs = new HashSet<KhoaHoc>(0);
     private MaXacNhan maXacNhan;
     private Set<NguoiHoc> nguoiHocs = new HashSet<NguoiHoc>(0);

    public NhanVien() {
    }

	
    public NhanVien(String maNv, String matKhau, String hoTen, String email, boolean vaiTro) {
        this.maNv = maNv;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.email = email;
        this.vaiTro = vaiTro;
    }
    public NhanVien(String maNv, String matKhau, String hoTen, String email, boolean vaiTro, Set<KhoaHoc> khoaHocs, MaXacNhan maXacNhan, Set<NguoiHoc> nguoiHocs) {
       this.maNv = maNv;
       this.matKhau = matKhau;
       this.hoTen = hoTen;
       this.email = email;
       this.vaiTro = vaiTro;
       this.khoaHocs = khoaHocs;
       this.maXacNhan = maXacNhan;
       this.nguoiHocs = nguoiHocs;
    }
   
    public String getMaNv() {
        return this.maNv;
    }
    
    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }
    public String getMatKhau() {
        return this.matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isVaiTro() {
        return this.vaiTro;
    }
    
    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    public Set<KhoaHoc> getKhoaHocs() {
        return this.khoaHocs;
    }
    
    public void setKhoaHocs(Set<KhoaHoc> khoaHocs) {
        this.khoaHocs = khoaHocs;
    }
    public MaXacNhan getMaXacNhan() {
        return this.maXacNhan;
    }
    
    public void setMaXacNhan(MaXacNhan maXacNhan) {
        this.maXacNhan = maXacNhan;
    }
    public Set<NguoiHoc> getNguoiHocs() {
        return this.nguoiHocs;
    }
    
    public void setNguoiHocs(Set<NguoiHoc> nguoiHocs) {
        this.nguoiHocs = nguoiHocs;
    }




}


