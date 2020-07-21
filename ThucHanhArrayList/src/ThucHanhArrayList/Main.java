package ThucHanhArrayList;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        ProductManager dsSanPham=new ProductManager();
        dsSanPham.add(0,1000,"Lollipop");
        dsSanPham.add(2,10000,"Coffee");
        dsSanPham.add(3,20000,"Milk");
        dsSanPham.add(4,5000,"Cig");
        dsSanPham.add(5,8000,"Noodle");
        dsSanPham.add(6,12000,"Razor");
        dsSanPham.add(1,2000,"Apple");


        for(int i=0;i<dsSanPham.productsList.size();i++){
            System.out.println(dsSanPham.printAllProduct(i));
        }

        System.out.println("\n"+dsSanPham.productsList.get(dsSanPham.getIdIndex(3)));//search by ID
        dsSanPham.productsList.get(dsSanPham.getIdIndex(2)).setId(10);//sua ID
        dsSanPham.productsList.get(dsSanPham.getIdIndex(5)).setName("Ramen");//sua ten


        System.out.println();
        for(int i=0;i<dsSanPham.productsList.size();i++){
            System.out.println(dsSanPham.printAllProduct(i));
        }

        Collections.sort(dsSanPham.productsList, Comparator.comparing(Product::getPrice));

        System.out.println("\n");

        for(int i=0;i<dsSanPham.productsList.size();i++){
            System.out.println(dsSanPham.printAllProduct(i));
        }
    }
}
