package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> animals = new HashMap<>();

    public Collection<VirtualPet> getAllAnimals(){
        return animals.values();
    }
}

