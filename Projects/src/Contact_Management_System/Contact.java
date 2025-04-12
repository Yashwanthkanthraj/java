package Contact_Management_System;


public class Contact {

    private String name;
    private String phoneNumber;
    private String email;

    public  Contact(String name, String phone, String email) {
        setName(name);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name cannot be empty...!");
        }
        this.name = name.trim();
    }

    public void setPhoneNumber(String phoneNumber) {

        String digitsOnly = phoneNumber.replaceAll("[^ 0-9]", "");
        if (digitsOnly.length() < 10) {
            throw new IllegalArgumentException("A PHONE NUMBER MUST HAVE ATLEAST 10 DIGITS.");
        }
        this.phoneNumber = digitsOnly;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@") || !email.contains(".")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        this.email = email.trim();
    }

    @Override
    public String toString() {
        return String.format("Name: %s | Phone: %s | Email: %s", name, phoneNumber, email);
    }

}
