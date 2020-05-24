package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class VirtualPetShelter {

    Map<String, VirtualPet> animals = new HashMap<>();
    VirtualPet virtualPet = new VirtualPet("name" , "description");

    public Collection<VirtualPet> getAllAnimals(){
         return animals.values();
    }
    public void retrieveSpecificPet(VirtualPet specificPet){
        animals.get(specificPet.getAnimalName());
    }
    public void acceptNewAnimal (VirtualPet virtualPet){
        animals.put(virtualPet.getAnimalName(),virtualPet);
    }
    public void acceptNewArrival (String name, String description){
        System.out.println(name + description);
        animals.put(name, );
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
    public void tickAll(){
        for(VirtualPet tickAll : animals.values()){
            tickAll.Tick();
        }
    }
}
