
public class Reverse{
    public static void main(String args[]){
        int numbers[] = {4,23,1,12,67};
        int index;
        int n = numbers.length;
        int reverseNumbers[] = new int[n];
        
        System.out.println("Input : {4,23,1,12,67}");

        for(  index = 0; index < numbers.length; index ++)
        {
            reverseNumbers[n - 1] = numbers[index];
            n = n - 1;
        }
        System.out.print("Output : {");

        for( int secondindex = 0; secondindex < numbers.length; secondindex ++){
            System.out.print(reverseNumbers[secondindex]+ ",");
        }
        System.out.println("}");
    }
}
s