public abstract class Velgen {

    private String MerkVelgen;
    private String InchVelgen;

    public Velgen(String MerkVelgen, String InchVelgen){
        this.MerkVelgen=MerkVelgen;
        this.InchVelgen=InchVelgen;
    }

    public String getInchVelgen() {
        return InchVelgen;
    }

    public String getMerkVelgen() {
        return MerkVelgen;
    }
}
