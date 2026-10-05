
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String text = "This is an example for a presentation!";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}


