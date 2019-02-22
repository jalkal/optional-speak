package optional.service;

import optional.model.Car;
import optional.model.Insurance;
import optional.model.Person;

import java.util.Optional;

//Combine Optionals
public class Case6 {

    public Optional<Insurance> nullSafeFindCheapestInsurance(Optional<Person> person, Optional<Car> car) {

        if (person.isPresent() && car.isPresent()) {
            return Optional.of(findCheapestInsurance(person.get(), car.get()));
        } else {
            return Optional.empty();
        }
    }

    public Insurance findCheapestInsurance(Person person, Car car){
        //Do bussiness rule

        return new Insurance("the cheapest");
    }
}
