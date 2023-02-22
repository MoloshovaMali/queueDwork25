import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car,CarDannyi>carr=new HashMap<>();
        carr.put(new Car(22,777),new CarDannyi(2022,"BMW",2000000,"Black"));
        carr.put(new Car(55,890),new CarDannyi(2019,"BMW",150000,"Grey"));
        for(Map.Entry<Car,CarDannyi> m:carr.entrySet()){
                        System.out.println(m.getKey()+" : "+m.getValue() );

    }
}}