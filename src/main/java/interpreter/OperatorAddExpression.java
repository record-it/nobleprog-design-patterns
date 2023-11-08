package interpreter;

public class OperatorAddExpression implements Expression{
    private final Expression left;
    private final Expression right;

    public OperatorAddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context ctx) {
        return left.interpret(ctx) + right.interpret(ctx);
    }
}
