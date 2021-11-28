public class Burton extends Freestyle implements Shape{
    public String color;
    public int height;

    @Override
    public void speed() {
        System.out.println("Speed is doesn't matter in Freestyle.");
    }

    @Override
    public void weight() {
        super.weight();
        double burtonWeight = 1.3;
        System.out.println("Burton snowboards is lightest in the World!");

    }

    @Override
    public boolean rockerShape() {
        return false;
    }

    @Override
    public boolean camberShape() {
        return true;
    }
}
