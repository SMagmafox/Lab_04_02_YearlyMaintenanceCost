//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double springCost = 500.50;
        double summerCost = 250.25;
        double fallCost = 400.00;
        double winterCost = 500.00;
        double totalCost = 0;
        totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("The cost for spring is $" + springCost);
        System.out.println("The cost for summer is $" + summerCost);
        System.out.println("The cost for fall is $" + fallCost);
        System.out.println("The cost for winter is $" + winterCost);
        System.out.println("The total cost for the year is $" + totalCost);
    }
}