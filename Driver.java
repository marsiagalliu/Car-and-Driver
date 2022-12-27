public class Driver extends Car{

    public Driver(int gas) {
        super(gas);
    }

    public void drive(){
        if (getGas() <= 0){
            System.out.println("game over");
            return;
        } else {
            int gasTotal = getGas() - 1;
            System.out.println("You drive the car");
            System.out.println("Gas remaining: " + gasTotal + "/" + "10");
            setGas(gasTotal);
        }

    }

    public void boosters(){
        if (getGas() < 1){
            System.out.println("game over");
            return;
        } else if (getGas() < 3){
            System.out.println("you are not allowed to boost");
            return;
        } else {
            int getTotal = getGas() - 3;
            System.out.println("You boosted the car");
            System.out.println("Gas remaining: " + getTotal + "/" + "10");
            setGas(getTotal);
        }
    }

    public void refuel(){
        if (getGas() <= 1){
            System.out.println("game over");
            return;
        }else if (getGas() > 8){
            System.out.println("you are not allowed to refuel");
            return;
        } else {
            int getTotal = getGas() - 2;
            System.out.println("You refueled the car");
            System.out.println("Gas remaining: " + getTotal + "/" + "10");
            setGas(getTotal);
        }
    }
}
