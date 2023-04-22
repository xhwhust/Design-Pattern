package chainOfResponsibility;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 15:17
 */
// 只解决指定编号的问题
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
