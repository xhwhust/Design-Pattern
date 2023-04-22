package decorator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:31
 */

//具体的装饰边框，装饰字符串的左右两侧
public class SideBorder extends Border {
    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
