public class OddEven{
    public static void main(String args[]){
        int numbers[] = {4,5,12,34,24,53,77,89};
        int index;

        System.out.println("Input : {4,5,12,34,24,53,77,89}");
        
        System.out.print("Even: [");
        for(index = 0; index < numbers.length; index ++){
            if(numbers[index] % 2 == 0){
                System.out.print(numbers[index] +",");
            }
    
        }
        System.out.println("]");
        System.out.print("Odd: [");
        for(index = 0; index < numbers.length; index ++){
            if(numbers[index] % 2 != 0){
                System.out.print(numbers[index] +",");
            }
        }
        System.out.print("]");
        

    }
}