public class Main {
    public static void main(String[] args) {
        int[] numbers = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15, lo = 0, hi = numbers.length - 1;
        boolean found = false;

        while (lo <= hi) {
            int mid = (lo + hi)/2, v = numbers[mid];
            System.out.println(v);
            if (v == key) {
                found = true;
                break;
            }
            else if (v < key)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        System.out.println(found);
    }
}