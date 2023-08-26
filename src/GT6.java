import java.util.Scanner;

public class GT6 {

    public static void main(String[] args) {

        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100");

        int num =n.nextInt();
        int b=1;
        int c=0;
        while(b<= num)
        {
            if((num%b)==0)
                c=c+1;
            b++;
        }
        if(c==2)
            System.out.println(num +" is a prime number");
        else
            System.out.println(num +" is not a prime number");
    }
}





