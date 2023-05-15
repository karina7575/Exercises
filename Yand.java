import java.io.*;
import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Yand {
    public static void main(String[] args) throws Exception {

        int a,b,c;
        Scanner scan = new Scanner(new File("notes.txt"));
        a = scan.nextInt();
        b = scan.nextInt();
        c=a+b;
        try (PrintWriter out = new PrintWriter("file.txt", StandardCharsets.UTF_8)) {
            out.print(c);
        }
    }
}
