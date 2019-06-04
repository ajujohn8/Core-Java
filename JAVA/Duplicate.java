public class Duplicate{
    public static void main(String args[]){
        int numbers[] = {4,56,2,34,56,4,78,99, 56};
        int index;
        int secindex = 0;
        int count = 0;

        System.out.println("Input : {4,56,2,34,56,4,78,99, 56}");

        for(index = 0; index < numbers.length; index ++){
            for(secindex = index + 1; secindex < numbers.length; secindex ++){
                if(numbers[index] == numbers[secindex]){
                    System.out.println(numbers[index]);
                    count++;
                    
                }

            }
         
        }
        
        
    } 
}