package pattern.behavioural.command.assignment;

import java.util.Stack;

public class History {
    private final Stack<String> eventHistory = new Stack<>();

    public void push(String state){
      eventHistory.push(state);
    }

    public String pop(){
        return eventHistory.pop();
    }

    public String peek(){
        return eventHistory.peek();
    }
}
