package com.interfaces.funcionales;

public interface Comparator {
    // Se eluden los métodos default y estáticos
    int compare(T o1, T o2);
    // El método equals(Object obj) es implicitamente implementado por la clase objeto.
    boolean equals(Object obj);
}
