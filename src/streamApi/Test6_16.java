package streamApi;

import java.util.*;

public class Test6_16 {

    public static void main(String[] args) {
        //Address address = null;
        Address address = new Address();
        Optional<Address> add1 = Optional.ofNullable(address);
        Customer1 cust = new Customer1(add1);
        String test = (add1.isPresent()) ? add1.get().getCity() : "City Not available";
        System.out.println(test);
    }
}

class Customer1 {
    private Optional<Address> address;
    public Customer1(Optional<Address> address) {
        this.address = address;
    }
    public Optional<Address> getAddress() {
        return address;
    }
}

class Address {
    private String city = "Tokyo";
    public String getCity() {
        return city;
    }
    public String toString() {
        return city;
    }
}