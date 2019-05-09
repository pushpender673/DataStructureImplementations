package custom.util;

public interface CustomCollection<E> {

	boolean contains(Object o);

	boolean isEmpty();

	int size();

	boolean add(E e);

	boolean remove(Object o);

	boolean removeAll();

	boolean equals(Object o);

	int hashCode();

	void clear();

}
