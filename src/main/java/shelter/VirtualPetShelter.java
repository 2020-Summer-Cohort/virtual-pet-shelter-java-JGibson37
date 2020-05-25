package shelter;

import java.util.*;
import java.util.Map.Entry;


public class VirtualPetShelter {

    Map<String, VirtualPet> animals = new HashMap<>();

    public void  getAllAnimals(){
         for(VirtualPet pet : animals.values()){
             System.out.println(pet);
         }
    }
    public void acceptNewAnimal (VirtualPet pet){
        animals.put(pet.getAnimalName(),pet);
    }
    public void acceptNewArrival (String name, String description){
        animals.put(name, new VirtualPet(name, description) );
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
    public boolean playWithPet(String name){
        if(animals.containsKey(name)) {
            animals.get(name).playPet();
            return true;
        }else{
            return false;
        }
    }
    public void tickAll(){
        for(VirtualPet tickAll : animals.values()){
            tickAll.Tick();
        }
    }

    public void retrieveAnimalNameAndDescription() {
        for (VirtualPet animal : animals.values()){
            System.out.println(animal.getAnimalName() + " : " + animal.getAnimalDescription());
        }
    }
}
