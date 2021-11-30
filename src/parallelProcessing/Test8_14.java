package parallelProcessing;
public class Test8_14 {

    public static void main(String[] args) {
        Stack s = new Stack();
        Thread a = new Thread(() -> s.push());
        Thread b = new Thread(() -> s.pop());
        a.start();
        b.start();
    }
}

class Stack {
    private boolean flag = false;
    synchronized public void push() {
        notify();
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                
            }
        }
        flag = true;
        System.out.print("push ");
    }
    
    synchronized public void pop() {
        if(!flag) {
            try {
                wait();
            } catch(InterruptedException e) {
                
            }
        }
        System.out.print("pop ");
    }
}