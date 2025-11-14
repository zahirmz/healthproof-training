package Features;

public class Ex2 {

//	public static String validate(String day)
//	
//	{
//		
//		switch(day)
//		{
//		case "Monday": return "Day 1 Meeting";
//		case "Tuesday": return "Day 2 Meeting";
//		default:return "invlaid";
//		}
//		
//		
//	}
//	public static void main(String[] args) {
//		Ex2 e1=new Ex2();
//		System.out.println(e1.validate("Monday"));
//		
//	}
	
public static void main(String[] args) {
//	String day="Tuesday";
//	String result= switch(day) {
//	case "Monday": yield result=("Day 1 Meeting");
//	case "Tuesday": yield result=("Day 2 Meeting");
//	default : yield result=("Invalid");
//	
// 
//	};
//}
//}

String day = "Tuesday";
String result = switch(day) {
    case "Monday" -> { 
        String message = "Day 1 Meeting";
        yield message;
    }
    case "Tuesday" -> {
        String message = "Day 2 Meeting";
        yield message;
    }
    default -> "Invalid";
};

System.out.println(result);
}
}
//
//String day = "Tuesday";
//String result = switch(day) {
//    case "Monday" -> "Day 1 Meeting";   
//    case "Tuesday" -> "Day 2 Meeting";  
//    default -> "Invalid";               
//};
//
//System.out.println(result);
//}
//}





















