package extra.pkgclass.car.race;

public class ExtraClassCarRace {
    
    public static void main(String[] args) {
       Car c1 = new Car("Mazda",2005,100);
       Car c2 = new Car ("Jaguar",2010,180);
       Car c3 = new Car ("Mini Cooper",2012,150);
       
       c1.advance();
       c2.advance();
       c3.advance();
       
       if (c1.i < c2.i && c1.i < c3.i){
            System.out.println(c1.brand + " es el ganador");
       } else if (c2.i < c1.i && c2.i < c3.i){
           System.out.println(c2.brand + " es el ganador");
       } else if (c3.i < c1.i && c3.i < c2.i){
           System.out.println(c3.brand + " es el ganador");
       }
    }  
}
