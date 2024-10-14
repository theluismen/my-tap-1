public class Customer {
    /* ATRIBUTOS */
    private int id;
    private String name;
    private String address;
    private String phone;

    /* MÉTODOS */
    // Constructor
    public Customer (int id, String name, String address, String phone) {
        this.id         = id;
        this.name       = name;
        this.address    = address;
        this.phone      = phone;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    // Setters
    public void setId( int id ) {
        this.id = id;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setAddress( String address ) {
        this.address = address;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }

    // Métodos Auxiliares
    public String toString() {
        return "{"
                + "\"id\": " + this.id + ", "
                + "\"name\": \"" + this.name + "\", "
                + "\"address\": \"" + this.address + "\", "
                + "\"phone\": \"" + this.phone + "\""
                + "}";
    }

    public boolean equals ( Customer c ) {
        return this.id == c.getId();
    }
}
