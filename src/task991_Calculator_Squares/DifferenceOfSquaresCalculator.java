package task991_Calculator_Squares;

public class DifferenceOfSquaresCalculator {
	
    int computeSquareOfSumTo(int input) {
        int sum = 0 ;
        
        for(int i = 0 ; i <= input ; i++){
            sum += i;
            
        }
        return sum*sum;
    }

    int computeSumOfSquaresTo(int input) {
        
        int sum2 = 0;
        for(int i = 0 ; i <= input ; i++){
            
            sum2 += i*i;
        }
        return sum2;
    }

    int computeDifferenceOfSquares(int input) {
        int sum = 0 ;
        int sum2 = 0;
        for(int i = 0 ; i <= input ; i++){
            sum += i;
            sum2 += i*i;
        }
        return sum*sum - sum2;
    }
}
