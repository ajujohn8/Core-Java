public class LargeSmall{
    public static void main(String args[]){
        int numbers[] = {2,34,12,29,5,6,67,45};
        int index;
        int largeNumber = 0;
        int smallNumber = 0;

        System.out.println("Input : {2,34,12,29,5,6,67,45}");
        
        for( index = 0; index < numbers.length; index ++ ){
            if(numbers[index] > largeNumber){
                largeNumber = numbers[index];
                smallNumber = largeNumber;
            }
        }
        for( index = 0; index < numbers.length; index ++ ){
            if(numbers[index] < smallNumber){
                smallNumber = numbers[index];
            }
        }
            
        
        System.out.println("Largest - " +largeNumber);
        System.out.println("Smallest - " +smallNumber);
    }
}