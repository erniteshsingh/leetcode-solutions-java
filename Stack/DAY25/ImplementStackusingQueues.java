import java.util.Queue;
import java.util.LinkedList;

class implementStackusingQueue {

    public implementStackusingQueue() {

    }

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {

        this.queue2.add(x);

        while (!this.queue1.isEmpty()) {
            this.queue2.add(this.queue1.poll());
        }

        while (!this.queue2.isEmpty()) {
            this.queue1.add(this.queue2.poll());
        }
    }

    public int pop() {
        return this.queue1.poll();
    }

    public int top() {
        return this.queue1.peek();
    }

    public boolean empty() {
        return this.queue1.isEmpty();
    }

    public static void main(String[] args) {

    }
}