package HashTables1;

import java.util.Objects;

class Car implements Comparable<Car> {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Car{model=" + model + ", priceInRubles=" + priceInRubles + "}";
    }

    @Override
    public int compareTo(Car o) {
        return this.priceInRubles-o.priceInRubles;
    }
}
