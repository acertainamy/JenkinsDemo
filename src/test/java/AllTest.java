import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import lgy.subPkg.ClassATest;
import lgy.subPkg.ClassBTest;

/*
 * 发光的大宝贝 @2020/9/30 5:46 下午
 * @Description:
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ClassATest.class, ClassBTest.class})
public class AllTest {
}
