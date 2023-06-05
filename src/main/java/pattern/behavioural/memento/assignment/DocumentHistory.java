package pattern.behavioural.memento.assignment;

import java.util.Stack;

public class DocumentHistory {
    private final Stack<DocumentMemento> stack = new Stack<>();

    public void push(DocumentMemento state){
        stack.push(state);
    }

    public DocumentMemento pop(){
        stack.pop();
        return stack.peek();
    }
}
