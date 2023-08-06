package advanced.string;

public class Panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(str));
    }

     static boolean isPangram(String str){
        if(str.length() < 26){
            return false;
        }
        boolean[] arr = new boolean[26];
        for(int i = 0; i < str.length(); i++ ){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                arr[str.charAt(i) -'a'] = true;
            }

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                arr[str.charAt(i) -'A'] = true;
            }

        }

        for(boolean e : arr){
            if(!e){
                return false;
            }
        }
        return true;
    }
}
