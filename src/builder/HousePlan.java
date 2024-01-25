package builder;

public interface HousePlan {
    public abstract void foundation(String f);
    public abstract void structure(String structure);
    public abstract void roof(String roof);
    public abstract void door(String door);
}
