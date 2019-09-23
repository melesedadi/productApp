public class Software extends Product {

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public Software(){

    }
    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public String toString() {
        return "This is written by:" +programmer;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Software(String code, String description, double price, String programmer, String platform, String os) {
        super(code, description, price);
        this.programmer = programmer;
        this.platform = platform;
        this.os = os;
    }
}