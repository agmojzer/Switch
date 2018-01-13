
public class SwitchApp {

	public static void main(String[] args) {
//		int value = 2;
//				if (value ==1) {
//					System.out.println("Value was 1.");
//				}else if (value ==2) {
//					System.out.println("Value was not 1 or 2.");
//				}
		int switchValue = 5;
		
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1.");
			break;
		
		case 2:
			System.out.println("Value was 2.");
			break;
		
		case 3: case 4: case 5:
			System.out.println("Value was a 3, 4, or 5.");
			System.out.println("Actually it was a " + switchValue);
			break;
			
		default:
			System.out.println("Was not 1 or 2.");
			break;
			}
		
		char switch2 = 'Z';
		switch(switch2) {
		case 'A':
			System.out.print("Value was A.");
			break;
			
		case 'B':
			System.out.println("Value was B.");
			break;
			
		case 'C': case 'D': case 'E': //could write these out as in case A and B, this is just shorthand.
			System.out.println("Value was C.");
			break;
			
		default:
			System.out.println("Value was not found.");
			break;
		}
		
		String month = "January";
		switch(month) {
		case "January":
			System.out.println("The month is January.");
			break;
		case "June":
			System.out.println("The month is June.");
			break;
		default:
			System.out.println("The month was not found.");
		}
	}

}
