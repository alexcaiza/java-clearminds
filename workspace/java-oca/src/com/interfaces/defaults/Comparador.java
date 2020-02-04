package com.interfaces.defaults;

import java.util.Collections;
import java.util.Comparator;

public interface Comparador<T> {

    public static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return Collections.reverseOrder();
    }

}
