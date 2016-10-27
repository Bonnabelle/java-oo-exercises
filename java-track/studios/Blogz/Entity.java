package Blogz;

public class Entity {
	
	private final int uid;
	
	public Entity (){
		this.uid = (int)(Math.random() * 5000);
	}
	
	
	public int getUID() {
		return this.uid;
	}
	
	@Override
	public boolean equals(Object o) {
		o = this.uid;
		if(o != null && o.equals(o)){
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args){
		Entity bleh = new Entity();
		
		System.out.println(bleh.getUID());
	}
}
