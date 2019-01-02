import java.util.HashMap;
import java.util.Map;

public class FirstProblem {
    private static void showSimilarValues(int[] mainArray){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i < mainArray.length; i++){
            if(!map.containsKey(mainArray[i]))
                map.put(mainArray[i],1);
            else
                map.put(mainArray[i], map.get(mainArray[i]) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            if(entry.getValue() > 1)
                System.out.print(entry.getKey().toString() + " - ");
    }
    public static void main(String[] args){
        int[] mainArray = {1,2,3,4,6,7,2,4,7,9,6,4,75775,6767676,676767676,654,34,45,65,67,67,6,4,5344,34};
        FirstProblem.showSimilarValues(mainArray);
    }

}
