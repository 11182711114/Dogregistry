package school;

import java.util.ArrayList;
import java.util.Scanner;
//Fredrik Larsson frla9839
public class DogRegistry {
	private ArrayList<Dog> dogs = new ArrayList<>();
	
	public static void main(String[] args){
		DogRegistry thisRegistry = new DogRegistry();
		thisRegistry.run();	
	}
	
	private void run(){
		while(true){
			handleCommand(readCommand());
		}
	}
	private String readCommand(){
		return inputString("Lyssnar>").toLowerCase();
	}
	private void handleCommand(String userInput){
			switch(userInput){
			case "test":
				test();				
				break;
			case "registrera":
				registerDog();
				break;
			case "lista":
				listDog();
				break;
			case "ta bort":
				removeDog();
				break;
			case "avsluta":
				System.exit(0);				
				break;
			default:
				System.out.println("Fel input");				
			}
	}
	
	private void test(){		
		dogs.add(new Dog("Fido","Pudel",4,7));
		dogs.add(new Dog("Pido","Tax",2,20));
		dogs.add(new Dog("Hido","Vallhund",6,72));
		dogs.add(new Dog("Tido","Rhodesian Ridgeback",1,10));
		dogs.add(new Dog("Bigo","Schäfer",8,10));
	}
	
	private void registerDog(){
		String name = inputString("Ange namn>");
		String race = inputString("Ange ras>");
		int age = inputNumber("Ange ålder>").intValue();
		int weight = inputNumber("Ange vikt>").intValue();
		dogs.add(new Dog(name, race, age, weight));
	}
	
	private void listDog(){
		double tailLength = inputNumber("Minsta svanslängd>");
		for(Dog thisDog : dogs){
			if(thisDog.getTail()>=tailLength){
				System.out.println(thisDog);
			}			
		}
	}
	
	private void removeDog(){
		String removeDog = inputString("Namn på hund som skall tas bort>");				
		int index = -1;
		
		for(int i = 0; i<dogs.size();i++){				
			if(dogs.get(i).getName().equals(removeDog)){						
				index = i;
			}
		}
		if(index>=0 && index<dogs.size()){
			dogs.remove(index);
			System.out.println("Hunden med det angivna namnet är borttagen");
			
		}
		else{
			System.out.println("Hund med det namnet fanns ej i registret");
		}
	}
	//input
	public static String inputString(String inputDescription){
		
		Scanner tangentbord = new Scanner(System.in);
		System.out.print(inputDescription);
		return tangentbord.nextLine();		
	}
	public static Double inputNumber(String inputDescription){
		
		Scanner tangentbord = new Scanner(System.in);
		System.out.print(inputDescription);
		Double dOutput = tangentbord.nextDouble();
		tangentbord.nextLine();
		return dOutput;
	}
}
