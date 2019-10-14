package in.org.app.dependent;

import in.org.app.independent.bo.User;

/**
 * [ TODO ]
 *
 * @author Dhrubo
 * @date 14/10/19
 * @package in.org.app.independent
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.getName());
    }
}
