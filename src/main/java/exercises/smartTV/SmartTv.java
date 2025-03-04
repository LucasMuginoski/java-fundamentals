package exercises.smartTV;

public class SmartTv {
    private boolean status;
    private int chanel;
    private int volume;

    public SmartTv(){
        status = false;
        chanel = 12;
        volume = 15;
    }
    public SmartTv(boolean status, int chanel, int volume){
        this.status = status;
        this.chanel = chanel;
        this.volume = volume;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
