public class GT8 {

    public static void main(String[] args) {

        int[] numbers = {95, 6 , 11, 78, 8, 56, 2};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
            if (numbers[i] < min) {
                min = numbers[i];

            }

        }
        System.out.println("The smallest number is "+min);
        System.out.println("The biggest number is "+max);
    }
}


