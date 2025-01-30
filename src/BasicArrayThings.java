public class BasicArrayThings {

    public static void main(String[] args) {
        int[] array = {87, 93, 12, 25, 36};


        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println("Max: " + max);
    }
}

