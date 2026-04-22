import java.util.Stack;

public class ImplementQueueusingStacks {

    public ImplementQueueusingStacks() {

    }

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push(int x) {
        this.st1.push(x);
    }

    public int pop() {

        if (this.st2.isEmpty()) {

            while (!this.st1.isEmpty()) {
                this.st2.push(this.st1.pop());
            }
        }
        return this.st2.pop();

    }

    public int peek() {

        if (this.st2.isEmpty()) {

            while (!this.st1.isEmpty()) {
                this.st2.push(this.st1.pop());
            }
        }
        return this.st2.peek();

    }

    public boolean empty() {

        return this.st1.isEmpty() && this.st2.isEmpty();

    }

    public static void main(String[] args) {

    }

}
