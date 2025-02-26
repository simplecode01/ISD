package TUGAS1;

public class Toko {
    String code;
    String type;
    String name;
    int quantity;
    public Toko(String code, String type, String name, int quantity){
        this.code = code;
        this.type = type;
        this.name = name;
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return "Toko [code = " + code + ", type = " + type + ", name = " + name + ", quantity = " + quantity + " ]";
    }
    public void theCode(String code){
        this.code = code;
    }
    public void theType(String type){
        this.type = type;
    }
    public void theName(String name){
        this.name = name;
    }
    public void theQty(int quantity){
        this.quantity = quantity;
    }
}
