package shelter;

public class VirtualPet {
    private String animalName;
    private String animalDescription;
    private int hunger;
    private int thirst;
    private int boredom;

    public VirtualPet(String animalName,String animalDescription, int hunger, int thirst , int boredom) {
        this.animalName = animalName;
        this.animalDescription = animalDescription;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;

    }
public String getAnimalName(){
        return animalName;
}
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void Tick() {
        boredom += 5;
        hunger += 5;
        thirst += 5;
    }

    public int feedPet(int feed) {
        hunger -= feed;
        return hunger;
    }

    public int waterPet(int water) {
        thirst -= water;
        return thirst;
    }

    public int playWithPet(int play) {
        boredom -= play;
        return play;
    }
}
