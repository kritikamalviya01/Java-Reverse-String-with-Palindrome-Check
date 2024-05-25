package org.demo;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String Original = "Reverse String";
        String palindrome = "madam";
        String value = reverse(Original);
        String value2 = reverse(palindrome);
        reverse2(Original);
        reverse3(Original);
        checkPalindrome(Original, value);
        checkPalindrome(palindrome, value2);
    }

    // Reversing String in normal method
    public static String reverse(String value){
        String rev = "";
        char val;

        for(int i=0; i< value.length(); i++){
            val = value.charAt(i);
            rev = val+rev;
        }
        System.out.println("Normal reverser: "+ rev);
        return rev;
    }

    //Reversing String using String Buffer

    public static String reverse2(String value){
        StringBuffer str = new StringBuffer();
        String rev = str.append(value).reverse().toString();
        System.out.println("Reverse using StringBuffer: "+ rev);
        return rev;
    }

    // Reverse using String Builder

    public static String reverse3(String value){
        StringBuilder str = new StringBuilder(value);
        String rev = str.reverse().toString();
        System.out.println("Reverse using StringBuilder: "+ rev);
        return rev;
    }

    // Check id String is palindrome or not

    public static void checkPalindrome(String original, String value){
        boolean check = false;
        check = original.equals(value);
        if(check == true){
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("is Not Palindrome");
        }
    }
}