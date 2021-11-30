package basics;
public class Test1_10 {

    public static void main(String[] args) {
        String str1 = "Duke";
        String str2 = new String("Duke");
        StringBuffer str3 = new StringBuffer("Duke");
        StringBuffer str4 = new StringBuffer("Duke");
        if(str1 == str2) {
            System.out.print("A");
        }
        if(str1.equals(str2)) {
            System.out.print("B");
        }
        if(str2.equals(str3)) {
            System.out.print("C");
        }
        if(str3 == str4) {
            System.out.print("D");
        }
        if(str3.equals(str4)) {
            System.out.print("E");
        }
    }
}
