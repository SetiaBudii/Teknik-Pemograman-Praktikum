
public class UpinIpin {
    public static void main(String[] args) {
        Item name = new Item("upin");
    }
}

public class Item {
        private String name;
        private Item() {
            name = "Ipin";
        }
        
        public Item(String name) {
            this();
            System.out.println(this.name);
      
        }
}