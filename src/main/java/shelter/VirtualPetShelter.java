package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> animals = new HashMap<>();

    public Collection<VirtualPet> getAllAnimals(){
        return animals.values();
    }
    public void retrieveSpecificPet(VirtualPet specificPet){
        animals.get(specificPet.getAnimalName());
    }
    public void acceptNewAnimal (VirtualPet newPet){
        animals.put(newPet.getAnimalName(),newPet);
    }
    public void adopted (String animalName){
        animals.remove(animalName);
    }
    public void feedAll(){
        for(VirtualPet petToFeed : animals.values()) {
            petToFeed.feedPet();
        }
    }
    public void waterAll(){
        for(VirtualPet petToWater : animals.values()) {
            petToWater.waterPet();
        }
    }
}
