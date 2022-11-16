package task992_List_Enum;

//You and your fellow cohort of those in the "know" when it comes to binary 
//decide to come up with a secret "handshake".
//
//1 = wink
//10 = double blink
//100 = close your eyes
//1000 = jump
//
//
//10000 = Reverse the order of the operations in the secret handshake.
//Given a decimal number, convert it to the appropriate sequence of events for a secret handshake.
//
//Here's a couple of examples:
//
//Given the input 3, the function would return the array ["wink", "double blink"] 
//		because 3 is 11 in binary.
//
//Given the input 19, the function would return the array ["double blink", "wink"] 
//		because 19 is 10011 in binary. Notice that the addition of 16 (10000 in binary) 
//		has caused the array to be reversed.


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {
			
	
	private final int WINK            = 0b0001;
    private final int DOUBLE_BLINK    = 0b0010;
    private final int CLOSE_YOUR_EYES = 0b0100;
    private final int JUMP            = 0b1000;
    private final int REVERSE         = 0b10000;
    
    List<Signal> calculateHandshake(int number) {
    	
        final var signals = new ArrayList<Signal>(4);
        
        for (var signal: Signal.values()){
            switch(signal) {
                case WINK: 
                    if(checkSignal(number, WINK)) 
                    	signals.add(signal);
                    break;
                case DOUBLE_BLINK: 
                    if(checkSignal(number, DOUBLE_BLINK)) 
                    	signals.add(signal);
                    break;
                case CLOSE_YOUR_EYES: 
                    if(checkSignal(number, CLOSE_YOUR_EYES)) 
                    	signals.add(signal);
                    break;
                case JUMP: 
                    if(checkSignal(number, JUMP)) 
                    	signals.add(signal);
                    break;
                default: /* ignore unknown signal*/ break;
            }
        }
        if(checkSignal(number, REVERSE)) Collections.reverse(signals);
        return signals;
    }
    
    private static boolean checkSignal( final int number, final int signal ) {
        return (number & signal) == signal;
    }
}