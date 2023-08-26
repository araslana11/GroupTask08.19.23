public class GT9 {
    public static void main(String[] args) {

        int num;
        int numbers[] = {-5, -35, -71, -22, -48};

        for(int i = 0; i<numbers.length; i++ ){
            for(int j = i+1; j<numbers.length; j++){

                if(numbers[i]>numbers[j]){

                    num = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = num;
                }
            }
        }
        System.out.println(numbers[numbers.length-2]);

    }
}


