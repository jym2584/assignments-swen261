package rit.calculator;

public class BinaryOperation {
    private BinaryOperator operator;
    private double arg1;
    private double arg2;

    /**
     * Operation
     * @param operator operation type
     * @param arg1 numerical value 1
     * @param arg2 numerical value 2
     */
    public BinaryOperation(BinaryOperator operator, double arg1, double arg2) {
        this.operator = operator;
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public double getResult() {
        return operator.apply(arg1, arg2);
    }

    public static void main(String[] args) {
        BinaryOperator add = new AddOperator();
        System.out.println(add.apply(5,3));

        BinaryOperation operation = new BinaryOperation(new AddOperator(), 5, 5);
        System.out.println(operation.getResult());
    }
}
