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
    public VirtualPet(String animalName,String animalDescription) {
        this.animalName = animalName;
        this.animalDescription = animalDescription;
        hunger = 20;
        thirst = 20;
        boredom =20;
    }
    public String getAnimalName(){
        return animalName;
}
    public String getAnimalDescription(){
        return animalDescription;
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

    public int feedPet() {
        hunger -= 15;
        return hunger;
    }

    public int waterPet() {
        thirst -= 15;
        return thirst;
    }

    public int playPet() {
        boredom -= 15;
        return boredom;
    }

    @Override
    public String toString() {
        return animalName + "•"+
                hunger + "•"+
                + thirst + "•"+
                + boredom ;
    }
}
