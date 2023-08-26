public class GT101 {
    public static void main(String[] args) {

        int[] numbers = {-800, 5, -21, -78, -15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            }else if(numbers[i] > secondLargest && numbers[i] != largest){
                secondLargest = numbers[i];
            }
        }
        System.out.println(secondLargest);
    }
}