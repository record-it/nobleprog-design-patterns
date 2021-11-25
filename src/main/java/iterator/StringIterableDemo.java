package iterator;

public class StringIterableDemo {
    public static void main(String[] args) {
        StringIterable s = new StringIterable("ABCDE");
        for(char c: s){
            System.out.println(c);
        }
    }
}
