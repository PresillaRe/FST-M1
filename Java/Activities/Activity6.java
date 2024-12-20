package activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Plane{
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTakeOffTime;
	private Date lastLandingTime;
	
	public Plane(int maxPassengers){
		this.maxPassengers = maxPassengers;
		this.passengers = new ArrayList<String>();
	}
	public void onboard(String passengerName) {
		this.passengers.add(passengerName);
}
	public void setTakeOff() {
		this.lastTakeOffTime = new Date();
		
	}
	public Date  getTakeOffTime() {
	return this.lastTakeOffTime;
}
	public void setLand() {
		this.lastLandingTime = new Date();
		this.passengers.clear();
	}
	public Date  getLastTimeLanded() {
		return this.lastLandingTime;
	}
	public List<String> getpassengers(){
		return this.passengers;
	}
}

public class Activity6 {
 public static void main(String[] args) throws InterruptedException{
	 //create and object of plane
	 Plane b747 = new Plane(10);
	 //onboard passeners
	 b747.onboard("Sekha");
	 b747.onboard("Rekha");
	 b747.onboard("Milly");
	 //set the take offtime
	 b747.setTakeOff();
	 System.out.println("Plane took off at:" + b747.getTakeOffTime());
	 System.out.println("The passengers in the plane:" + b747.getpassengers());
	 //Flying
	 System.out.println("Plane is flying");
	Thread.sleep(5000);
	//set the landing time
	b747.setLand();
	System.out.println("Plane landed at:" + b747.getLastTimeLanded());
	System.out.println("The passengers in the plane after landing:" + b747.getpassengers());
	}
	 
 }

