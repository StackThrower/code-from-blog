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

    }

}
