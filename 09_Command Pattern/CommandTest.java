public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        System.out.println("▶ Turning ON the light:");
        remote.setCommand(onCommand);
        remote.pressButton();

        System.out.println("\n⏹ Turning OFF the light:");
        remote.setCommand(offCommand);
        remote.pressButton();
    }
}
