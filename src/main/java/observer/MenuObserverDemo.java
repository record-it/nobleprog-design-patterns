package observer;

import java.util.Scanner;

public class MenuObserverDemo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuItems.add(
          MenuItem.builder()
                  .label("Wczytaj plik")
                  .action(
                  () -> {
                      System.out.println("Podaj nazwę pliku");
                  }
          ).build()
        );
        menu.menuItems.add(
                MenuItem.builder()
                        .label("Wyjście")
                        .action(
                                () -> {
                                    System.exit(0);
                                }
                        ).build()
        );
        Scanner scanner = new Scanner(System.in);
        while(true) {
            menu.print();
            int option = scanner.nextInt();
            menu.process(option);
        }
    }

}
