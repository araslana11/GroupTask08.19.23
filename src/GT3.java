public class GT3 {

    public static void main(String[] args) {

        int [][] numbers={
                {23,34,12,56,11},
                {17,89,45,22,}
        };
    /*for(int i=0;i<numbers.length; i++){
        for (int y=0; y<numbers[i].length; y++){
            if(numbers[i][y]%2==0){
                System.out.println(numbers[i][y]);
            }
        }
        }*/
        for (int[] row:numbers){
            for (int col:row){

                if (col%2==0){
                    System.out.println(col);



                }
            }


        }
    }

}
