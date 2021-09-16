package rit.calculator;

public class AddOperator implements BinaryOperator {

    @Override
    public double apply(double arg1, double arg2) {
        return arg1 + arg2;
    }


    public static void main(String[] args) {
        BinaryOperator add = new AddOperator();
        System.out.println(add.apply(2,3));
    }
}
