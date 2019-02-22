package optional.model;

import java.util.Optional;

public class Person {

    private Optional<Car> car = Optional.empty();
    private int age = 18;

    public Optional<Car> getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = Optional.ofNullable(car);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
