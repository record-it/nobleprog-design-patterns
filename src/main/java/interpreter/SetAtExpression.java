package interpreter;

public class SetAtExpression implements Expression{
    private final Expression left;
    private final Expression right;

    public SetAtExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context ctx) {
        ctx.setAt(left.interpret(ctx), right.interpret(ctx));
        return -1;
    }
}
