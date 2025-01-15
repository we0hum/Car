package сar_lesson;

public abstract class Car {
    private final int WHEELS = 4;
    private int motorPower;
    private String motor;
    private int doors;
    private String gearBox;
    private int horsePower;

    public Car (int motorPower, String motor, int doors, String gearBox, int horsePower) {
        this.motorPower = motorPower;
        this.motor = motor;
        this.doors = doors;
        this.gearBox = gearBox;
        this.horsePower = horsePower;
    }

    public Car () {
        this.motorPower = 0;
        this.motor = "Значение отсутствует";
        this.doors = 0;
        this.gearBox = "Значение отсутствует";
        this.horsePower = 0;
    }

    String infoCEO () {
        return String.valueOf(WHEELS * getHorsePower());
    }

    void allInfo () {
        System.out.println("Количество лошадиных сил: " + getHorsePower());
        System.out.println(getWHEELS());
        System.out.println("Коробка передач у данной модели: " + getGearBox());
        System.out.println("Количество дверей у данной модели: " + getDoors() + "\n");
    }

    void infoMotor () {
        System.out.println("У этой модели стоит модель двигателя: " + getMotor() + ", и его мощность равна " + getMotorPower());
    }

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
}
