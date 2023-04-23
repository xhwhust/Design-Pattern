package state;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/23 14:10
 */
public interface Context {
    void setClock(int hour);

    void changeState(State state);

    void callSecurityCenter(String msg);

    void recordLog(String msg);
}
