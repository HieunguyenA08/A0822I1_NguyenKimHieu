package ss07.bai1;

public class Square extends Shape implements IResizeable {


    public Square(int size, String color) {
        super(size, color);
    }

    @Override
    public void resize(double percent) {
        size+=size*percent/100;
        System.out.println("Kích thước của hình vuông sau khi tăng "+ percent +" % "+ " là " + size );
    }
}
