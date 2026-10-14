
package ma.wegrow;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class SpringContextTest {

    @Test
    void shouldLoadSpringContext() {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {

            assertNotNull(context.getBean("dataSource"));
            assertNotNull(context.getBean("entityManagerFactory"));
            assertNotNull(context.getBean("transactionManager"));
        }
    }
}
