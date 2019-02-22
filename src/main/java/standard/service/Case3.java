package standard.service;

import standard.model.Car;
import standard.model.Insurance;
import standard.model.Person;

public class Case3 {

    public static void main(String[] args) {

        Person person = aPerson();
        System.out.println(getCarInsuranceName(person));
    }

    public static String getCarInsuranceName(Person person) {
        if(person == null) {
            return "Unknown";
        }

        Car car = person.getCar();
        if(car == null) {
            return "Unknown";
        }

        Insurance insurance = car.getInsurance();
        if(insurance == null){
            return "Unknown";
        }
        return insurance.getName();
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
