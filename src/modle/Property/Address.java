package modle.Property;

public class Address {
    String fullAddress;
    String city;
    int postCode;

    public Address(String city, String fullAddress, int postCode) {

        this.city = city;
        this.fullAddress = fullAddress;
        this.postCode = postCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }


    public String getCity() {
        return city;
    }

    public String getStreet() {
        return fullAddress;
    }

    public int getPostCode() {
        return postCode;
    }
}
