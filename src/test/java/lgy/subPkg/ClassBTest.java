package lgy.subPkg;

import junit.framework.TestCase;
import lgy.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/*
 * 发光的大宝贝 @2020/9/30 5:46 下午
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ClassBTest extends TestCase {
    @Resource
    lgy.subPkg.ClassB classB;

    @Test
    public void test_subtract_right(){
        int result = classB.subtract(3, 1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test_subtract_wrong(){
        int result = classB.subtract(3, 2);
        Assert.assertEquals(2, result);
    }
}