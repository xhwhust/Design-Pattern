package decorator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:31
 */

// 装饰字符串上下左右
public class FullBorder extends Border {
    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + '+';
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + '+';
        } else {
            return "|" + display.getRowText(row - 1) + '|';
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(String.valueOf(ch).repeat(Math.max(0, count)));
        return buffer.toString();
    }
}
