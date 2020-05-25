package shelter;


import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
    VirtualPet queen = new VirtualPet("Queen", " A pony with a crown");
    VirtualPet johanna = new VirtualPet("Johanna", " A Ram with a knack for ramming.");
    VirtualPet stella = new VirtualPet("Stella", "A Stork who misses delivering babies.");
    VirtualPet jerry = new VirtualPet("Jerry", "A mouse said to have conquered a cat.");
    virtualPetShelter.acceptNewAnimal(queen);
    virtualPetShelter.acceptNewAnimal(johanna);
    virtualPetShelter.acceptNewAnimal(stella);
    virtualPetShelter.acceptNewAnimal(jerry);

    boolean gameRun = true;

        while(gameRun){
            System.out.println("Welcome to the shelter, these pets are depending on you for their needs." + "\n");
            System.out.println("Name•Hunger•Thirst•Boredom");
            virtualPetShelter.getAllAnimals();
            beginningScroll();
            int getAction = userInput.nextInt();
            userInput.nextLine();
            if (getAction == 0){
                break;
            }else if(getAction == 1){
                virtualPetShelter.feedAll();
            }else if(getAction == 2){
                virtualPetShelter.waterAll();
            }else if(getAction == 3){
                System.out.println("Who would you like to play with?");
                String typed = userInput.nextLine();
                if (virtualPetShelter.playWithPet(typed) == true){
                    System.out.println("you played with " + typed);
                }else {
                    System.out.println("You entered an invalid pet name. Check your capitals!");
                }
            }else if(getAction == 4){
                System.out.println("Who is being adopted?");
                virtualPetShelter.adopted(userInput.nextLine());
                System.out.println("Remember to thank the new owner for choosing adoption!" + "/n");
            }else if(getAction == 5){
                System.out.println("What is the pets Name?");
                String  name = userInput.nextLine();
                System.out.println("What is the pets Description?");
                String description = userInput.nextLine();
                virtualPetShelter.acceptNewArrival(name,description);
            }else if(getAction == 6){
                virtualPetShelter.retrieveAnimalNameAndDescription();
                System.out.println("");
            }
            virtualPetShelter.tickAll();
        }

    }

    private static void beginningScroll() {
        System.out.println("\n" +"What would you like to do with the pets?");
        System.out.println("1. Feed All Pets.");
        System.out.println("2. Water All Pets.");
        System.out.println("3. Play with a pet.");
        System.out.println("4. Adopt out a pet");
        System.out.println("5. Accept a pet into the shelter.");
        System.out.println("6. Name and Description of all pets in the shelter.");
    }
}
