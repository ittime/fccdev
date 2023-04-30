import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String myString = "This is a {sample} string with {multiple} {placeholders}.";
        Pattern pattern = Pattern.compile("\\{([^}]+)}");
        Matcher matcher = pattern.matcher(myString);
        
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println(match);
        }
    }
}
