class Box {
    protected double length;
    protected double breadth;
    protected double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double calculateArea() {
        return length * breadth;
    }
    public double calculateVolume() {
        return length * breadth * height;
    }
}

class Box3D extends Box {
    public Box3D(double length, double breadth, double height) {
        super(length, breadth, height);
    }
    
    public double calculateArea1() {
        return length * breadth;
}
    public double calculateVolume1() {
        return length * breadth * height;
    }
}

public class a4prog9 {
    public static void main(String[] args) {
        Box box = new Box(5.0, 3.0, 2.0);
        Box3D box3d = new Box3D(5.0, 3.0, 2.0);
        
	double area = box.calculateArea();
        double volume = box.calculateVolume();
        
        double area1 = box3d.calculateArea1();
        double volume1 = box3d.calculateVolume1();
        
        System.out.println("For Box");
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
        
        System.out.println("For Box3D");
        System.out.println("Area: " + area1);
        System.out.println("Volume: " + volume1);
    }
    
}

