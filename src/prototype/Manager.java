package prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 15:29
 */
public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
