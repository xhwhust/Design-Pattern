package builder;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 16:48
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    void makeTitle(String title) {
        buffer.append("===============================\n");
        buffer.append("[").append(title).append("]\n");
        buffer.append("\n");
    }

    @Override
    void makeString(String str) {
        buffer.append('◼').append(str).append("\n");
        buffer.append("\n");
    }

    @Override
    void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("    .").append(item).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    void close() {
        buffer.append("===============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
