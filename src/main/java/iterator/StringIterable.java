package iterator;

import java.util.Iterator;

public class StringIterable implements Iterable<Character>{
    private final String content;

    public StringIterable(String content) {
        this.content = content;
    }

    @Override
    public Iterator<Character> iterator() {
        return new CharIterator(content.length());
    }

    private class CharIterator implements Iterator<Character>{
        private int current;
        private final int lenght;

        public CharIterator(int lenght) {
            this.lenght = lenght;
        }

        @Override
        public boolean hasNext() {
            return current < lenght;
        }

        @Override
        public Character next() {
            return content.charAt(current++);
        }
    }
}
