package extra.pkgclass.car.race;
import java.util.Random;


public class Car {
    String brand;
    int year;
    int horsePower;
    int distance;
    int i;
    
    Car(String _brand, int _year, int _horsePower){
        brand = _brand;
        year = _year;
        horsePower = _horsePower;
    }
    
    public int advance (){
        while (distance<1000){
            Random Rand = new Random();
            int random = Rand.nextInt(2);
            distance = (horsePower*random) + distance;  
            i++;
            System.out.println(i);
        }
        return distance;
        
    }
}

