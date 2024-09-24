import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        System.out.println(arrayList);
        for (Integer x : arrayList) {
            System.out.println(x);
        }

        arrayList.add(1, 100);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println(arrayList.contains(2));
        System.out.println(arrayList.get(0));

        arrayList.set(0, 4000);

        System.out.println(arrayList.size());

        System.out.println(arrayList);
        System.out.println(arrayList.reversed());
        // Reverse an arrayList by loop
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(arrayList.get(arrayList.size() - i - 1));
        }
        System.out.println(arrayList2);
    }
}
