package org.soya.ast.expr;

import antlr.Token;

/**
 * @author: Jun Gong
 */
public class PostfixExpression extends Expression {
    private Token operator;
    private Expression expression;

    public PostfixExpression(Token operator, Expression expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public Token getOperator() {
        return operator;
    }

    public void setOperator(Token operator) {
        this.operator = operator;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String toString() {
        return "[" + expression + " " + operator + "]";
    }
}
