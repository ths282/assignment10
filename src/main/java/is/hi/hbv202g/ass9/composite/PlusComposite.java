package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children;
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
}
