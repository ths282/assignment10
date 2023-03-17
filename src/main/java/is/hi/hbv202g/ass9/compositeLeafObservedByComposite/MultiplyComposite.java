package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression, Observer {
    private List<MathExpression> children;
    private int lastObservedResult;

    public MultiplyComposite() {
        children = new ArrayList<MathExpression>();
    }

    public void add(MathExpression child) {
        children.add(child);
    }


    public int getResult() {
        int sum = 1;
        for(MathExpression child : children) {
            sum *= child.getResult();
        }
        return sum;
    }

    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
