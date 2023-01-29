import java.io.PrintStream;

public class main{
    public static void main(String[]args){

        waiting_list Agus = new waiting_list("Agus","1");
        waiting_list Ahmad = new waiting_list("Ahmad","2");
        waiting_list Nizar = new waiting_list("Nizar", "3");
        waiting_list Rizab = new waiting_list("Rizab","4");
        waiting_list Rama = new waiting_list("Rama", "5");
        waiting_list Yadi = new waiting_list("yadi", "6");

        Queue queue = new Queue(12);

        queue.enqueue(Agus,1);
        queue.enqueue(Ahmad, 2);
        queue.enqueue(Nizar, 3);
        queue.enqueue(Rizab, 4);
        queue.enqueue(Rama,5);
        queue.enqueue(Yadi, 6);

        System.out.println(queue.peekRear());
        System.out.println(queue.size());

    }
}
