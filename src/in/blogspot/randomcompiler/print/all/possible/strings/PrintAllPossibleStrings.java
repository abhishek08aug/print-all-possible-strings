package in.blogspot.randomcompiler.print.all.possible.strings;

public class PrintAllPossibleStrings {
    private static int count = 0;
    
    public static void printAllPossibleStrings(StringBuilder prefix, char[] chars, int length) {
        if(length == 0) {
            count++;
            System.out.println(prefix.toString());
            return;
        }
        for(int i=0; i<chars.length; i++) {
            StringBuilder prefixPlusOne = new StringBuilder();
            prefixPlusOne.append(prefix.toString());
            prefixPlusOne.append(chars[i]);
            printAllPossibleStrings(prefixPlusOne, chars, length-1);
        }
    }
    
    public static void printCount() {
        System.out.println("No. of possible strings: " + count);
    }
    
    public static void resetCount() {
        count = 0;
    }
}
