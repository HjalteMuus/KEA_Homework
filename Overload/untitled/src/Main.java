import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void out(String s) {
        System.out.println(s);
    }

    public static void out(int i){
        System.out.println(i);
    }

    public static void out(Integer I){
        System.out.println(I);
    }

    public static void out(char c) {
        System.out.println(c);
    }

    public static void main(String[] args) {
        out("Hello World");
        out(5);

        var obj = Integer.valueOf("ff", 16);
        out(obj);
        var obj2 = Integer.parseInt("1");
        out(obj2);

        int iMax = Integer.parseUnsignedInt("ffffffff", 16);
        out(iMax);

        int iMaxi = Integer.MAX_VALUE;
        out(iMaxi);

        int iMin = Integer.MIN_VALUE;
        out(iMin);

        try{
            int ierr = Integer.parseInt("45.5");
            out(ierr);
        } catch (NumberFormatException e) {
            out(e.getMessage());
        }

        out('1');

        char chi = '小';

        for (int i = 0; i < 20; i++) {
            chi += i;
            out(chi);
        }

        Set<Character> set = new HashSet<>();
        int i = 0;
        while(set.add((char)i)){
            i++;
        }
        out(set.size());
    }
}
