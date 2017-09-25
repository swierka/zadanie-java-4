public class TriangleIsRight {

    public boolean isRightTriangle(Triangle triangle) {

    //    if (Math.max(triangle.getAngleA(),triangle.getAngleB()) == 90) {
    //    }

        boolean result = triangle.getAngleA() == 90 || triangle.getAngleB() == 90;

        return result;
    }
}
