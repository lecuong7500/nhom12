/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyThuVien;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        ArrayList<SachThamKhao> arrSachThamKhao = new ArrayList<>();
        int soSachGiaoKhoa, soSachThamKhao;
        double tongTienSachGiaoKhoa = 0, tongTienSachThamKhao = 0, tongDonGiaSachThamKhao = 0, 
            trungBinhCongDonGia = 0;
        int x = 0;
        Scanner scanner = new Scanner(System.in);
         do{
          System.out.println("1.Nhap thong tin sach giao khoa");
          System.out.println("2.Nhap thong tin sach tham khao");
          System.out.println("3.Xuat thong tin");
          System.out.println("4.Tong tien sach giao khoa/Tong tien sach tham khao");
          System.out.println("5. Trung binh cong sach tham khao");
          System.out.println("6.Nhap 0 de thoat");
             x= scanner.nextInt();
         switch(x){
            
             case 1:
        System.out.println("Nhap thong tin sach giao khoa:");
         System.out.print("Nhap so sach giao khoa: ");
        soSachGiaoKhoa = scanner.nextInt();
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
            sachGiaoKhoa.nhapSach();
            arrSachGiaoKhoa.add(sachGiaoKhoa);
        }
         
       
        break;
             case 2: 
          System.out.println("Nhap thong tin sach tham khao:");
        System.out.print("Nhap so sach tham khao: ");
        soSachThamKhao = scanner.nextInt();
        for (int i = 0; i < soSachThamKhao; i++) {
            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
            SachThamKhao sachThamKhao = new SachThamKhao();
            sachThamKhao.nhapSach();
            arrSachThamKhao.add(sachThamKhao);
        }       
        break;
             case 3: 
           System.out.println("-----Thong tin sach giao khoa-----");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            System.out.println(arrSachGiaoKhoa.get(i).toString());
        }
         
        System.out.println("-----Thong tin sach tham khao-----");
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            System.out.println(arrSachThamKhao.get(i).toString());
        }
        break;
             case 4: 
                         for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia() * 50 / 100;
            } else if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
                    arrSachGiaoKhoa.get(i).getDonGia();
            }
        }
           System.out.println("Tong tien sach giao khoa = " + tongTienSachGiaoKhoa);
         
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            tongTienSachThamKhao += arrSachThamKhao.get(i).getSoLuong() * 
                arrSachThamKhao.get(i).getDonGia() + arrSachThamKhao.get(i).getThue();
        }
        System.out.println("Tong tien sach tham khao = " + tongTienSachThamKhao);
         
        System.out.println("-----Thong tin sach giao khoa-----");
        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
            System.out.println(arrSachGiaoKhoa.get(i).toString());
        }
        break;
             case 5: 
            System.out.println("---Trung binh cong don gia cac sach tham khao---");
        for (int i = 0; i < arrSachThamKhao.size(); i++) {
            tongDonGiaSachThamKhao += arrSachThamKhao.get(i).getDonGia();
            trungBinhCongDonGia = tongDonGiaSachThamKhao / arrSachThamKhao.size();
        }
        System.out.println("Trung binh cong don gia cac sach tham khao = " + trungBinhCongDonGia);
            break;     
                 
         }
         }while(x!=0);

    }
//            System.out.print("Nhap so sach giao khoa: ");
//        soSachGiaoKhoa = scanner.nextInt();
//        System.out.print("Nhap so sach tham khao: ");
//        soSachThamKhao = scanner.nextInt();
//         
//        System.out.println("Nhap thong tin sach giao khoa:");
//        for (int i = 0; i < soSachGiaoKhoa; i++) {
//            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
//            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
//            sachGiaoKhoa.nhapSach();
//            arrSachGiaoKhoa.add(sachGiaoKhoa);
//        }
//         
//        System.out.println("Nhap thong tin sach tham khao:");
//        for (int i = 0; i < soSachThamKhao; i++) {
//            System.out.println("Nhap thong tin quyen sach thu " + (i + 1) + ":");
//            SachThamKhao sachThamKhao = new SachThamKhao();
//            sachThamKhao.nhapSach();
//            arrSachThamKhao.add(sachThamKhao);
//        }
//         
//        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
//            if (arrSachGiaoKhoa.get(i).getNumber() == 0) {
//                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
//                    arrSachGiaoKhoa.get(i).getDonGia() * 50 / 100;
//            } else if (arrSachGiaoKhoa.get(i).getNumber() == 1) {
//                tongTienSachGiaoKhoa += arrSachGiaoKhoa.get(i).getSoLuong() * 
//                    arrSachGiaoKhoa.get(i).getDonGia();
//            }
//        }
//        System.out.println("Tong tien sach giao khoa = " + tongTienSachGiaoKhoa);
//         
//        for (int i = 0; i < arrSachThamKhao.size(); i++) {
//            tongTienSachThamKhao += arrSachThamKhao.get(i).getSoLuong() * 
//                arrSachThamKhao.get(i).getDonGia() + arrSachThamKhao.get(i).getThue();
//        }
//        System.out.println("Tong tien sach tham khao = " + tongTienSachThamKhao);
//         
//        System.out.println("-----Thong tin sach giao khoa-----");
//        for (int i = 0; i < arrSachGiaoKhoa.size(); i++) {
//            System.out.println(arrSachGiaoKhoa.get(i).toString());
//        }
//         
//        System.out.println("-----Thong tin sach tham khao-----");
//        for (int i = 0; i < arrSachThamKhao.size(); i++) {
//            System.out.println(arrSachThamKhao.get(i).toString());
//        }
//         
//        System.out.println("---Trung binh cong don gia cac sach tham khao---");
//        for (int i = 0; i < arrSachThamKhao.size(); i++) {
//            tongDonGiaSachThamKhao += arrSachThamKhao.get(i).getDonGia();
//            trungBinhCongDonGia = tongDonGiaSachThamKhao / arrSachThamKhao.size();
//        }
//        System.out.println("Trung binh cong don gia cac sach tham khao = " + trungBinhCongDonGia);
//         

}
