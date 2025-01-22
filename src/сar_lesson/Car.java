package сar_lesson;

public abstract class Car {
    private final int WHEELS = 4;
    private String gearBox;
    private int doors;

    Engine engine;

    public Car (int doors, String gearBox, Engine engine) {
        this.engine = engine;
        this.doors = doors;
        this.gearBox = gearBox;
    }

    public Car () {
        this.engine = new Engine();
        this.doors = 0;
        this.gearBox = "Значение отсутствует";
    }

    String infoCEO () {
        return String.valueOf(WHEELS * engine.getHorsePower());
    }

    void allInfo () {
        System.out.println("Количество лошадиных сил: " + engine.getHorsePower());
        System.out.println(getWHEELS());
        System.out.println("Коробка передач у данной модели: " + getGearBox());
        System.out.println("Количество дверей у данной модели: " + getDoors() + "\n");
    }

    void infoMotor () {
        System.out.println("У этой модели стоит модель двигателя: " + engine.getMotor() + ", и его мощность равна " + engine.getMotorPower());
    }

    public String getWHEELS() {
        return "У машины " + WHEELS + " колеса.";
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

    static class Engine {
        private int motorPower;
        private String motor;
        private int horsePower;

        public Engine(String motor, int motorPower, int horsePower) {
            this.motor = motor;
            this.motorPower = motorPower;
            this.horsePower = horsePower;
        }

        public Engine() {
            this.motorPower = 0;
            this.motor = "Значение отсутствует";
            this.horsePower = 0;
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
        public void setHorsePower (int horsePower) {
            this.horsePower = horsePower;
        }
        public int getHorsePower () {
            return horsePower;
        }
    }
}

