package io.github.ayechanaungthwin.solid.srp.model;

import java.util.List;

public interface Filter<T> {

	void filter(List<T> items, Condition<T> item);
}
