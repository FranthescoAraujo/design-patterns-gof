package patterns.Iterator.pattern;

import java.util.Iterator;
import java.util.List;

public class Iterador<T> implements Iterable<T> {

    private List<T> list;

    public Iterador(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorIterator();
    }

    private class IteradorIterator implements Iterator<T> {

        private int index;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            if (hasNext()) {
                return list.get(index++);
            }
            return null;
        }

    }
    
}
