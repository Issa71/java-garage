package garage;

	public class Van extends Vehicle {

	    String payLoad;
	    int doors;

	    public Van(String id, String name, String engineSize, String payLoad, int doors) {

	        this.id = id;
	        this.name = name;
	        this.engineSize = engineSize;
	        this.doors = doors;

	    }

	    public Van() {

	    }

	    @Override
	    public String toString() {
	        return "Vehicle{" + "id=" + id + ", name=" + name + ", engineSize=" + engineSize + "doors=" + doors + '}';
	    }

	
	  

	    public int getDoors() {
	        return doors;
	    }

	    public void setDoors(int doors) {
	        this.doors = doors;
	    }

}
