public class Freeride extends Snowboard implements termsOfUse {

    public void speed() {

        System.out.println("Freeride snowboards are very fast!");
    }

    @Override
    public int rewaxingTerm() {
        return 4;
    }

    public boolean conservation() {
        return true;
    }
}
