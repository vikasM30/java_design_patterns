package Strategy.Eg2;

public class main {
    public static void main(String[] args) {
        ThreeWheeler tw = new ElectricAuto();
        tw.vehicleName();
        tw.fuleType();
        tw.isMotor();

        System.out.println();

        ThreeWheeler twR = new Rikshaw();
        twR.vehicleName();
        twR.fuleType();
        twR.isMotor();
    }
}
