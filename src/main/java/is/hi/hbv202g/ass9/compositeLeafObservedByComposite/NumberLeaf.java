package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

public class NumberLeaf extends Observable implements MathExpression {
    private int result;
    public NumberLeaf(int number) {
        this.result = number;
    }

    public int getResult() {
        return result;
    }

    public void setValue(int val) {
        result = val;
        notifyObservers();
    }

}
