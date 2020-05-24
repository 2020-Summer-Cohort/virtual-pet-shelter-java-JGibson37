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

    boolean gameRun = true;

        while(gameRun){
            virtualPetShelter.acceptNewAnimal(queen);
            virtualPetShelter.acceptNewAnimal(johanna);
            virtualPetShelter.acceptNewAnimal(stella);
            virtualPetShelter.acceptNewAnimal(jerry);
            System.out.println("Welcome to the shelter, these pets are depending on you for their needs.");
            System.out.println("Name     |Hunger     |Thirst     |Boredom");
            System.out.println("=========|===========|===========|=======");
            System.out.println(virtualPetShelter.getAllAnimals());
            int getAction = userInput.nextInt();
            userInput.nextLine();
            if (getAction == 0){
                break;
            }else if(getAction == 1){
                virtualPetShelter.feedAll();
            }else if(getAction == 2){
                virtualPetShelter.waterAll();
            }else if(getAction == 3){
                //PLAY WITH SPECIFIC PET
                System.out.println("Who would you like to play with?");
                System.out.println(virtualPetShelter.getAllAnimals());
                String getAnimal = userInput.nextLine();
                if (getAnimal = //NAME OF ANIMAL IN MAP)
                
            }else if(getAction == 4){
                System.out.println("Who is being adopted?");
                virtualPetShelter.adopted(userInput.nextLine());
                System.out.println("Remember to thank the new owner for choosing adoption!");
            }else if(getAction == 5){
                String name;
                String description;
                System.out.println("What is the pets Name?");
                name = userInput.nextLine();
                System.out.println("What is the pets Description?");
                description = userInput.nextLine();
                virtualPetShelter.acceptNewArrival(name,description);
            }
        }

    }

}
