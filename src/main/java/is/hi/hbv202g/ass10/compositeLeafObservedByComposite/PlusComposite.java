package is.hi.hbv202g.ass10.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {
    private List<MathExpression> children;
    private int lastObservedResult;
    public PlusComposite() {
        children = new ArrayList<MathExpression>();
    }

    public void add(MathExpression child) {
        children.add(child);
    }


    public int getResult() {
        int sum = 0;
        for(MathExpression child : children) {
            sum += child.getResult();
        }
        return sum;
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }
}
