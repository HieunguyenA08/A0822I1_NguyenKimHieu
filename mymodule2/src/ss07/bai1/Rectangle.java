package ss07.bai1;

public class Rectangle extends Shape implements IResizeable{
    public Rectangle(int size, String color) {
        super(size, color);
    }

    @Override
    public void resize(double percent) {
        size+=size*percent/100;
        System.out.println("Kích thước của hình chữ nhật sau khi tăng "+ percent +" % "+ " là " + size );
    }
}
