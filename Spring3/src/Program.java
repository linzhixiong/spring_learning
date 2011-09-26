import com.thoughtworks.spring.items.AbstractItem;
import com.thoughtworks.spring.items.ImportedItem;
import com.thoughtworks.spring.items.TaxedItem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: twer
 * Date: 9/26/11
 * Time: 9:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Program {

    public static void main(String[] args) {
        System.out.println("jjj");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        AbstractItem taxedItem = (TaxedItem) applicationContext.getBean("taxedItem");
        System.out.println(taxedItem.getName());
        AbstractItem importedItem = (ImportedItem) applicationContext.getBean("importedItem");
        System.out.println(importedItem.getName());

    }

}
