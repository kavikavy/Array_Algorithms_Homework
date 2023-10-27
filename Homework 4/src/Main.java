import ibcsutils.ReadViaURL;
public class Main {
    public static void main(String[] args) {
        String addr = "https://www-personal.umich.edu/~jlawler/wordlist";
        String[] words = ReadViaURL.readWords(addr, true, true, true);
        String key = "hix";
        boolean found = false;
        //Sequential Search
        for (String word : words)
            if (word.equals(key)) {
                found = true;
                break;
            }
        System.out.println(found);

        //Binary Search
        int lo = 0, hi = words.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            String v = words[mid];
            if (v.equals(key)) {
                found = true;
                break;
            }
            else if (v.compareTo(key) < 0)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        System.out.println(found);
    }
}

