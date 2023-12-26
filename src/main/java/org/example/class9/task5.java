package org.example.class9;

public class task5 {
    /* Using 2D array create a grocery list.Inside you should have an array of veggies,
    fruits, dairy and sweets. Retrieve all values from that array using 2 different loops
     */
    public static void main(String[] args) {
        String[][] grocery = {
                {"Broccoli", "Zucuni", "Cauliflower", "Okra"},
                {"Apple", "Mango", "Kiwi", "Blacberry"},
                {"Butter", "Ghee", "Yogurt", "Cheese"},
                {"Kheer","Julebi", "laddu","Gulabjamun"}};

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----using enhanced loop-----");
        System.out.println();
        for (String[] shoppingList:grocery){
            for(String market:shoppingList){
                System.out.print(market+" ");
            }
            System.out.println();
        }
    }
}
