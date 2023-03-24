package is.hi.hbv202g.ass10.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite {
    protected List<MathExpression> children;
    protected int lastObservedResult;
    public Composite() { children = new ArrayList<MathExpression>(); }


    public void add(MathExpression child) {
        children.add(child);
    }
    public int getLastObservedResult() {
        return lastObservedResult;
    }

    public abstract int getResult();
    public void update() {
        lastObservedResult = getResult();
        System.out.println(lastObservedResult);
    }
}
