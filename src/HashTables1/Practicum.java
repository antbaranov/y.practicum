package HashTables1;

import java.util.Map;
import java.util.TreeMap;

public class Practicum {
    public static void main(String[] args) {
        // ключ – автомобиль, значение – цена
        Map<Car, Integer> cars = new TreeMap<>();
        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Honda CR-V ", 2_500_000), 3);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);

        // проверяем порядок
        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}

