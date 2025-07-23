package dobackaofront;

public class Address {
    private String zip_code;
    private String street_name;
    private int number;
    private String district;
    private String city;
    private String state;
    private String complement;

    public Address(String zip_code, String street_name, int number, String district, String city, String state, String complement) {
        this.zip_code = zip_code;
        this.street_name = street_name;
        this.number = number;
        this.district = district;
        this.city = city;
        this.state = state;
        this.complement = complement;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }
}
