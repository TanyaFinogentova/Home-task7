public class Main {
    public static void main(String[] args) {

            Burton malolo = new Burton();
            malolo.color = "red";
            malolo.height = 154;
            if (malolo.rockerShape()) System.out.println("Malolo has a rocker shape!");
            if (malolo.camberShape()) System.out.println("Malolo has a camber!");
            System.out.println("Burton Malolo is snowboard for freestyle riding, have a " + malolo.color + " color and " + malolo.height + " height. And the season when it used is " + malolo.seasonToUse());
            System.out.println("You should wax your snowboard every " + malolo.rewaxingTerm() + " weeks!");
            if (malolo.conservation()) System.out.println("Prepare it for summer!");

            LibTech trs = new LibTech();
            trs.speed();
            if (trs.rockerShape()) System.out.println("Trs has a rocker shape!");
            if (trs.camberShape()) System.out.println("Trs has a camber!");
            System.out.println("LibTech is a snowboards for a big mountains and it's width is " + trs.width() + " The season when it used is " + trs.seasonToUse());
            System.out.println("You should wax your snowboard every " + trs.rewaxingTerm() + " weeks!");
            if (trs.conservation()) System.out.println("Prepare it for summer!");
    }

}
