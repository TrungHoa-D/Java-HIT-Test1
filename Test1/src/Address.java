public class Address {
    private String city;
    private String district;

    public void input(String tp, String h)
    {
        city=tp;
        district=h;
    }
    public void output()
    {
        System.out.println("Thanh Pho (Tinh): "+city);
        System.out.println("Quan (Huyen): "+district);
    }
    public Address(String city, String distric) {
        this.city = city;
        this.district = distric;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String distric) {
        this.district = distric;
    }
}
