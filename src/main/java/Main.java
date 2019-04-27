import java.util.Arrays;
import java.util.List;

public class Main {

    public static String printerError(String s) {

        String[] strchar = s.split("");
        List<String> strcharList = Arrays.asList( strchar );

        long amount = strcharList.stream()
                .filter( n-> n.equals("n")
                        || n.equals("o")
                        || n.equals("p")
                        || n.equals("q")
                        || n.equals("r")
                        || n.equals("s")
                        || n.equals("t")
                        || n.equals("u")
                        || n.equals("v")
                        || n.equals("w")
                        || n.equals("x")
                        || n.equals("y")
                        || n.equals("z"))
                .count();

        String result = "";
        result = result + amount +"/"+ s.length();

        return  result;

    }


    public static String printerErrorCOdeWars(String s) {
        return s.chars().filter(c -> c > 'm').count() + "/" + s.length();
    }




}
