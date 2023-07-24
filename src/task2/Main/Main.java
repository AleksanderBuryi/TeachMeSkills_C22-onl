package task2.Main;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t === Homework 13. Additional task. Task 2 ===\n");
        CustomArrayList<Integer> list = new CustomArrayList<>();
        for (int i = 0; i < list.length(); i++) {
            list.add(i+1);
        }
        System.out.println(list);

        System.out.println("Contains 2: " + list.contains(2));
        System.out.println("Contains 20: " + list.contains(20));
        System.out.println();

        System.out.println("Get index 1: " + list.get(1));

        System.out.println();

        list.remove(1);
        System.out.println("After removing:\n\t " + list);

        list.add(0);
        list.add(12);
        System.out.println("Dynamic expansion of collection size:\n\t " + list);
        System.out.println();

        //---------------------------------------

        CustomArrayList<String> slist = new CustomArrayList<>(3);
        slist.add("Sonya");
        slist.add("Andrew");
        slist.add("Sergei");
        System.out.println(slist);

        System.out.println("Contains Andrew: " + slist.contains("Andrew"));
        System.out.println("Contains Artem: " + slist.contains("Artem"));

        System.out.println();

        System.out.println("Get index 2: " + slist.get(2));

        System.out.println();

        System.out.println(list);
        System.out.println("length before clear: " + list.length());
        System.out.println(slist);
        System.out.println("length before clear: " + slist.length());

        System.out.println();
        list.clear();
        slist.clear();

        System.out.println(list);
        System.out.println("length after clear: " + list.length());
        System.out.println(slist);
        System.out.println("length after clear: " + slist.length());

    }
}
