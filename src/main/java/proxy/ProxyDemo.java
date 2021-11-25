package proxy;

import java.util.Random;
import java.util.Scanner;

public class ProxyDemo {
    static Random random = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            final Message hello = getMessage("Hello");
            String content = hello.content();
            System.out.println(content);
            scanner.nextLine();
        }
    }

    public static Message getMessage(String content){
        if (random.nextBoolean()){
            return new EmailMessage(content);
        } else {
            return new ProxyMessage(new EmailMessage(content));
        }
    }
}
