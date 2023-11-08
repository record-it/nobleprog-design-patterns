package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CommandDemo {
    public static void main(String[] args) {
        System.out.println("=========================Macro demo=========================");
        List<Command> macro = new ArrayList<>();
        TextEditor textEditor = new TextEditor();
        macro.add(new InsertCharacter('a', 0, textEditor));
        macro.add(new InsertCharacter('b', 1, textEditor));
        macro.add(new InsertCharacter('c', 2, textEditor));
        System.out.println(textEditor.editor.toString());
        macro.add(new DeleteLastCharacter(textEditor));
        // wykonanie zapisanych poleceń
        macro.forEach(Command::execute);
        // efekt wykonania w edytorze
        System.out.println(textEditor.editor.toString());

        System.out.println("=========================Undo demo=========================");
        Stack<Command> history = new Stack<>();

        Command command = new InsertCharacter(' ', 2, textEditor);
        history.push(command);
        command.execute();

        command = new InsertCharacter('h', 3, textEditor);
        history.push(command);
        command.execute();

        command = new InsertCharacter('e', 2, textEditor);
        history.push(command);
        command.execute();

        command = new InsertCharacter('l', 5, textEditor);
        history.push(command);
        command.execute();

        System.out.println("Text editor after four inserts");
        System.out.println(textEditor.editor.toString());

        System.out.println("Calling undo");
        history.pop().undo();
        history.pop().undo();
        history.pop().undo();

        System.out.println("Text editor after undo of last command");
        System.out.println(textEditor.editor.toString());


    }
}
