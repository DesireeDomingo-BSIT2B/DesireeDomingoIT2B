public class Input extends Directory {
    
    private String put = "Input";
    
    public Input(String name, String con, String avail) {
        super(name, con, avail);
    }
    
    public void showInfo() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }
    
    public void getInput() {
        System.out.println("\n" + this.put + "\n" + getAvail() + "\nItem: " + getName() + "\nCondition: " + getCon() + "\n");
    }
}
