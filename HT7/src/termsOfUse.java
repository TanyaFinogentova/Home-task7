 interface termsOfUse {
    public int rewaxingTerm();
    public boolean conservation();
    default String seasonToUse(){
        return "winter";
    }
}
