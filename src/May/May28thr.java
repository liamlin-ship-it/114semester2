package May;

import java.util.Scanner;

class PowerStation {
    double energy;
    double efficiencyRate;

    PowerStation(double energy, double efficiencyRate) {
        this.energy = energy;
        this.efficiencyRate = efficiencyRate;
    }

    double calculateEfficiency() {
        return energy * (1 + efficiencyRate);
    }

    void charge(double amount) {
        energy = energy + amount;
        System.out.printf("Energy after charge: %.2f kWh\n", energy);
    }

    void consume(double amount) {
        if (amount > energy){
            System.out.println("POWER FAILURE!");
            System.exit(0);
        }else {
            energy = energy - amount;
            System.out.printf("Energy after consume: %.2f kWh\n", energy);
        }
    }
}

public class May28thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double energy = scanner.nextDouble();
        double efficiencyRate = scanner.nextDouble();

        double charge1 = scanner.nextDouble();
        double consume1 = scanner.nextDouble();
        double charge2 = scanner.nextDouble();
        double consume2 = scanner.nextDouble();

        PowerStation powerStation = new PowerStation(energy, efficiencyRate);
        powerStation.charge(charge1);
        powerStation.consume(consume1);
        powerStation.charge(charge2);
        powerStation.consume(consume2);

        double finalEnergy = powerStation.calculateEfficiency();
        System.out.printf("Final energy report: %.2f kWh\n", finalEnergy);
    }
}
