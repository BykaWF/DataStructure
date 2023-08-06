package advanced.map;

public class Main {
    public static void main(String[] args) {
        MyDS2 myDS2 = new MyDS2();

        myDS2.add(20,"Coke");
        myDS2.add(20,"Fanta");
        myDS2.add(20,"Sprite");
        myDS2.add(10,"Watter");
        myDS2.add(5,"Gummy");
        myDS2.add(30,"Potato");

        System.out.println("Great - > 5");
        myDS2.printGreatestSorted(5);
        System.out.println("____________");
        System.out.println("lowest - > 30 ");

        myDS2.printLowestSorted(30);



    }
}
