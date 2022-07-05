package com.epam.spring.homework1.pet;

import com.epam.spring.homework1.interfaces.Animal;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {
    private List<Animal> animals;

    //    @Autowired(it is not necessary to put this annotation over the constructor)
    public Pet(List<Animal> animals) {
        this.animals = animals;
    }

    public void printPets() {
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
        }
    }
}
