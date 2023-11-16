package ALL;


import java.io.*;

public class Sample3_16 {
    public static void main(String[] args) throws IOException {
        System.out.println("Please input an integer");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println("The number you entered is " + num);
    }
}