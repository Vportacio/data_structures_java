package Queue;

abstract class QueueBase<T> {

    public void add(T arg) { } // add item

    public T peek() { return null; } // retorna o início da fila, null se estiver nula

    public T poll() { return null; } // retorna e remove o final da fila

    public void show() { }
}
