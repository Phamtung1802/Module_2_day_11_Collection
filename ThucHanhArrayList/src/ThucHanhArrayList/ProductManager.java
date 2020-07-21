package ThucHanhArrayList;

import java.util.ArrayList;

public class ProductManager {
    public ArrayList<Product> productsList;

    public ProductManager(){
        this.productsList=new ArrayList<>();
    }

    public String printAllProduct(int i){
        return this.productsList.get(i).toString();
    }

    public int getIdIndex(int id){
        for (int i=0;i<this.productsList.size();i++){
            if(this.productsList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    public boolean checkDuplicate(){
        for (int i=0;i<this.productsList.size();i++){
            for(int j=0;j<this.productsList.size();j++){
                if(this.productsList.get(i).getId()==this.productsList.get(j).getId()){
                    return false;
                }
            }
        }
        return true;
    }

    public void add(Integer id, Integer price, String name) throws Exception {
       if (getIdIndex(id)!=-1){
           throw new Exception("Duplicate ID");
       }
       else {
           this.productsList.add(new Product(id,price,name));
       }
    }
}
