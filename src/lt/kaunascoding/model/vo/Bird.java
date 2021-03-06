package lt.kaunascoding.model.vo;

import lt.kaunascoding.model.strategies.IActionStrategy;

public class Bird implements IAnimal {
    private String name;
    private String type;
    private float weight;
    private float height;
    private IActionStrategy stategy;

    public Bird(IActionStrategy parStategy) {
        stategy = parStategy;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String parType) {
        type = parType;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String parName) {
        name = parName;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void setWeight(float parWeight) {
        weight = parWeight;

    }

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setHeight(float parHeight) {
        height = parHeight;
    }

    @Override
    public void doAction() {
        stategy.doAction();
    }

    @Override
    public String toString() {
        doAction();
        return "I am a pigeon " + name + " " + type + " " + weight + " " + height;
    }
}
