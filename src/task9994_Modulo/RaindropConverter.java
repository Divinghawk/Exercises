package task9994_Modulo;

// The modulo operator, denoted by %, is an arithmetic operator. The modulo division operator produces the remainder of an integer division. 

class RaindropConverter {

    String convert(int number) {
        StringBuilder sb = new StringBuilder("");
        if(number%3==0) sb.append("Pling");
        if(number%5==0) sb.append("Plang");
        if(number%7==0) sb.append("Plong");
        if(sb.toString().equals("")) sb.append(number);
        return sb.toString();
    }
    
}
