package bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        RemoteController controller = new SuperRemoteController();
        ControlledDevice tvset = new TvSet(controller);
        controller.setDevice(tvset);
        controller.powerOn();
        controller.setVolume(5);
        controller.setVolume(89);
        controller.setVolume(45);
        System.out.println(tvset.getVolume());
    }
}
