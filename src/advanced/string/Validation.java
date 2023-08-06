package advanced.string;

public class Validation {
    public static void main(String[] args) {
        String str = "eHello123@";
        System.out.println(validate(str));
    }

    public static boolean validate(String str)
    {
        if(str.length() < 10){
            return false;
        }
        int numericCharacter = 0;
        int uppercaseCharacter = 0;
        int lowercaseCharacter = 0;
        int specialCharacter = 0;
        String special = "@#$-*";

       str = str.toLowerCase();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                numericCharacter++;
            }

            if(Character.isUpperCase(ch)){
                uppercaseCharacter++;
            }

            if(Character.isLowerCase(ch)){
                lowercaseCharacter++;
            }

            if(special.indexOf(ch) != -1 ){
                specialCharacter++;
            }

        }

        return numericCharacter >= 1 && uppercaseCharacter >= 1 && lowercaseCharacter >= 1 && specialCharacter >= 1;
    }
}
