package state;

import java.util.Scanner;

public class FanStateDemo {
    public static void main(String[] args) {
        Fan fan = new Fan();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println(fan);
            fan.pushButton();
            scanner.nextLine();
        }
    }
}
