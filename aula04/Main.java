package aula04;
class Main {
    public static void main(String []args){

        FilaC fila = new FilaC(6);
        fila.enqueue(27);
        fila.enqueue(43);
        fila.enqueue(3);
        fila.enqueue(29);
        fila.enqueue(31);
        fila.enqueue(52);

        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());


    }

    {

    }
}