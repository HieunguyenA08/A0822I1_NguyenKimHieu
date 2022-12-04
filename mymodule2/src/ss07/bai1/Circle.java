package ss07.bai1;

public class Circle extends Shape implements IResizeable {
    public Circle(int size, String color) {
        super(size, color);
    }

    @Override
    public void resize(double percent) {

        size += size * percent / 100;
        System.out.println("Kích thước của hình tròn sau khi tăng " + percent + " % " + " là " + size);

    }
}
