public class Athlete {

     static int nextBibNumber;
     static String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     int bibNumber;

Athlete (String name, int speed){
     this.name = name;
     this.speed = speed;
     this.bibNumber = this.nextBibNumber;
     nextBibNumber++;
}

public static void main(String[] args) {
	//create two athletes      //print their names, bibNumbers, and the location of their race. }
	Athlete n = new Athlete("Tim", 3);
	Athlete sn = new Athlete("Tim", 3);
	
	System.out.println(n.name);
	System.out.println(n.speed);
	System.out.println(n.bibNumber);
	System.out.println(sn.name);
	System.out.println(sn.speed);
	System.out.println(sn.bibNumber);
	
}

}
