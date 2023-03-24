package is.hi.hbv202g.ass10.compositeLeafObservedTemplateMethod;

public class MultiplyComposite extends Composite implements MathExpression, Observer {
    public int getResult() {
        int sum = 1;
        for(MathExpression child : children) {
            sum *= child.getResult();
        }
        return sum;
    }
}
