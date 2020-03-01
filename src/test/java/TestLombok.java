import com.github.gudian1618.pojo.User;
import org.junit.Test;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/3/1 7:43 下午
 */

public class TestLombok {

    @Test
    public void testSetGet() {
        User user = new User();
        user.setId(100).setAge(100).setName("tomcat").setSex("man");
        System.out.println(user);
    }
}
