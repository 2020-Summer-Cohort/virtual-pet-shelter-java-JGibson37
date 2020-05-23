package shelter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetTest {

    @Test
    public void shouldCreatePet(){
        VirtualPet underTest = new VirtualPet("animalName","animalDescription",10,10,10);
    }
    @Test
    public void createGetHunger(){
        VirtualPet underTest = new VirtualPet("animal","animalDescription",10,10,10);
        underTest.getHunger();
    }
    @Test
    public void createGetThirst(){
        VirtualPet underTest = new VirtualPet("animal","animalDescription",10,10,10);
        underTest.getThirst();
    }
    @Test
    public void createGetBoredom(){
        VirtualPet underTest = new VirtualPet("animal","animalDescription",10,10,10);
        underTest.getBoredom();
    }
    @Test
    public void createTick(){
        VirtualPet underTest = new VirtualPet("animal","animalDescription",10,10,10);
        underTest.Tick();
    }
    @Test
    public void shouldFeedPets(){
        VirtualPet underTest = new VirtualPet("animal","animalDescription",10,10,10);
        underTest.feedPet();
        int hunger =underTest.getHunger();
        assertEquals(-5, hunger);
    }
    @Test
    public void shouldWaterPets(){
        VirtualPet underTest = new VirtualPet("animal","animalDescription",10,10,10);
        underTest.waterPet();
        int thirst = underTest.getThirst();
        assertEquals(-5, thirst);
    }
    @Test
    public void shouldPlayPet(){
        VirtualPet underTest = new VirtualPet("animalName","animalDescription",10,10,10);
        underTest.playWithPet();
        int play = underTest.getBoredom() ;
        assertEquals(-5, play);
    }

}
