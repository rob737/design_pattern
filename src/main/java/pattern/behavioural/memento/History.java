package pattern.behavioural.memento;

import java.util.Stack;

public class History {
    private Stack<EditorState> states = new Stack<>();

    public void push(EditorState state){
        states.push(state);
    }

    public EditorState pop(){
         states.pop();
         return states.peek();
    }
}
