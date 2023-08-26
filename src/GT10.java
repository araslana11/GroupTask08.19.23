public class GT10 {
    public static void main(String[] args) {

        String[] elements = {"City", "Town", "City", "Country", "Country"};

        for (int i = 0; i < elements.length; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if (elements[i].equals(elements[j])) {
                    System.out.println(elements[i]);
                    break;
                }

            }

        }
    }
}

//write a programm to print out duplicate elements from an Array of Strings
