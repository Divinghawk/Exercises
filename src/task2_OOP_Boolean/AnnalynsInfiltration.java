package task2_OOP_Boolean;

public class AnnalynsInfiltration {
	
	
	public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (!knightIsAwake && !archerIsAwake && prisonerIsAwake) || (!archerIsAwake && petDogIsPresent);
    }
	
//    public static boolean canFastAttack(boolean knightIsAwake) {
//        if (knightIsAwake = true) {
//			return false;			
//		}	else {
//			return true;
//			}
//    }
//
//    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
//        if (knightIsAwake != true && archerIsAwake != true && prisonerIsAwake != true) {
//			return false;			
//		} 	else {
//			return true;
//			}	
//    }
//
//    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
//      
//        if (archerIsAwake != true && prisonerIsAwake != false) {
//			return true;			
//		}	else {
//			return false;
//			}		
//    }
//
//    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
//    	
//        if (petDogIsPresent  && !archerIsAwake) { // 1. Rule Dog present, archer asleep
//            return true;
//        // 2. Rule Dog not present
//        } else if (prisonerIsAwake && !knightIsAwake && !archerIsAwake) { 
//            return true;
//        } else {
//            return false;
//        }
    	
    
}
