package Food;

public class Rice {
	
	public Rice(){}
	
	private String riceName;
	
	public String getRiceName() {
		return riceName;
	}
	public void setRiceName(String riceName) {
		this.riceName = riceName;
	}
	
	
	public String myself(){
		
		String rice = "I am Rice.";
		
		if(riceName != null && !riceName.isEmpty()){
			rice = "I am "+riceName+" Rice.";
		}
		
		return rice;
	}
}
