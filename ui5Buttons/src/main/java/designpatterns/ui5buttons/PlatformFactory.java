package designpatterns.ui5buttons;

public class PlatformFactory {
    public static Platform createPlatmorm(Plateforms plateform){
        switch (plateform){
            case ANDROID -> {
                return new Android();
            }
            case WINDOWS -> {
                return new Windows();
            }
        }
        throw new RuntimeException("Provide a valid plateform");
    }
}
