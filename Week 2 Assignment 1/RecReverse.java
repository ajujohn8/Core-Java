public class RecReverse{
    static void reverse(int num[],int first, int last){

        while(first<last){
        int swap = num[first];
        num[first] = num[last];
        num[last] = swap;
        first++;
        last--;
    } 
    }
    public static void main(String args[]){
        int numbers[] = {3,4,6,7,9,8};
        int lastArray = numbers.length;
        int firstArray = 0;

        reverse(numbers, firstArray, lastArray);

        for(int index = 0;index<numbers.length;index++){
            System.out.print("reverse output" +numbers[index]);
        }

    }
}