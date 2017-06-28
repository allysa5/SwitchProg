
public class Switch {
public static void main (String [] arg){
	int numofdays = 28;
	String monthName = null;
	switch (numofdays) {
    case 31:  monthName = "Jan Mar Jul Aug Oct Dec";

             
    case 30:  monthName = "Apr Jun Sept Nov";

             break;
    case 28:  monthName = "February";

             break;

    }
System.out.println(monthName);
}
}
