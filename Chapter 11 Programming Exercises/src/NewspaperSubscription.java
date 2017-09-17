public abstract class NewspaperSubscription {

        //variable declaration
        protected String name, address;
        protected double rate;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public double getRate() {
        return rate;
    }
    public abstract void setAddress(String s);
}

