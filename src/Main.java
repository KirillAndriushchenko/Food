public class Main {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[10];
        int itemsSoFar = 0;
        int MilkAm = 0;
        Milk Mi = new Milk(null);

        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Milk")) {
                breakfast[itemsSoFar] = new Milk(parts[1]);
                System.out.println(breakfast[itemsSoFar]);
            }
            itemsSoFar++;
        }

        System.out.println("amount of products");
        for (int i = 0; i < 20; i++) {
            if (breakfast[i] != null){
                 if (breakfast[i].equals(Mi)) {
                    MilkAm++;
                }
            } else break;
        }
        System.out.println("Amount of milk is " + MilkAm + "");
        for (Food item : breakfast) {
            if (item != null) {
                item.consume();
            } else break;
        }
    }
}
