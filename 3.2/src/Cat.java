
public class Cat
{
    private double originWeight;
    private double weight;
    public double weightFeed;

    private double minWeight;
    private double maxWeight;
    

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weightFeed = weight + amount;
        System.out.println("Животное съело - " + massOfFoodEaten());
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }


    }
    public double massOfFoodEaten() {
        double weightOfFoodEaten = weightFeed - weight;
        return weightOfFoodEaten;
    }

    public void goingToToilet (Double amount) {
        weight = weight - amount;
        System.out.println("Сходили в туалет, вес уменьшился и составляет - " + weight);
    }
}