package command;

public class InsertCharacter implements Command{
    private final char character;
    private final int position;
    private final TextEditor editor;

    public InsertCharacter(char character, int position, TextEditor editor) {
        this.character = character;
        this.position = position;
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.editor.insert(position, character);
    }

    @Override
    public void undo() {
        editor.editor.delete(position + 1, position + 2);
    }
}
