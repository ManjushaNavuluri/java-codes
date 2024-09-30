package examplesPrograms;
import java.util.*;
class SwitchFeature {

	public static void main(String[] args) {
		int i=2;
		//using traditional switch case
		switch(i) {
		case 1 :System.out.println("1");
		break;
		case 2 :System.out.println("1");
		break;
		case 3 :System.out.println("1");
		break;
		default :System.out.println("-1");
		break;
		}
		//using multi-label switch case
		switch(i) {
		case 1,2,3:System.out.println("1");
		break;
		default:System.out.println("-1");
		break;
		}
		//using yield
		//Yield will return the value to the switch case
		int data = switch(i) {
		case 1,2,3 : yield i;
		default : yield -1;
		};
		System.out.println(data);
	}
}
