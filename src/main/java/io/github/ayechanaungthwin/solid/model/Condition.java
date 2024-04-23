package io.github.ayechanaungthwin.solid.model;

public interface Condition<T> {

	boolean isMatched(T item);
}
