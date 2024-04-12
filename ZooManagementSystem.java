import java.util.Scanner;
import java.util.ArrayList;

abstract class Animal {
    private String name;
    private int age;
    private double weight;
    
    public Animal (String name, int age, double weight){
        this.name = name; 
        this.age = age;
        this.weight = weight;
    }
    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
}

interface Flyable{
    public void fly();
}
interface Swimmable{
    public void swim();
}
interface Climber{
    public void climb();
}

class Mammal extends Animal {
    
    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }    

    @Override
    public void makeSound() {
        System.out.println(" makes a sound");
    }

    @Override
    public void eat() {
        System.out.println(" eats");
    }

    @Override
    public void sleep() {
        System.out.println(" sleeps");
    }
}

class Reptile extends Animal {
   
    public Reptile(String name, int age, double weight, double length) {
        super(name, age, weight);
    }   
    
    @Override
    public void makeSound() {
        System.out.println(" makes a sound");
    }

    @Override
    public void eat() {
        System.out.println(" eats");
    }

    @Override
    public void sleep() {
        System.out.println(" sleeps");
    }
}

class Fish extends Animal implements Swimmable {

    public Fish(String name, int age, double weight, double maxDepth) {
        super(name, age, weight);
    }
    public void swim(){
        System.out.println(" swims");
    }
    
    @Override
    public void makeSound() {
        System.out.println(" sound");
    }

    @Override
    public void eat() {
        System.out.println(" eats");
    }

    @Override
    public void sleep() {
        System.out.println(" sleeps");
    }
}

class Bird extends Animal implements Flyable {
    
    public Bird(String name, int age, double weight, double wingspan) {
        super(name, age, weight);
    }
    public void fly(){
        System.out.println(" flies");
    }
    @Override
    public void makeSound() {
        System.out.println(" makes a sound");
    }

    @Override
    public void eat() {
        System.out.println(" eats");
    }

    @Override
    public void sleep() {
        System.out.println(" sleeps");
    }
}

class Primate extends Mammal{
    
    public Primate(String name, int age, double weight) {
        super(name, age, weight);
    }
}

class Monkey extends Primate implements Climber{
    
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println(" climbs");
    }    
}

class Ape extends Primate implements Climber{
    
    public Ape(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println(" climbs");
    }   
}

    
public class ZooManagementSystem {
    
    static ArrayList<String> animals = new ArrayList<>(); 
    static ArrayList<String> savannahAnimals = new ArrayList<>(); 
    static ArrayList<String> jungleAnimals = new ArrayList<>(); 
    static ArrayList<String> aquariumAnimals= new ArrayList<>();
    static ArrayList<String> aviaryAnimals = new ArrayList<>(); 
    static ArrayList<String> mammalGroup = new ArrayList<>(); 
    static ArrayList<String> birdGroup = new ArrayList<>(); 
    static ArrayList<String> reptileGroup = new ArrayList<>();
    static ArrayList<String> fishGroup = new ArrayList<>(); 
    
