public class PriceVisitor implements Visitor
{
    public double visit (Product product)
    {
        double newPrice = 0;
        if (product instanceof LaptopComputer)
        {
            LaptopComputer lc = (LaptopComputer) product;
            if (lc.getBrand().equalsIgnoreCase("Microsoft Surface"))
            {
                lc.setPrice(lc.getPrice() * 80 / 100);
            }
            newPrice = lc.getPrice() * lc.getQuantity();
        }
        else if (product instanceof MobilPhone)
        {
            MobilPhone phone = (MobilPhone) product;
            if (phone.getBrand().equalsIgnoreCase("Apple"))
            {
                if (phone.getPrice() > 400)
                {
                    phone.setPrice(phone.getPrice() - 30);
                }
                newPrice = phone.getPrice() * phone.getQuantity();
            }
            if (phone.getBrand().equalsIgnoreCase("Samsung"))
            {
                if (phone.getModel().equalsIgnoreCase("Galaxy S8"))
                {
                    phone.setPrice(phone.getPrice() * 80 / 100);
                }
                newPrice = phone.getPrice() * phone.getQuantity();
            }
        }
        else if( product instanceof VideoGame)
        {
            VideoGame console = (VideoGame) product;
            if(console.getBrand().equalsIgnoreCase("Sony-Playstation"))
            {
                console.setPrice(console.getPrice() * 80 / 100);
                newPrice = console.getPrice() * console.getQuantity();
            }
            if(console.getBrand().equalsIgnoreCase("Microsoft Xbox One"))
            {
                if(console.getQuantity() == 2)
                {
                    console.setPrice(console.getPrice() * 70 / 100);
                }
                newPrice = console.getPrice() * console.getQuantity();
            }

        }

        return newPrice;
    }
}
