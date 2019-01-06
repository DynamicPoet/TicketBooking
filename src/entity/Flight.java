package entity;

public class Flight {
    private String num;
    private String from;
    private String to;
    private int price;
    private int storage;
    private String company;
    private String type;
    private String depart;
    private String arrival;

    public Flight(String num, String from, String to, int price, int storage, String company, String type, String depart, String arrival) {
        this.num = num;
        this.from = from;
        this.to = to;
        this.price = price;
        this.storage = storage;
        this.company = company;
        this.type = type;
        this.depart = depart;
        this.arrival = arrival;
    }
    public Flight(){}

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }
}
