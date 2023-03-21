package MyPack;

public class Student {

	private int roll;
	private String name;
	private String city;
	
	public Student() {
		super();
	}
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

   public void Info(){
	   
	   System.out.println(roll+" "+name+" "+city);
   }
	
	
}
