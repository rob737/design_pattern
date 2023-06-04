package pattern.behavioural.memento;

//import java.util.Stack;

// commented out code represents violation of Single Responsibility pattern as Editor class
// was doing 2 things, providing editor functionalities and maintaining state.
public class Editor {
    private String content;
   // private final Stack<String> stack = new Stack<>();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
     //   stack.push(content);
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public void restore(EditorState state){
        this.content = state.getContent();
    }

}
