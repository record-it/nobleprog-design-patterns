package interpreter;

import java.util.List;

public interface Expression {
   Expression EMPTY_EXPRESSION = new Expression() {
      @Override
      public int interpret(Context ctx) {
         return -1;
      }
   };

   int interpret(Context ctx);
}
