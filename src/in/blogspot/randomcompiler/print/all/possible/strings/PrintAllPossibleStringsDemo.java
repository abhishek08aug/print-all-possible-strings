package in.blogspot.randomcompiler.print.all.possible.strings;

public class PrintAllPossibleStringsDemo {

    public static void main(String[] args) {
       PrintAllPossibleStrings.printAllPossibleStrings(new StringBuilder(), new char[]{'a', 'b', 'c'}, 3);
       PrintAllPossibleStrings.printCount();
       PrintAllPossibleStrings.resetCount();
       
       PrintAllPossibleStrings.printAllPossibleStrings(new StringBuilder(), new char[]{'a', 'b', 'c'}, 3);
       PrintAllPossibleStrings.printCount();
       PrintAllPossibleStrings.resetCount();
       
       PrintAllPossibleStrings.printAllPossibleStrings(new StringBuilder(), new char[]{'a', 'b', 'c', 'd'}, 1);
       PrintAllPossibleStrings.printCount();
       PrintAllPossibleStrings.resetCount();

       PrintAllPossibleStrings.printAllPossibleStrings(new StringBuilder(), new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'}, 3);
       PrintAllPossibleStrings.printCount();
       PrintAllPossibleStrings.resetCount();       
    }

}
