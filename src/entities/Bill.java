package entities;

public class Bill {
    public String gender;
    public int beer;
    public int barbecue;
    public int softDrink;
    public double ticket;

    public double cover() {
        if (feeding() + ticket() > 30) {
            return 0.00; // Couvert isento
        } else {
            return 4.00; // Valor do couvert
        }
    }

    public boolean isCoverIsento() {
        return cover() == 0.00;
    }

    public double feeding() {
        double beerPrice = 5.00;
        double barbecuePrice = 7.00;
        double softDrinkPrice = 3.00;

        double totalBeer = beerPrice * beer;
        double totalBarbecue = barbecuePrice * barbecue;
        double totalSoftDrink = softDrinkPrice * softDrink;

        return totalBeer + totalBarbecue + totalSoftDrink;
    }

    public double ticket() {
        if ("M".equals(this.gender)) {
            this.ticket = 10.00;
        } else if ("F".equals(this.gender)) {
            this.ticket = 8.00;
        }
        return this.ticket;
    }

    public double total() {
        return ticket() + feeding() + cover();
    }
}