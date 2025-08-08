public class FigureSupplier {
    private static final int MAX_PARAM_VALUE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5); // We have 5 types of figures
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0: // Circle
                return new Circle(color, random.nextInt(MAX_PARAM_VALUE) + 1);
            case 1: // Square
                return new Square(color, random.nextInt(MAX_PARAM_VALUE) + 1);
            case 2: // Rectangle
                return new Rectangle(color, random.nextInt(MAX_PARAM_VALUE) + 1,
                                     random.nextInt(MAX_PARAM_VALUE) + 1);
            case 3: // Right Triangle
                return new RightTriangle(color, random.nextInt(MAX_PARAM_VALUE) + 1,
                                         random.nextInt(MAX_PARAM_VALUE) + 1);
            case 4: // Isosceles Trapezoid
            default:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_PARAM_VALUE) + 1,
                                              random.nextInt(MAX_PARAM_VALUE) + 1,
                                              random.nextInt(MAX_PARAM_VALUE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}