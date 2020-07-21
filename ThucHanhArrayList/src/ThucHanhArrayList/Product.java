package ThucHanhArrayList;

public class Product {
    private int id,price;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(Integer id, Integer price, String name){
        this.id=id;
        this.price=price;
        this.name=name;
    }

    @Override
    public String toString(){
        return "name= "+this.name+" id= "+this.id+" Price "+this.price;
    }
}
