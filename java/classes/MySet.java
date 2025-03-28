import java.util.HashSet;

public class MySet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(13);
        hs.add(14);

        hs.add(13); // do not added

        hs.remove(13);

        System.out.println(hs);
        System.out.println("size of set: " + hs.size());
        System.out.println("does contain: " + hs.contains(17));

    }
}
