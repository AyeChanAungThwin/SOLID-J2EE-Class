package io.github.ayechanaungthwin.solid.srp.model;

public interface Condition<T> {

	boolean isMatched(T item);
}
