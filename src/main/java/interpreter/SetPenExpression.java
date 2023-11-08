package interpreter;

public class SetPenExpression  implements Expression{
    private final char pen;

    public SetPenExpression(char pen) {
        this.pen = pen;
    }

    @Override
    public int interpret(Context ctx) {
        ctx.setPen(pen);
        return -1;
    }
}
