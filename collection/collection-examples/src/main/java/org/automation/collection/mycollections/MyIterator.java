package org.automation.collection.mycollections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyIterator<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
