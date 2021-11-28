public class Freestyle extends Snowboard implements termsOfUse{
    public void speed(){
        System.out.println("Speed is doesn't matter in Freestyle.");
    }

    @Override
    public void weight() {
        super.weight();
        double maxWeight = 1.6;
        System.out.println("Max weight of freestyle snowboard is " +maxWeight);

    }

    @Override
    public String seasonToUse() {
        return "spring";
    }

    @Override
    public int rewaxingTerm() {
        return 2;
    }

    public boolean conservation() {
        return true;
    }
}