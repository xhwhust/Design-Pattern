package chainOfResponsibility;

/**
 * @author xhw
 * @version 1.0
 * Create by 2023/4/22 15:17
 */
public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("ALice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elem");
        Support fred = new LimitSupport("Fred", 300);

        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
