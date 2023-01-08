// класс 
public class Noobook {
    
    String brand;
    String model;
    String country;
    Integer price;
    Integer ram;
    Boolean inStock;

    public Noobook(String brand, String model, String country, Integer ram,Integer price, Boolean inStock) {
        this.brand = brand; 
        this.price = price; 
        this.ram = ram; 
        this.model = model; 
        this.inStock = inStock;
        this.country = country;
   } 

   public void printInfo(int userRam, int userPrice) { 
        if (ram >= userRam && price <= userPrice){ 
            if (inStock == true){
                System.out.printf("Ноутбук: %s %s, производитель:  %s,  ОЗУ %d Gb, цена %d руб. %n", brand, model, country, ram, price);
            }
            else{
                System.out.printf("Ноутбук: %s %s, производитель:  %s,  ОЗУ %d Gb, цена %d руб. - НЕТ В НАЛИЧИИ. %n", brand, model, country, ram, price); 
            }
        } 
    } 
    
    @Override
    public String toString() {
        return String.format("Ноутбук %s %s,  производитель:  %s,  ОЗУ %d Gb, цена %d руб %n", brand, model, country, ram, price);
        
    }

}
