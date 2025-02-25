public class Encapsulation {
    public static void main(String[] args) {

        Room rm = new Room();

        rm.setLength(10);
        rm.setWidth(19);

        rm.setArea();

        System.out.println(rm.getLength());
        System.out.println(rm.getWidth());
        System.out.println(rm.getArea());

    }
}

// getters and setters.
class Room {
    private int length;
    private int width;
    private int area;

    void setArea() {
        this.area = this.length * this.width;
    }

    int getArea() {
        return this.area;
    }

    void setLength(int length) {
        this.length = length;
    }

    int getLength() {
        return this.length;
    }

    void setWidth(int width) {
        this.width = width;
    }

    int getWidth() {
        return this.width;
    }

}