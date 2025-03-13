package org.example.model;

public class Bread extends ProductForSale{
    private int id;
    public Bread(String type, int price, String description) {
        super(type, price, description);

    }
    public Bread(String type, int price, String description,int id) {
        super(type, price, description);
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    @Override
    public void showDetails() {
        System.out.println("id: "+id);
    }
}
