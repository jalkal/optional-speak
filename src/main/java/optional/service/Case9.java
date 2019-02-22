package optional.service;

import optional.exceptions.NoInsuranceException;
import optional.model.Car;
import optional.model.Insurance;
import optional.model.Person;

import java.util.Optional;

//Thrown controlled expections
public class Case9 {

    public static void main(String[] args) {

        Person person = aPerson();
        System.out.println(getCarInsuranceName(person));
    }

    public static String getCarInsuranceName(Person person) {

        Optional<Person> optPerson = Optional.of(person);

        return optPerson.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElseThrow(NoInsuranceException::new);
    }

    public static Person aPerson(){
        Person person = new Person();
        Car car = new Car();
        person.setCar(car);
        return person;
    }
}
