package optional.service;


import optional.model.Car;
import optional.model.Insurance;
import optional.model.Person;

import java.util.Optional;

//Proper use of Optional
public class Case5 {

    public static void main(String[] args) {

        Person person = aPerson();
        System.out.println(getCarInsuranceName(person));
    }

    public static String getCarInsuranceName(Person person) {

        Optional<Person> optPerson = Optional.of(person);

        return optPerson.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName).orElse("Unknown");
    }

    public static Person aPerson(){
        Person person = new Person();
        Car car = new Car();
        Insurance insurance = new Insurance("Alianz");
        car.setInsurance(insurance);
        person.setCar(car);
        return person;
    }
}
