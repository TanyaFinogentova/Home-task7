public interface Shape {
    public boolean rockerShape ();
    public boolean camberShape ();
    default int width(){
        return 45;
    }
}
