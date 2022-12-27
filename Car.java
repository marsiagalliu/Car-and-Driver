public class Car {

    private int gas = 10;
    private boolean status;

    public Car( int gas) {
        super();
        this.gas = gas;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
