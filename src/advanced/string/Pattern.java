package advanced.string;

public class Pattern {
    public static void main(String[] args) {
        String st = "geeks for geeks";
        String pattern = "geeks";

        //printIdxPattern(st,pattern);
        //printDecimalAfter("12.582");
        follPatt("xxyyxxyy ");
    }

    static void printIdxPattern(String txt, String pattern){
        int pos = txt.indexOf(pattern);
        while (pos >=0){
            System.out.println(pos);
            pos = txt.indexOf(pattern, pos +1);
        }
    }

    static void printDecimalAfter(String txt){
        int pos = txt.indexOf(".");
        if(pos < 0){
            System.out.println("Invalid input");
        }

        System.out.println(txt.substring(pos + 1));
    }

        static void follPatt(String s1)
        {
            int n = (s1.length() - 1) / 2;
            String pat = "";

            for(int x = 0; x < n; x++){
                pat += "x";
            }

            for(int y = 0; y < n; y++){
                pat +="y";
            }
            System.out.println(pat);

            /*
            if(x == 0 && y == 0){
                System.out.println(1);
            }else {
                System.out.println(0);
            }


            System.out.println();

             */
        }
}
