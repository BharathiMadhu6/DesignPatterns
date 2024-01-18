package memento;

public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }
}
