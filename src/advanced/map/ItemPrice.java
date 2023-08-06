package advanced.map;

public class ItemPrice {
    public static void main(String[] args) {
        MyDS myDS = new MyDS();

        myDS.add(10,"Coke");
        myDS.add(5,"Fanta");
        myDS.add(20,"Sprite");

        myDS.printSorted();
        System.out.println("Greatest");
        myDS.printGreatestSorted(7);
        System.out.println("Lowest");
        myDS.printLowestSorted(20);

        System.out.println("Find");
        System.out.println(myDS.find(20));
    }
}
