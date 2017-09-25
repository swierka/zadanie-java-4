public class TriangleTest {
    public static void main(String[] args) {

       Triangle trian1 = new Triangle(50, 95,45);
       TriangleIsRight test1 = new TriangleIsRight();
       boolean result = test1.isRightTriangle(trian1);
        System.out.println(result);

    }
}
