public class Shirt {
    public int shirtID = 777; // стандартне значення номера моделі сорочки
    public String description = "Black loose-fitting shirt"; // стандартний опис сорочки
    // коди кольорів: red=червоний, blau=синій, green=зелений, unset=невідомо
    public String colorCode = "unset";
    public double price = 723.0; // стандартна вартість сорочки
    public int quantityInStock = 65; // стандартна кількість на складі
    
    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
      System.out.println("Shirt ID: " + shirtID);
      System.out.println("Shirt description:" + description);
      System.out.println("Color Code: " + colorCode);
      System.out.println("Shirt price: $" + price);
      System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation
  } // кінець опису класу