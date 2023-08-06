package advanced.Lamda;

    // No parameter Lambda expression
    interface Test{
        void print();
    }

    //Single parameter Lambda expression
    interface Test2{
        void print(Integer p);
    }
    // Multi parameter Lambda expression
    interface Test3{
        void print(Integer a, Integer b);
    }
public class Lambda {
    static void noParameter(ArrayList1 test){
       // test.print();
    }

    static void OneParameter(Test2 test2, Integer p){
        test2.print(p);
    }

    static void multiParameter(Test3 test3,Integer a, Integer b){
        test3.print(a,b);
    }

    public static void main(String[] args) {
        //noParameter(() -> System.out.println("Hello"));
        OneParameter(p -> System.out.println(p), 10);
        multiParameter((a,b) -> System.out.println(a + b),10, 20);

        //Single line Multiple

        /*
        noParameter(p -> {
            if( p % 2 == 0)
                return true;
            else
                return false;
        });

         */
    }
}
