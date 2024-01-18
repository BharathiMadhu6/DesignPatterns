package memento;

import java.util.Stack;

public class History {
    private Stack<EditorState> stack = new Stack<>();

    public void push(EditorState state) {
        stack.push(state);
    }

    public EditorState pop() {
        return stack.pop();
    }
}
