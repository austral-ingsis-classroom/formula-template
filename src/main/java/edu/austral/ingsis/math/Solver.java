// package edu.austral.ingsis.math;
//
// import java.util.Map;
//
// public class Solver implements Visitor {
//    private Map<String, Double> variables;
//
//    @Override
//    public Double visit(Constant constant) {
//        return constant.getValue();
//    }
//
//    @Override
//    public Double visit(Variable variable) {
//        return variables.get(variable.getName());
//    }
//
//    @Override
//    public Double visit(UnaryOperation unary) {
//        return 0.0;
//    }
//
//    @Override
//    public Double visit(BinaryOperation binary) {
//        return 0.0;
//    }
// }
