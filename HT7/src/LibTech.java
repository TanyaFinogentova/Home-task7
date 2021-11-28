public class LibTech extends Freeride implements Shape{
    @Override
    public void speed() {
        System.out.println("LibTech snowboards are fastest in the World!");
    }

    @Override
    public boolean rockerShape() {
        return true;
    }

    @Override
    public boolean camberShape() {
        return true;
    }

    @Override
    public int width() {
        return 50;
    }


}

