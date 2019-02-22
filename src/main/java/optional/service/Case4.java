package optional.service;


import optional.model.Car;
import optional.model.Insurance;
import optional.model.Person;

import java.util.Optional;

//Incorrect used of Optional
public class Case4 {

    public static void main(String[] args) {

        Person person = aPerson();
        System.out.println(getCarInsuranceName(person));
    }

    public static String getCarInsuranceName(Person person) {

        Optional<Person> optPerson = Optional.of(person);

        if(optPerson.isPresent() && optPerson.get().getCar().isPresent()){
            Car car = optPerson.get().getCar().get();
            if(car.getInsurance().isPresent()){
                return car.getInsurance().get().getName();
            }
        }
        return "Unknown";
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
