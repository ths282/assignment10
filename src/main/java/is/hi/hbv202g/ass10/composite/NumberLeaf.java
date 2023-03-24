package is.hi.hbv202g.ass10.composite;

public class NumberLeaf implements MathExpression {
    private int result;
    public NumberLeaf(int number) {
        this.result = number;
    }

    public int getResult() {
        return result;
    }

}
