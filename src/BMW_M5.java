public class BMW_M5 extends BMW {

    public static void main(String[] args) {
        BMW bmw1 = new BMW();
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
