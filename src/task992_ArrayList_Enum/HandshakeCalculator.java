package task992_ArrayList_Enum;

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
                    if(checkSignal(number, WINK)) signals.add(signal);
                    break;
                case DOUBLE_BLINK: 
                    if(checkSignal(number, DOUBLE_BLINK)) signals.add(signal);
                    break;
                case CLOSE_YOUR_EYES: 
                    if(checkSignal(number, CLOSE_YOUR_EYES)) signals.add(signal);
                    break;
                case JUMP: 
                    if(checkSignal(number, JUMP)) signals.add(signal);
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