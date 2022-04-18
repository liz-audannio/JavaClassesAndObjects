
public class Holiday {

//Minimum 3 private instance variables 

	private String name; 
	private int daysTotal; 
	private String destination; 
	
	public Holiday() {
		
	}
	
	public Holiday(String name, int daysTotal) {
		this.name = name; 
		this.daysTotal = daysTotal;
	}
	
	public Holiday(String name, int daysTotal, String destination) {
		this.name = name; 
		this.daysTotal = daysTotal; 
		this.destination = destination;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDaysTotal() {
		return daysTotal;
	}

	public void setDaysTotal(int daysTotal) {
		this.daysTotal = daysTotal;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	public boolean isTropicalBeach() {
		return true; 
	}
	public String neverKnew() {
		return "That you like piña coladas... And gettin' caught in the rain... And the feel of the ocean...";
	}
	public String deliverRoomService(String list) {
		//there is now a variable called list, that exists in this code
		return list;
	}
	public static void main(String[] args) {
		Holiday holiday = new Holiday("Over Water Bungalo", 21, "Bora Bora, French Polynesia");
		System.out.println(holiday.deliverRoomService("Fruit Tray"));
		//String list = "pizza";
	}
	
}
