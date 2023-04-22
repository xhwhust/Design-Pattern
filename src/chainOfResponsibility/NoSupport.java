package chainOfResponsibility;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 15:16
 */

// 永远不解决问题
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
