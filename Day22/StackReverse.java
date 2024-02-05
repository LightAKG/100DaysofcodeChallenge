import java.util.Stack;

public class StackReverse {
    public static void pushAtBottom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

    public static void reverse(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        } 
        int top = s.pop();
        reverse(s);    
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverse(stack);
        // pushAtBottom(4, stack);

        while(!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