    static void addAnimal(String animalName, String animalDetails, int habitat, int group){
        String newAnimal = animalName + " (" + animalDetails+")";
        animals.add(newAnimal);
        
        switch(group){
            case 1:
                mammalGroup.add(animalName);
                break;
            case 2:
                birdGroup.add(animalName);
                break;
            case 3:
                reptileGroup.add(animalName);
                break;
            case 4:
                fishGroup.add(animalName);
                break;
        }
        switch(habitat){
            case 1:
                jungleAnimals.add(newAnimal);
                break;
            case 2:
                savannahAnimals.add(newAnimal);
                break;
            case 3:
                aquariumAnimals.add(newAnimal);
                break;
            case 4:
                aviaryAnimals.add(newAnimal);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zooChoice;
        String loopChoice;
        String animalDetails;
        double weight;
        double length;
        double wingspan;
        double maxDepth;
        int age;
        int i;
        
        System.out.println("Hello there! Welcome to Enchanted Zoo!");
        
        do {
            System.out.println("What would you like to do?");
            System.out.println("[1]View all animals in the zoo");
            System.out.println("[2]View animals in a specific habitat");
            System.out.println("[3]Add animals");
            System.out.println("[4]Feed animals");
            System.out.println("[5]Simulate animal behavior");
            System.out.println("[6]Exit zoo");
            
            zooChoice = in.nextInt();
            
            switch(zooChoice){
                case 1:
                    if(animals.isEmpty()){
                        System.out.println("There are no animals in the zoo.");
                    }
                    else{
                        System.out.println("Viewing animals in the zoo.");
                        for (i=0;i<animals.size();i++){
                            System.out.println("["+(i+1)+"]"+animals.get(i));
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("Select a habitat.");
                    System.out.println("[1]Jungle\n[2]Savannah\n[3]Aquarium\n[4]Aviary");
                    int habitatChoice = in.nextInt();
                    switch(habitatChoice){
                        case 1:
                            if(jungleAnimals.isEmpty()){
                                System.out.println("There are no animals in the jungle.");
                            }
                            else{
                                System.out.println("Viewing animals in the jungle.");
                                for (i=0;i<jungleAnimals.size();i++){
                                    System.out.println("["+(i+1)+"]"+jungleAnimals.get(i));
                                }
                            }
                            break;
                        case 2:
                            if(savannahAnimals.isEmpty()){
                                System.out.println("There are no animals in the savannah.");
                            }
                            else{
                                System.out.println("Viewing animals in the savannah.");
                                for (i=0;i<savannahAnimals.size();i++){
                                    System.out.println("["+(i+1)+"]"+savannahAnimals.get(i));
                                }
                            }
                            break;
                        case 3:
                            if(aquariumAnimals.isEmpty()){
                                System.out.println("There are no animals in the aquarium.");
                            }
                            else {
                                System.out.println("Viewing animals in the aquarium.");
                                for (i=0;i<aquariumAnimals.size();i++){
                                    System.out.println("["+(i+1)+"]"+aquariumAnimals.get(i));
                                }
                            }
                            break;
                        case 4:
                            if(aviaryAnimals.isEmpty()){
                                System.out.println("There are no animals in the aviary.");
                            }
                            else {
                                System.out.println("Viewing animals in the aviary.");
                                for (i=0;i<aviaryAnimals.size();i++){
                                    System.out.println("["+(i+1)+"]"+aviaryAnimals.get(i));
                                }
                            }
                            break;
                    }
                    break;
                    
                case 3:
                    String addLoop;
                    do {
                        System.out.println("What animal do you want to add? ");
                        String animalName = in.next();
                        
                        System.out.println("What group does it belong to?");
                        System.out.println("[1]Mammal\n[2]Bird\n[3]Reptile\n[4]Fish");
                        int group = in.nextInt();
                        switch(group){
                            case 1:
                                System.out.println("How much does it weigh? (weight in kilograms): ");
                                weight = in.nextDouble();
                                System.out.println("How old is it? (age in years)");
                                age = in.nextInt();
                                animalDetails= "Weight: "+weight+"kg" + " Age: "+age+" years";
                                break;
                            case 2:
                                System.out.println("How much does it weigh? (weight in kilograms): ");
                                weight = in.nextDouble();
                                System.out.println("How old is it? (age in years)");
                                age = in.nextInt();
                                System.out.println("Enter wingspan (in meters): ");
                                wingspan = in.nextDouble();
                                animalDetails= "Weight: "+weight+"kg" + " Age: "+ age+ " years" + " Wingspan: "+wingspan+"m";
                                break;
                            case 3:
                                System.out.println("How much does it weigh? (weight in kilograms): ");
                                weight = in.nextDouble();
                                System.out.println("How old is it? (age in years)");
                                age = in.nextInt();
                                System.out.println("Body length (in meters)");
                                length = in.nextDouble();
                                animalDetails= "Weight: "+weight+"kg" + " Age: "+ age+ " years" + " Body Length: "+length+"m";
                                break;
                            case 4:
                                System.out.println("How much does it weigh? (weight in kilograms): ");
                                weight = in.nextDouble();
                                System.out.println("How old is it? (age in years)");
                                age = in.nextInt();
                                System.out.println("Maximum depth (in meters): ");
                                maxDepth = in.nextDouble();
                                animalDetails= "Weight: "+weight+"kg" + " Age: "+ age+ " years" + " Max swimming depth: "+maxDepth+"m";
                                break;
                            default:
                                System.out.println("Invalid choice.");
                                return;
                        }
                        
                        System.out.println("Select a habitat.");
                        System.out.println("[1]Jungle\n[2]Savannah\n[3]Aquarium\n[4]Aviary");
                        int habitat = in.nextInt();
                        
                        addAnimal(animalName,animalDetails, habitat, group);    
                        System.out.println("Animal successfully added.");
                        System.out.println("Do you want to add another animal? (Y if yes)");
                        addLoop = in.next();
                    } while (addLoop.equalsIgnoreCase("Y"));
                    break;

                    
                case 4:
                    if (animals.isEmpty()){
                        System.out.println("There are no animals to feed.");
                    }
                    else {
                        System.out.println("You fed the animals.");
                    }
                    break;
                    
                case 5:
                    System.out.println("What is the group of the animal you want to simulate?");
                    System.out.println("[1]Mammal\n[2]Bird\n[3]Reptile\n[4]Fish");
                    int simulateAnimal;
                    String chosenAnimal;
                    int simulateAction;
                    int simulateGroup = in.nextInt();
                    switch(simulateGroup){
                        case 1:
                            Mammal mammal = new Mammal("Mammal",0,0);
                            Monkey monkey = new Monkey ("Monkey",0,0);
                            Ape ape = new Ape ("Ape",0,0);
                            System.out.println("Select the animal you want to simulate");
                            for (i=0;i<mammalGroup.size();i++){
                                System.out.println("["+(i+1)+"]"+mammalGroup.get(i));
                            }
                            simulateAnimal=in.nextInt();
                            chosenAnimal = mammalGroup.get(simulateAnimal-1);
                            
                            if (chosenAnimal.equalsIgnoreCase("ape")||chosenAnimal.equalsIgnoreCase("monkey")){
                                System.out.println("Simulate "+chosenAnimal+" behavior");
                                System.out.println("[1]Make a sound\n[2]Eat\n[3]Sleep\n[4]Climb");
                                simulateAction=in.nextInt();
                                switch (simulateAction){
                                    case 1:
                                        System.out.print("The "+chosenAnimal);
                                        mammal.makeSound();
                                        break;
                                    case 2:
                                        System.out.print("The "+chosenAnimal);
                                        mammal.eat();
                                        break;
                                    case 3:
                                        System.out.print("The "+chosenAnimal);
                                        mammal.sleep();
                                        break;
                                    case 4:
                                        if(chosenAnimal.equalsIgnoreCase("Ape")){
                                            System.out.print("The "+chosenAnimal);
                                            ape.climb();
                                        }
                                        else if(chosenAnimal.equalsIgnoreCase("Monkey")){
                                            System.out.print("The "+chosenAnimal);
                                            monkey.climb();
                                        }
                                        break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;
                                }
                            }
                            else {
                                System.out.println("Simulate "+chosenAnimal+" behavior");
                                System.out.println("[1]Make a sound\n[2]Eat\n[3]Sleep");
                                simulateAction=in.nextInt();
                                switch (simulateAction){
                                    case 1:
                                        System.out.print("The "+chosenAnimal);
                                        mammal.makeSound();
                                        break;
                                    case 2:
                                        System.out.print("The "+chosenAnimal);
                                        mammal.eat();
                                        break;
                                    case 3:
                                        System.out.print("The "+chosenAnimal);
                                        mammal.sleep();
                                        break;
                                    default:
                                        System.out.println("Invalid choice");
                                        break;
                                }
                            }
                            break;
                        case 2:
                            Bird bird = new Bird("bird",0,0,0);
                            System.out.println("Select the animal you want to simulate");
                            for (i=0;i<birdGroup.size();i++){
                                System.out.println("["+(i+1)+"]"+birdGroup.get(i));
                            }
                            simulateAnimal=in.nextInt();
                            chosenAnimal = birdGroup.get(simulateAnimal-1);
                            System.out.println("Simulate "+chosenAnimal+" behavior");
                            System.out.println("[1]Make a sound\n[2]Eat\n[3]Sleep\n[4]Fly");
                            simulateAction=in.nextInt();
                            switch (simulateAction){
                                case 1:
                                    System.out.print("The "+chosenAnimal);
                                    bird.makeSound();
                                    break;
                                case 2:
                                    System.out.print("The "+chosenAnimal);
                                    bird.eat();
                                    break;
                                case 3:
                                    System.out.print("The "+chosenAnimal);
                                    bird.sleep();
                                    break;
                                case 4:
                                    System.out.print("The "+chosenAnimal);
                                    bird.fly();
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }
                            break;
                        case 3:
                            Reptile reptile = new Reptile("reptile",0,0,0);
                            System.out.println("Select the animal you want to simulate");
                            for (i=0;i<reptileGroup.size();i++){
                                System.out.println("["+(i+1)+"]"+reptileGroup.get(i));
                            }
                            simulateAnimal=in.nextInt();
                            chosenAnimal = reptileGroup.get(simulateAnimal-1);
                            System.out.println("Simulate "+chosenAnimal+" behavior");
                            System.out.println("[1]Make a sound\n[2]Eat\n[3]Sleep");
                            simulateAction=in.nextInt();
                            switch (simulateAction){
                                case 1:
                                    System.out.print("The "+chosenAnimal);
                                    reptile.makeSound();
                                    break;
                                case 2:
                                    System.out.print("The "+chosenAnimal);
                                    reptile.eat();
                                    break;
                                case 3:
                                    System.out.print("The "+chosenAnimal);
                                    reptile.sleep();
                                    break;
                                default:
                                    System.out.println("Invalid choice.");
                                    break;
                            }
                            break;
                        case 4:
                            Fish fish = new Fish ("fish",0,0,0);
                            System.out.println("Select the animal you want to simulate");
                            for (i=0;i<fishGroup.size();i++){
                                System.out.println("["+(i+1)+"]"+fishGroup.get(i));
                            }
                            simulateAnimal=in.nextInt();
                            chosenAnimal = fishGroup.get(simulateAnimal-1);
                            System.out.println("Simulate "+chosenAnimal+" behavior");
                            System.out.println("[1]Make a sound\n[2]Eat\n[3]Sleep\n[4]Swim");
                            simulateAction=in.nextInt();
                            switch (simulateAction){
                                case 1:
                                    System.out.print("The "+chosenAnimal);
                                    fish.makeSound();
                                    break;
                                case 2:
                                    System.out.print("The "+chosenAnimal);
                                    fish.eat();
                                    break;
                                case 3:
                                    System.out.print("The "+chosenAnimal);
                                    fish.sleep();
                                    break;
                                case 4:
                                    System.out.print("The "+chosenAnimal);
                                    fish.swim();
                                    break;
                                default:
                                    System.out.print("Invalid choice.");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    break;
                
                case 6:
                    System.out.println("Zoo exited.");
                    return;
                    
                default:
                    System.out.println("Invalid choice");
                    break;
                    
            
            } 
            
            System.out.println("Would you like to make another action? (Y if yes)");
            loopChoice = in.next();
        } while (loopChoice.equalsIgnoreCase("Y"));
        
        System.out.println("Zoo exited.");
    }     
}