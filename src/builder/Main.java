package builder;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/20 16:50
 */
public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);
    }
}
