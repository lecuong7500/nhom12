/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThuVien;

public class SachThamKhao  extends Sach {
   
    private float thue;
public SachThamKhao() {
        super();
    }
    public SachThamKhao(float thue, String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super(maSach, nhaXuatBan, donGia, soLuong);
        this.thue = thue;
    }
    public SachThamKhao(String maSach, String nhaXuatBan, double donGia, int soLuong) {
        super(maSach, nhaXuatBan, donGia, soLuong);
        this.thue = 10;
    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }
    public double getPrice(){
    
    return (super.getDonGia()*super.getSoLuong())+(super.getSoLuong()*super.getDonGia())*thue/100;
    }

    @Override
    public String toString() {
        return super.toString() + thue;
    }
     
    
}
