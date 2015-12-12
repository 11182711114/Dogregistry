package school;
//Fredrik Larsson frla9839
public class Dog {
	private String name;
	private String breed;
	private int age;
	private int weight;
	
	public Dog(String dName, String dBreed, int dAge, int dWeight){
		name = dName;
		breed = dBreed;
		age = dAge;
		weight = dWeight;
	}
	
	public double getTail(){
		double tail = 0;
		if (breed.equalsIgnoreCase("Tax")){
			 tail = 3.7;
		}
		else{			
			tail = age*weight/10;
		}
		
		return tail;
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public int getWeight(){
		return weight;
	}
	@Override
	public String toString(){
		String result = name+" "+breed+" "+age+"år "+weight+"kg svans="+getTail();
		return result;	
	}
		
	/*
	public void setName(String x){
		name = x;
	}
	public void setBreed(String x){
		breed = x;
	}
	public void setAge(int x){
		age = x;
	}
	public void setWeight(int x){
		weight = x;
	}
	*/

}
