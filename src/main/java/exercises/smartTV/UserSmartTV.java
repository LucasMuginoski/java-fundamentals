package exercises.smartTV;

public class UserSmartTV {
    public static void main(String[] args){
        SmartTv smartTv  = new SmartTv();
        System.out.println("Is the TV turned on ? " + smartTv.isStatus());
        System.out.println("Current TV Chanel ? " + smartTv.getChanel());
        System.out.println("Current TV Volune ? " + smartTv.getVolume());
        System.out.println("=======================================");

        smartTv.setStatus(true);
        smartTv.setChanel(smartTv.getChanel() + 1);
        smartTv.setVolume(10);
        System.out.println("Is the TV turned on ? " + smartTv.isStatus());
        System.out.println("Current TV Chanel ? " + smartTv.getChanel());
        System.out.println("Current TV Volune ? " + smartTv.getVolume());
        System.out.println("=======================================");

        smartTv.setChanel(7);
        System.out.println("Is the TV turned on ? " + smartTv.isStatus());
        System.out.println("Current TV Chanel ? " + smartTv.getChanel());
        System.out.println("Current TV Volune ? " + smartTv.getVolume());

        smartTv.setStatus(false);
        System.out.println("=======================================");
        System.out.println("Is the TV turned on ? " + smartTv.isStatus());
    }
}
