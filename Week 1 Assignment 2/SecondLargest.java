public class SecondLargest{
    public static void main(String args[]){
        int numbers[] = {4,56,12,34,24,46,77,89};
        int index;
        int firstLarge = 0;
        int secondLarge = 0;

        System.out.println("Input : {4,56,12,34,24,46,77,89}");
        
        for( index = 0; index < numbers.length; index ++ ){
            if(numbers[index] > firstLarge){
                firstLarge = numbers[index];
                
            }
        }
        for( index = 0; index < numbers.length; index ++ ){
            if(numbers[index] < firstLarge){
                secondLarge = numbers[index];
            }
        }
       
        System.out.println("Output : " +secondLarge);
    
    }
}