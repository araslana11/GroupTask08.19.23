public class GT2 {

    public static void main(String[] args) {

        int [] numbers={12,34,56,87};
        /*int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);*/

        int sum=0;
        for (int num:numbers){
            sum=sum+num;
        }
        System.out.println(sum);
    }

}



