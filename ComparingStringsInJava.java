import java.util.Objects;

public class ComparingStringsInJava {

    void compareByObjectsClass() {
        String oneString = "Stack Throw";
        String twoString = new String("Stack Throw");

        System.out.println("Object.equals(one, two):" + Objects.equals(oneString, twoString));
    }

    void compareByEquals() {
        String oneString = "Stack Throw";
        String twoString = new String("Stack Throw");

        System.out.println("oneString.equals(twoString):" + oneString.equals(twoString));
    }

    void compareByCompareTo() {
        String oneString="Stack Throw";
        String twoString="Stack Throw";
        String threeString="Stack Overflow";

        System.out.println(oneString.compareTo(twoString)); // 0
        System.out.println(oneString.compareTo(threeString)); // -1 (because s1 < s3)
        System.out.println(threeString.compareTo(oneString)); // 1 (because s3 > s1 )
    }

    void compareByOperator() {
        String oneString = "Stack Throw";
        String twoString = new String("Stack Throw");
        String threeString = "Stack Throw";

        System.out.println("oneString == twoString:" + (oneString == twoString));
        System.out.println("oneString == threeString:" + (oneString == threeString));
    }


    public static void main(String[] params) {
        ComparingStringsInJava obj = new ComparingStringsInJava();

        obj.compareByObjectsClass();
        obj.compareByOperator();
        obj.compareByEquals();
        obj.compareByCompareTo();

    }

}
