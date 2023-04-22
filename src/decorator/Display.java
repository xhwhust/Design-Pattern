package decorator;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 14:29
 */

// 可以显示多行字符串的抽象类
public abstract class Display {
    // 获取横向字符数
    public abstract int getColumns();

    // 获取纵向行数
    public abstract int getRows();

    // 获取第 row 行的字符串
    public abstract String getRowText(int row);

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}

