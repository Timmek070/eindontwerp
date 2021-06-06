public abstract class Engine {

    private Integer Pk;
    private String TypeEngine;

    public Engine(Integer Pk,String TypeEngine){
        this.Pk=Pk;
        this.TypeEngine=TypeEngine;
    }

    public Integer getPk() {
        return Pk;
    }

    public String getTypeEngine() {
        return TypeEngine;
    }
}
