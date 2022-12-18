package ru.mirea.practice.work3to4;

abstract class Main {
    public static void main(String[] args) {
        new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5);
        new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2),
                new Variable("x"))), new Const(1)).evaluate(0);
        ExpressionParser parser = new ExpressionParser();
        parser.tripleExpressionparse("x *       ( y - 2 )   / z +        1", 1, 2, 3);
        String str = "1000000 * x * x * x * x * x / ( x - 1 )";
        parser.tripleExpressionparse(str, 0);
        parser.tripleExpressionparse(str, 1);
        parser.tripleExpressionparse(str, 2);
        parser.tripleExpressionparse(str, 3);
        parser.tripleExpressionparse(str, 4);
        parser.tripleExpressionparse(str, 5);
        parser.tripleExpressionparse(str, 6);
        parser.tripleExpressionparse(str, 7);
        parser.tripleExpressionparse(str, 8);
        parser.tripleExpressionparse(str, 9);
        parser.tripleExpressionparse(str, 10);
    }
}
