package Colas;

public class Main {
    public static void main(String[] args){
        ArrayQueue<Integer> cola=new ArrayQueue();

        cola.enqueue(5);
        cola.enqueue(2);
        cola.enqueue(8);

        System.out.println(cola);

        cola.dequeue();
        System.out.println(cola);

        System.out.println(cola.first());
    }
}
