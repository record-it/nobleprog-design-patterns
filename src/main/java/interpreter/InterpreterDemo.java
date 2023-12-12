package interpreter;

import java.util.Objects;
import java.util.Stack;

public class InterpreterDemo {
    public static void main(String[] args) {
        Context context = new Context(20, 20);
        String macro = "set_pen #; set_at 1, 2; set_at 3, 6; set_pen %; set_at 3, 4 4 + 2 * ";
        String[] lines = macro.split(";");
        for(var line: lines){
            String[] tokens = line.trim().split("\\s");
            Expression e = null;
            switch (tokens[0]){
                case "set_pen":
                    e = new SetPenExpression(tokens[1].charAt(0));
                    break;
                case "set_at":
                    String[] arr = line.replace("set_at", "").trim().split(",");
                    if (arr.length != 2){
                        throw new IllegalArgumentException("Błąd składniowy, niepoprawna liczba argumentów polecenia set_at");
                    }
                    e = new SetAtExpression(parseOperatorExpression(arr[0].trim()), parseOperatorExpression(arr[1].trim()));
                    break;
            }
            if (e != null) {
                e.interpret(context);
            }
        }
        context.draw();
    }
    public static Expression parseOperatorExpression(String e){
        String[] tokens = e.split("\\s");
        Expression expression = Expression.EMPTY_EXPRESSION;
        Stack<Expression> args = new Stack<>();
        for(var token: tokens){
            if (isOperator(token)){
                if (args.size() < 2){
                    throw new IllegalArgumentException("Błąd składniowy wyrażenia");
                }
                switch(token){
                    case"+":
                        expression = new OperatorAddExpression(args.pop(), args.pop());
                        args.push(expression);
                        break;
                    case"-":

                        break;
                    case"/":

                        break;
                    case"*":
                        expression = new OperatorMulExpression(args.pop(), args.pop());
                        args.push(expression);
                        break;
                }
            } else {
                int arg = Integer.parseInt(token);
                args.push(new NumberExpression(arg));
            }
        }
        if (args.size() != 1){
            throw new IllegalArgumentException("Błąd w składni wyrażeń!");
        }
        return args.pop();
    }

    public static boolean isOperator(String s){
        return Objects.equals("+", s) || Objects.equals("-",s ) || Objects.equals("/",s ) || Objects.equals("*",s );
    }
}
