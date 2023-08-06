package advanced.deque;

public class MainForMyData {
    public static void main(String[] args) {
        MyData<Integer> myDS = new MyData<>();

        myDS.insertMax(20);
        myDS.insertMax(25);
        myDS.insertMax(26);
        myDS.insertMax(28);
        myDS.insertMin(6);
        myDS.insertMin(5);
        myDS.insertMin(4);


        myDS.getMax();
        myDS.getMin();


    }
}
