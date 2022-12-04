package pl.edu.wszib.labjackson;

record Address(String town, String postCode, String street, String buildingNumber) {
    public Address() {
        this("", "", "", "");
    }
}
