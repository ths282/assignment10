package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite extends Composite implements MathExpression, Observer {
    public int getResult() {
        int sum = 0;
        for(MathExpression child : children) {
            sum += child.getResult();
        }
        return sum;
    }

}
