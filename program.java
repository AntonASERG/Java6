
import java.util.*;

public class program {

    public static void main (String[] args){

        Noobook n1 = new Noobook( "HP","book 2000","Japan",8,40000,true);
        Noobook n2 = new Noobook("DNS","VladivistoK2000","Russia",4,30000,true);
        Noobook n3 = new Noobook("IRBIS","trassaE95","China",2,20000,true);
        Noobook n4 = new Noobook("IRBIS","palata.6","China",4,25000,true);
        Noobook n5 = new Noobook("HP","book1900","Japan",4,35000,false);
        Noobook n6 = new Noobook("HP","book19110","Japan",4,65000,false);


    var Noobooki = new HashSet<Noobook>(Arrays.asList(n1,n2,n3,n4,n5,n6));
    
    for (Noobook noobook : Noobooki) { 
        noobook.printInfo(0, 100000000); // волшебное число :)
    } 
    
    Scanner s1 = new Scanner(System.in); 
    System.out.print("Необходимый размер оперативной памяти в ГБ: "); 
    int userRam = s1.nextInt(); 

    Scanner s2 = new Scanner(System.in); 
    System.out.print("Введите максимальную сумму стоимости ноутбука: "); 
    int userPrise = s2.nextInt(); 

    for (Noobook noobook : Noobooki) { 
        noobook.printInfo(userRam, userPrise); 
        } 
   
    
    }
    
}

   

