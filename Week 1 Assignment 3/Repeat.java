public class Repeat{
    public static void main(String args[]){
        int numbers[] ={3,4,56,2,56,6,78,2};
        

        for(int index = 0; index < numbers.length; index ++){
           for(int secondIndex = index + 1 ; secondIndex < numbers.length; secondIndex ++){
                if(numbers[index] == numbers[secondIndex]){
                    { 
                
                       System.out.println(numbers[index]);
                    }
                }
           }
        }
       
      

        
    }      

}