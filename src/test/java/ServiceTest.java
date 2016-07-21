import org.springframework.context.support.ClassPathXmlApplicationContext;
import ws.Area;
import ws.OnSale;
import ws.Products;
import ws.SupermarketService;

import java.rmi.RemoteException;

/**
 * Created by Administrator on 2016/7/21.
 */
public class ServiceTest {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]  {"client-beans.xml"});
        SupermarketService supermarketService = (SupermarketService) context.getBean("supermarketClient");
        Area area = new Area();
        area.setANum(2);
        area.setAName("δ֪");
        area.setLocation("һ¥�ڶ���");
        Products products = new Products();
        products.setShapcode("123");
        products.setPname("eeee");
        products.setPrice(9);
        OnSale onSale = new OnSale();
        onSale.setArea(area);
        onSale.setProducts(products);
        onSale.setRfid("33333333");
        supermarketService.saveOnSale(onSale);
        System.out.println("success!");
    }
}
