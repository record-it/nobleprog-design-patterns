package observer;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menuItems = new ArrayList<>();

    public void print(){
        int[] number = {0};
        menuItems.forEach(i -> System.out.println(++number[0] +" " + i.label));
    }

    public void process(int number){
        menuItems.get(number - 1).action.run();
    }
}
