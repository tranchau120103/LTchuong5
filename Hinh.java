
package LTchuong5;

import java.util.ArrayList;
import java.util.Scanner;

public class Hinh 
{ 
    public double DienTich()
    {
    return 0;
    }
}
class HinhChuNhat extends Hinh
{
 public float cd ;
 public float cr;

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "cd=" + cd + ", cr=" + cr + '}';
    }
    public double DienTich()
    {
    double dientich = cr*cd;
    return dientich;
    }
    
}
class HinhTron extends Hinh
{
public float bankin;
    public HinhTron(){}
    public HinhTron(float bankin) {
        this.bankin = bankin;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "bankin=" + bankin + '}';
    }
    public double DienTich()
    {
    Scanner sc = new Scanner(System.in);
    bankin = sc.nextFloat();
    double dientich = bankin*bankin*3.14;
    return dientich;
    }

    public float getBankin() {
        return bankin;
    }

    public void setBankin(float bankin) {
        this.bankin = bankin;
    }
}
class danhsachhinh
{
ArrayList<Hinh> list = new ArrayList<>();
Hinh h = new HinhTron();
Scanner sc = new Scanner(System.in);
    public danhsachhinh() 
    {
    }
  public void Them(Hinh hinh)
  {
  String loaihinh = sc.nextLine();
  if (loaihinh.equalsIgnoreCase("hinh tron"))
  {
   h.DienTich();
  }
  
  }


}
class main
{
public static void main(String[] arg)
{
danhsachhinh ds = new danhsachhinh();

}


}