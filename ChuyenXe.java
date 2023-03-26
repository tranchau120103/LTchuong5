
package LTchuong5;

import java.util.ArrayList;
import java.util.Scanner;


public class ChuyenXe
{
   public String masoxe; 
   public String hotentx;
   public String soxe;
   public double tongdoanhthu;
    public ChuyenXe(){}
    public double getTongdoanhthu() {
        return tongdoanhthu;
    }

    public void setTongdoanhthu(double tongdoanhthu) {
        this.tongdoanhthu = tongdoanhthu;
    }

    public ChuyenXe(String masoxe, String hotentx, String soxe) {
        this.masoxe = masoxe;
        this.hotentx = hotentx;
        this.soxe = soxe;
    }

    public String getMasoxe() {
        return masoxe;
    }

    public void setMasoxe(String masoxe) {
        this.masoxe = masoxe;
    }

    public String getHotentx() {
        return hotentx;
    }

    public void setHotentx(String hotentx) {
        this.hotentx = hotentx;
    }

    public String getSoxe() {
        return soxe;
    }

    public void setSoxe(String soxe) {
        this.soxe = soxe;
    }

    @Override
    public String toString() {
        return "chuyenxe{" + "masoxe=" + masoxe + ", hotentx=" + hotentx + ", soxe=" + soxe + ", tongdoanhthu=" + tongdoanhthu + '}';
    }
    public void xuat()
    {}
}
 class chuyenxenoithanh extends ChuyenXe
{
    public String sotuyen;
    public double sokmdidc;
    public double dongia;
    
    public String getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(String sotuyen) {
        this.sotuyen = sotuyen;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
   
    public chuyenxenoithanh(String masoxe, String hotentx, String soxe) {
        super(masoxe, hotentx, soxe);
    }
     
    @Override
    public String toString() {
        return "chuyenxenoithanh{" + "sotuyen=" + sotuyen + ", sokmdidc=" + sokmdidc + ", dongia=" + dongia + '}';
    }
    public void xuat()
    {
    tongdoanhthu = dongia*sokmdidc;
    }
  
}
class chuyenxengoaithanh extends ChuyenXe
{
    public String noiden;
    public double songaydidc;
    public double dongia;
    public double doanhthu;

    public chuyenxengoaithanh(String masoxe, String hotentx, String soxe) {
        super(masoxe, hotentx, soxe);
    }

    @Override
    public String toString() {
        return "chuyenxengoaithanh{" + "noiden=" + noiden + ", songaydidc=" + songaydidc + ", doanhthu=" + doanhthu + '}';
    }
     public void xuat()
     {
     tongdoanhthu = dongia*songaydidc;
     }
    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public double getSongaydidc() {
        return songaydidc;
    }

    public void setSongaydidc(double songaydidc) {
        this.songaydidc = songaydidc;
    }

    public double getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }
   
    
}
class danhsach 
{
  ArrayList<ChuyenXe> cx = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  public void nhap()
  {
   for(int i =0 ; i< 10000; i++)
   {
   System.out.println("nhap ma so xe");
   String masoxe = sc.nextLine();
   System.out.println("nhap ho ten ");
   String hoten = sc.nextLine();
   System.out.println("nhap so xe");
   String soxe = sc.nextLine();
    System.out.println("nhap loai chuyen xe ");
   String chuyenxe = sc.nextLine();
   if (chuyenxe.equalsIgnoreCase("chuyenxengoaithanh"))
   {
    System.out.println("nhap don gia chuyen xe ngoai thanh ");
   }
   else if (chuyenxe.equalsIgnoreCase("chuyenxenoithanh"))
   {
    System.out.println("nhap don gia chuyen xe noi thanh ");
   }
  }
  }
}
class main
{
public static void main(String[] arg)
{
danhsach ds = new danhsach();
ds.nhap();

}

}