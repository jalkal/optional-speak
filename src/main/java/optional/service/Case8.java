package optional.service;

import optional.model.Car;
import optional.model.Insurance;
import optional.model.Person;

import java.util.Optional;

//Filter Optionals
public class Case8 {

    public static void main(String[] args) {

        Person person = aPerson(18);
        System.out.println(getCarInsuranceName(Optional.of(person), 20));
    }

    public static String getCarInsuranceName(Optional<Person> person, int minAge) {
        return person.filter(p -> p.getAge() >= minAge)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }

    public static Person aPerson(int age){
        Person person = new Person();
        person.setAge(age);
        Car car = new Car();
        Insurance insurance = new Insurance("Alianz");
        car.setInsurance(insurance);
        person.setCar(car);
        return person;
    }
}
