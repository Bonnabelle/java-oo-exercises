package Blogz;

public class Entity {
	
	private final int uid;
	
	public Entity (){
		this.uid = (int)(Math.random() * 5000);
	}
	
	
	public int getUID() {
		return this.uid;
	}

	public static void main(String[] args){
		Entity bleh = new Entity();
		
		System.out.println(bleh.getUID());
	}
}
