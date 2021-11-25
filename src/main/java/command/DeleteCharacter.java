package command;

public class DeleteCharacter implements Command{
    private final TextEditor editor;
    private char deletedCharacter;
    public DeleteCharacter(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        deletedCharacter = editor.editor.charAt(editor.editor.length() -1);
        editor.editor.delete(editor.editor.length() - 1, editor.editor.length());
    }

    @Override
    public void undo() {
        editor.editor.append(deletedCharacter);
    }
}
