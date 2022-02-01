package abstractfactorypattern;

public class RoundedRectangleshape implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}