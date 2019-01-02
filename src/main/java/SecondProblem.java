public class SecondProblem {
    private static void getTwoDigits(int[] mainArray, int target){
        int[] tempArray = new int[mainArray.length];
        for(int i = 0; i < mainArray.length; i++){
            int minus = target - mainArray[i];
            if(minus <= 0)
                break;
            tempArray[i] = minus;
        }
        tempArray = SecondProblem.reverseArray(tempArray);
        int mainIndex = 0;
        int tempIndex = 0;
        while(mainIndex < mainArray.length && tempIndex < mainArray.length){
            if(mainArray[mainIndex] == 0 || tempArray[tempIndex] == 0)
                break;
            if(mainArray[mainIndex] == tempArray[tempIndex]){
                String output = Integer.toString(mainArray[mainIndex]) + " - " + Integer.toString(target - mainArray[mainIndex]);
                System.out.print(output);
                return;
            }
            if(mainArray[mainIndex] < tempArray[tempIndex])
                mainIndex += 1;
            else
                tempIndex += 1;
        }
        System.out.print("nothing found");
    }

    private static int[] reverseArray(int[] mainArray){
        for(int i = 0; i < mainArray.length / 2; i++){
            int temp = mainArray[i];
            mainArray[i] = mainArray[mainArray.length - i - 1];
            mainArray[mainArray.length - i - 1] = temp;
        }
        return mainArray;
    }

    public static void main(String args[]){
        int[] mainArray = {1,2,3,4};
        SecondProblem.getTwoDigits(mainArray,6 );
    }
}
