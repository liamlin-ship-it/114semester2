package May;

import java.util.Scanner;

class Zoo{
    private final String animal;
    private int feed;
    private int buyTimes;

    public Zoo(String animal){
        this.animal = animal;
        this.feed = 1000;
    }

    public String getAnimal(){
        return animal;
    }

    public void setBuyTime(int buyTime){
        buyTimes = buyTime;
    }

    public void feedOnce(){
        if (feed < 100){
            this.buyFeed();
        }
        feed -= 100;
    }

    public void buyFeed(){
        if (buyTimes != 0){
            buyTimes--;
            feed += 100;
        }else {
            System.out.println("No enough feed!!");
            System.exit(0);
        }
    }

    public int remainFeed(){
        int result;
        if (buyTimes != 0){
            result = feed + buyTimes * 100;
        }else {
            result = feed;
        }
        return result;
    }
}

public class May22thr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animal = scanner.next();
        int feedTime = scanner.nextInt();
        int buyTime = scanner.nextInt();

        Zoo zoo = new Zoo(animal);
        zoo.setBuyTime(buyTime);

        for (int i = 0; i < feedTime; i++) {
            zoo.feedOnce();
        }

        System.out.println("I have a(n) " + zoo.getAnimal());
        System.out.println("Remain Feed: " + zoo.remainFeed());
    }
}
