public class Main {
    public static void main(String[] args) {
        int[] a = {-4, 11, 7, -12, 6, 1};

        for (int i = 0; i < a.length - 1; i++) {
            int smallestInd = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallestInd])
                    smallestInd = j;
            }

            if (i != smallestInd) {
                //swap a[i] and a[smallestInd]
                int temp = a[i];
                a[i] = a[smallestInd];
                a[smallestInd] = temp;
            }

            for (int v : a)
                System.out.print(v + " ");
            System.out.println();
        }

        System.out.println();

        //bubble sort
        int[] vals = {-4, 11, 7, -12, 6, 1};
        int passes = 0;
        boolean running = true;
        while (running) {
            running = false;
            for (int i = 1; i < vals.length - passes; i++) {
                if (vals[i] < vals[i - 1]) {
                    swap(vals, i, i - 1);
                    running = true;
                }
            }
            passes++;

            for (int val : vals) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    static void swap(int[] array, int ind1, int ind2) {
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}