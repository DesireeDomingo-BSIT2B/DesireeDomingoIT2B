class Directory {
    
    private String name;
    private String con;
    private String avail;

    
    public Directory(String name, String con, String avail) {
        this.name = name;
        this.con = con;
        this.avail = avail;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the con
     */
    public String getCon() {
        return con;
    }

    /**
     * @param con the con to set
     */
    public void setCon(String con) {
        this.con = con;
    }

    /**
     * @return the avail
     */
    public String getAvail() {
        return avail;
    }

    /**
     * @param avail the avail to set
     */
    public void setAvail(String avail) {
        this.avail = avail;
    }
    
    public void showInfo() {
        System.out.println("\nItem: " + name + "\nCondition: " + con + "\nAvailability: " + avail);
    }

    void getInput() {
        System.out.println("\nItem: " + name + "\nCondition: " + con + "\nAvailability: " + avail);
    }

    void getOutput() {
        System.out.println("\nItem: " + name + "\nCondition: " + con + "\nAvailability: " + avail);
    }

}
