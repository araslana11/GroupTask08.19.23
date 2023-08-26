public class GT4 {

    public static void main(String[] args) {

        int [][] numbers= {
                {12,45,34,87},
                {65,23,56,81}
        };
        int sumEven=0;
        int sumOdd=0;
   /*
   for (int i=0; i<numbers.length; i++){
       for(int y=0; y<numbers[i].length; y++){

           if (numbers[i][y]%2==0) {
               sumEven = sumEven + numbers[i][y];
           }else{
               sumOdd=sumOdd+numbers[i][y];

           }

       }
   }
        System.out.println(sumEven);
        System.out.println(sumOdd);*/

        for (int [] row:numbers){
            for (int col:row){
                if (col%2==0){
                    sumEven=sumEven+col;
                }else{
                    sumOdd=sumOdd+col;
                }
            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }

}



