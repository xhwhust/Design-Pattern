package chainOfResponsibility;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 15:17
 */
// 只解决奇数编号问题
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
