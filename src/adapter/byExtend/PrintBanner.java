package adapter.byExtend;

import adapter.Banner;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/18 20:55
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
