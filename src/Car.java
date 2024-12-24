public class Car {
    private static final int WHEELS = 4;
    private int motorPower;
    private String motor;
    private int doors;
    private String gearBox;
    private int horsePower;

    public String getWHEELS() {
        return "У машины " + WHEELS + " колеса.";
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }
    public int getMotorPower () {
        return motorPower;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    public String getMotor () {
        return motor;
    }

    public void setDoors (int doors) {
        this.doors = doors;
    }
    public int getDoors () {
        return doors;
    }

    public void setGearBox (String gearBox) {
        this.gearBox = gearBox;
    }
    public String getGearBox () {
        return gearBox;
    }

    public void setHorsePower (int horsePower) {
        this.horsePower = horsePower;
    }
    public int getHorsePower () {
        return horsePower;
    }

    String infoCEO () {
        return String.valueOf(WHEELS * getHorsePower());
    }

    void allInfo () {
        System.out.println("Количество лошадиных сил " + getHorsePower());
        System.out.println(getWHEELS());
        System.out.println("Коробка передач у данной модели " + getGearBox());
        System.out.println("Количество дверей у данной модели " + getDoors());
    }

    void infoMotor () {

    }
}
