//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Module 6 Assignment

        System.out.println("countZeros: "+ countZeros("0001000abcdef586485975324654 6543654465465465654zxjuf;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000006800000"));

        System.out.println("countDecimals: "+ countDecimals("0001000abcdef586485975324654 6543654465465465654zxjuf;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000006800000"));

        System.out.println("DigitCounter: "+ DigitCounter("0001000abcdef586485975324654 6543654465465465654zxjuf;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000006800000"));


    }
    // Assignment Module 6

//Assignment Solution
    public static int countDecimals(String str) {
        return countDecimalsHelper(str, 0);
    }

    private static int countDecimalsHelper(String str, int index) {
        if (index == str.length()) {
            return 0;
        } else if (str.charAt(index) >= '0' && str.charAt(index) <= '9') {
            return 1 + countDecimalsHelper(str, index + 1);
        } else {
            return countDecimalsHelper(str, index + 1);
        }
    }

//Assignment Solution 2
    public static int DigitCounter(String data){
        return DigitCounterAssigner(data,0);
    }
    private static int DigitCounterAssigner(String data, int Digits){
        if (Digits == data.length() )
            return 0;
        else if ( data.charAt(Digits) >= '0' && data.charAt(Digits) <= '9' ) {
            return 1 + DigitCounterAssigner(data, Digits + 1);
        }else {
            return  DigitCounterAssigner(data, Digits + 1);
        }
    }

















// Assignment Example
    public static int countZeros(String str) {
        String currentChar = "";
        if (str.length() > 0)
            currentChar = str.substring(0, 1);
        else
            return 0;
        if (str.length() == 0)
            return 0;
        else if (str.length() > 0 && currentChar.equals("0"))
            return countZeros(str.substring(1, str.length())) + 1;
        else if (str.length() > 0 && !currentChar.equals("0"))
            return countZeros(str.substring(1, str.length()));
        else
            return 0;
    }





























































//In Class Assignment
    /*
           System.out.println(countZeros("0001000abcdef586485975324654 6543654465465465654zxjuf;gmlvnsrutmg;oisauit'pmvsaiaism'gtfoisa'iretpkyi9[-w0595768681687 +ias;fmpoiujasldjfmasd;f574697612000006800000"));

    // class assignment
    //   String s = "001203252554465 Hi My Name is Asim Razzaq 0123450 ";
    //   System.out.println(countzeros(s));
    //   System.out.println(countDigits(s, 0));

}

     */


    //In Class Assignment
/*    public static int countzeros(String s) {
        if (s.length() == 0)
            return 0;
        else if (s.length() == 1) {
            if (s.charAt(0) == '0')
                return 1;
            else {
                return 0;
            }
        } else {
            if (s.charAt(0) == '0')
                return countzeros(s.substring(1, s.length())) + 1;
            else
                return countzeros(s.substring(1, s.length()));
        }

    }

 */

    //Digit counter
/*
    public static int countDigits(String s, int counter) {
        // base case digit counter = length
        if (counter >= s.length()) {
            return 0;
        }
        // in order to get current digit create a char reader for the counter
        char currentDigit = s.charAt(counter);
        // get the current digit
        if (Character.isDigit(currentDigit)) {
            return 1 + countDigits(s, counter + 1);     // if char +1 to counter and go next
        } else {
            return countDigits(s, counter + 1);        // if not go next
        }

    }

 */


}






