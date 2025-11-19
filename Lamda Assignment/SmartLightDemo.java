interface LightAction {
    void execute();
}

public class SmartLightDemo {
    public static void main(String[] args) {

        LightAction motionTrigger = () -> System.out.println("Lights ON with soft white glow.");
        LightAction nightTrigger = () -> System.out.println("Lights ON in dim mode for night.");
        LightAction voiceTrigger = () -> System.out.println("Lights ON as per voice command.");

        // Running different actions
        motionTrigger.execute();
        nightTrigger.execute();
        voiceTrigger.execute();
    }
}
