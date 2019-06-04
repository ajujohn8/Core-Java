public class SumNumbers{
    public static void main(String args[]){
        int numbers[] = {12,23,1,23,5,6,67};
        int index;
        int sumofnumbers = 0;

        System.out.println("Input : {12,23,1,23,5,6,67}");

        for( index = 0; index < numbers.length; index++){
            sumofnumbers = sumofnumbers + numbers[index]; 
        }
            System.out.println("Output : " +sumofnumbers);
        
    } 
}