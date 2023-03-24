package is.hi.hbv202g.ass10.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {
    private List<MathExpression> children;

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
}
