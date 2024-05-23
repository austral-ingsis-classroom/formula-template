package edu.austral.ingsis.math;

public class Printer implements Visitor {
    private StringBuilder printResult = new StringBuilder();

    @Override
    public void visit(Constant constant) {
        printResult.append(constant.getValue());
    }

    @Override
    public void visit(Variable variable) {
        printResult.append(variable.getName());
    }

    @Override
    public void visit(Sum sum) {
        printResult.append("(");
        sum.getFirst().accept(this);
        printResult.append("+");
        sum.getSecond().accept(this);
        printResult.append(")");
    }

    @Override
    public void visit(Difference diff) {
        printResult.append("(");
        diff.getFirst().accept(this);
        printResult.append("-");
        diff.getSecond().accept(this);
        printResult.append(")");
    }

    @Override
    public void visit(Product prod) {
        printResult.append("(");
        prod.getFirst().accept(this);
        printResult.append("*");
        prod.getSecond().accept(this);
        printResult.append(")");
    }

    @Override
    public void visit(Division div) {
        printResult.append("(");
        div.getFirst().accept(this);
        printResult.append("*");
        div.getSecond().accept(this);
        printResult.append(")");
    }

    @Override
    public void visit(Module mod) {
        printResult.append("|");
        mod.getSubSymbol().accept(this);
        printResult.append("|");
    }

    @Override
    public void visit(Power pow) {
        pow.getSubSymbol().accept(this);
        printResult.append("^2");
    }

    @Override
    public void visit(Sqrt sqrt) {
        printResult.append("√(");
        sqrt.getSubSymbol().accept(this);
        printResult.append(")");
    }
}
