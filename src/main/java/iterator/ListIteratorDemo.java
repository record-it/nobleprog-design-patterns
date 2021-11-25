package iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        final List<String> names = List.of("Adam", "Karol", "Ewa", "Ola", "Robert");

        for(var iterator = names.iterator(); iterator.hasNext();){
            final String name = iterator.next();
            System.out.println(name);
        }

        for(String name: names){
            System.out.println(name);
        }

        LinkedList<String> linkedList = new LinkedList<>(names);
        final ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            String name = listIterator.next();
            if (name.startsWith("O")){
                listIterator.remove();
            }
        }
        System.out.println(linkedList);
        System.out.println("Przeglądanie od końca do poczatku listy imion!");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex() +" " + listIterator.previous());
        }
    }
}
