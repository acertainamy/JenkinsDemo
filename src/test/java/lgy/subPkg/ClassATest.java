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
 * 发光的大宝贝 @2020/9/30 5:40 下午
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ClassATest extends TestCase {
    @Resource
    lgy.subPkg.ClassA classA;

    @Test
    public void test_add(){
        int result = classA.add(1, 2);
        Assert.assertEquals(3, result);
    }
}
