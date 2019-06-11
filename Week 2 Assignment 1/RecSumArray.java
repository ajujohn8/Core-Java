public class RecSumArray{
    static int sumofarray(int num[],int length){
        if(length == 0){
            return 0;

        }
        else
        return (sumofarray(num, length - 1) + (num[length-1]));

    }
    public static void main(String args[]){
           
        int numbers[] = {3,4,2,7,9};
        int length1 = numbers.length;
        int x = sumofarray(numbers,length1);
        System.out.print("sum of array: ");
        System.out.print(x);
    }
}