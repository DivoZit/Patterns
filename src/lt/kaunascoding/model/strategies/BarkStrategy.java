package lt.kaunascoding.model.strategies;

public class BarkStrategy implements IActionStrategy {
    @Override
    public void doAction() {
        System.out.println("I Bark!");
    }
}
