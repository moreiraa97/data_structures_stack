public class App {
    public static void main(String[] args) throws Exception {
        

        Stack myStack = new Stack();

        myStack.push(new Node(1));
        myStack.push(new Node(2));
        myStack.push(new Node(3));
        myStack.push(new Node(4));
        myStack.push(new Node(5));
        myStack.push(new Node(6));

        System.out.println(myStack);

        myStack.pop();

        System.out.println(myStack);

        myStack.push(new Node(67));

        System.out.println(myStack);


    }
}
