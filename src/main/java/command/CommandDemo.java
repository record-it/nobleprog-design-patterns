package command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        List<Command> commands = new ArrayList<>();
        TextEditor textEditor = new TextEditor();
        commands.add(new InsertCharacter('a', 0, textEditor));
        commands.add(new InsertCharacter('b', 1, textEditor));
        commands.add(new InsertCharacter('c', 2, textEditor));
        commands.add(new DeleteCharacter(textEditor));
        //wykonanie zapisanyh poleceń
        commands.forEach(Command::execute);
        //efekt wykonania w edytorze
        System.out.println(textEditor.editor.toString());
        //odwoływanie wykonywanych operacji wykonujemy od ostatniego polecenia
        for (int i = commands.size() - 1; i > -1; i--){
            commands.get(i).undo();
            System.out.println(textEditor.editor.toString());
        }
    }
}
