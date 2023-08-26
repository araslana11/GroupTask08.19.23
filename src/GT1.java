public class GT1 {

    public static void main(String[] args) {

        int temp [] = {65,68,69,55,80,82,72};

        int highest=temp[0];
        int lowest=temp[0];
        for (int i:temp){
            if (i>highest){
                highest=i;
            }
            if (i<lowest){
                lowest=i;

            }

        }
        System.out.println(highest);
        System.out.println(lowest);

    }
}
/* 2 way, using for loop
int temp [] = {65,68,69,55,80,82,72};

        int highest=temp[0];
        int lowest=temp[0];
        for (int i=0; i<temp.length; i++){
            if (temp[i]>highest){
                highest=temp[i];
            }
            if (temp[i]<lowest){
                lowest=temp[i];

            }

        }
        System.out.println(highest);
        System.out.println(lowest);

    }
}
 */


