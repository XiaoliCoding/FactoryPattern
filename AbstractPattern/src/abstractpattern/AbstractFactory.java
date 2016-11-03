package abstractpattern;

public interface AbstractFactory {
    public Food CreateFood(); //返回Food类型（自定义类型）
    public Shape CreateShape();
}
