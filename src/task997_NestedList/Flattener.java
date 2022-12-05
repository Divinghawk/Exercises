package task997_NestedList;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Flattener{
	
//    List<T> inputList;  brauch man nicht, ist nur zur Sicherheit KEKW
    
    public Flattener(){    
    }
    public static List<Object> flatten(List<?> inputList){
           return inputList.stream()
               .flatMap(e -> e instanceof List ?
                       Flattener.flatten((List<?>) e).stream() :
                       Stream.of(e))
               .filter(Objects::nonNull)
               .collect(Collectors.toList());
    }
}
