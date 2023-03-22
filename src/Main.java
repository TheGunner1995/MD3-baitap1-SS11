import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        // thêm vào
        stacks.push("hieu");
        stacks.push("khiet");
        stacks.push("nam");
        stacks.push("nhan");
        stacks.push("hung");
        System.out.println(stacks);

        // đảo ngược
        Stack<String> newStack = new Stack<>();
        for (int i = 0; i < stacks.size(); i++) {
            newStack.push(stacks.pop());
            i--;
        }
        System.out.println(newStack);


    }
}