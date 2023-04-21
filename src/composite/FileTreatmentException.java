package composite;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/21 17:31
 */
//防止对文件进行 add操作
public class FileTreatmentException extends RuntimeException {
    public FileTreatmentException() {
    }

    public FileTreatmentException(String msg) {
        super(msg);
    }
}
