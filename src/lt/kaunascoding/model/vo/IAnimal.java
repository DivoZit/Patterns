package lt.kaunascoding.model.vo;

public interface IAnimal {
    public String getType();

    void setType(String parType);

    public String getName();

    void setName(String parName);

    float getWeight();

    void setWeight(float parWeight);

    float getHeight();

    void setHeight(float parHeight);

    void doAction();

}
