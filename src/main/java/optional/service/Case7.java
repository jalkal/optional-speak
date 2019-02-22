package optional.service;

import optional.model.Car;
import optional.model.Insurance;
import optional.model.Person;

import java.util.Optional;

//Combine Optionals
public class Case7 {

    public Optional<Insurance> nullSafeFindCheapestInsurance(Optional<Person> person, Optional<Car> car) {

        return person.flatMap(p -> car.map(c -> findCheapestInsurance(p, c)));
    }

    public Insurance findCheapestInsurance(Person person, Car car){
        //Do bussiness rule

        return new Insurance("the cheapest");
    }
}
