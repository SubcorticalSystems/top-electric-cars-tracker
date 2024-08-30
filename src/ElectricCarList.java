import java.util.ArrayList;

public class ElectricCarList {
    ArrayList<ElectricCar> carList = new ArrayList<>();

    public void printList() {
        System.out.println(carList.toString().substring(1, carList.toString().length() - 1).replace(",", "======================"));
    }

    class ElectricCar {
        String modelName;
        double mfgPrice;
        int maxRange;
        double usNewsRating; // 1.0-10.0
        int rank;

        public String toString() {
            return "\nElectric Car \n" + "Model Name: " + this.getModelName() +
                    "\nPrice: " + this.getMfgPrice() + "\nRange: " + this.getMaxRange() + "\nUS News Rating: " + this.getUsNewsRating()
                    + "\nRank: " + this.getRank() + "\n";
        }


        public ElectricCar(String modelName, double mfgPrice, int maxRange, double usNewsRating, int rank) {
            this.modelName = modelName;
            this.mfgPrice = mfgPrice;
            this.maxRange = maxRange;
            this.usNewsRating = usNewsRating;
            this.rank = rank;
        }

        public String getModelName() {
            return modelName;
        }

        public double getMfgPrice() {
            return mfgPrice;
        }

        public int getMaxRange() {
            return maxRange;
        }

        public double getUsNewsRating() {
            return usNewsRating;
        }

        public int getRank() {
            return rank;
        }

    }

    public void addCars() {
        carList.add(new ElectricCar("2023 Chevrolet Bolt", 297000, 131, 9.2, 1));
        carList.add(new ElectricCar("2024 Hyundai Ioniq 6", 53650, 153, 8.8, 2));
        carList.add(new ElectricCar("2024 Nissan Leaf", 36190, 123, 8.0, 3));
    }


    public static void main(String[] args) {
        ElectricCarList cars = new ElectricCarList();
        cars.addCars();
        cars.printList();
    }

}
