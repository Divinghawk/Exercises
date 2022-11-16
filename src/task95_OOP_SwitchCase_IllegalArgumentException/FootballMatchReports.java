package task95_OOP_SwitchCase_IllegalArgumentException;

public class FootballMatchReports {
	
    public static String onField(int shirtNum) {
//        throw new UnsupportedOperationException("Please implement the (static) FootballMatchReports.onField() method");
        
        switch(shirtNum) {
        case 1:
        	return "goalie";
        case 2:
        	return "left back";
        case 3, 4:
        	return "center back";
        case 5:
        	return "right back";
        case 6, 7, 8:
        	return "midfielder";
        case 9:
        	return "left wing";
        case 10:
        	return "striker";
        case 11:
        	return "right wing";
        	
        default: 
    		throw new IllegalArgumentException();
        }

    }

}
