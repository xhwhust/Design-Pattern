package adapter.byHas;

import adapter.Banner;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/18 20:58
 */
public class PrintBanner extends Print{

    private Banner banner ;

    public PrintBanner(String string){
        this.banner = new Banner(string) ;
    }

    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();
    }
}
