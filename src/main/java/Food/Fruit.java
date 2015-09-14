package Food;

public class Fruit {

	
	private String fruitName;
	
	
	public String getFruitName() {
		return fruitName;
	}


	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public Fruit(){}
	public Fruit(String Name){
		setFruitName(Name);
	}
	
	public Fruit(String Name, String Name1){
		setFruitName(Name,Name1);
	}

	private void setFruitName(String name, String name1) {
		this.fruitName = name+"   (::)   "+name1;
		
	}


	public String myself(){
		String speech = "I am Fruit.";
		if (fruitName != null && !fruitName.isEmpty()){
			speech = "Fruit Name :::=="+fruitName;
		}
		
		if (fruitName != null && !fruitName.isEmpty()){
			speech = "Fruit Name :::=="+fruitName;
		}
		return speech;
	}
}
