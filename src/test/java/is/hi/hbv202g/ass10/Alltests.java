package is.hi.hbv202g.ass10;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ is.hi.hbv202g.ass10.composite.Alltests.class,
		is.hi.hbv202g.ass10.compositeLeafObservedByComposite.Alltests.class,
		is.hi.hbv202g.ass10.compositeLeafObservedTemplateMethod.Alltests.class })
public class Alltests {
}
