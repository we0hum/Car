package сar_lesson;

public class MercedesBenzCLS63AMG extends MercedesBenz {

    public static void main(String[] args) {
        MercedesBenz merc1 = new MercedesBenz();
        merc1.setColor("синий");
        merc1.setHorsePower(1200);
        merc1.setMotorPower(203);
        merc1.setMotor("g4213");
        merc1.setGearBox("АКПП");
        merc1.setNameModel("CLS 63 AMG");
        merc1.setDoors(5);
        merc1.allInfo();
    }
}
