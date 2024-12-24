package сar_lesson;

public class BmwM5 extends Bmw {

    public static void main(String[] args) {
        Bmw bmw1 = new Bmw();
        bmw1.setColor("желтый");
        bmw1.setHorsePower(100);
        bmw1.setMotorPower(20);
        bmw1.setMotor("b43");
        bmw1.setGearBox("АКПП");
        bmw1.setNameModel("M5");
        bmw1.setDoors(4);
        bmw1.allInfo();
    }
}
