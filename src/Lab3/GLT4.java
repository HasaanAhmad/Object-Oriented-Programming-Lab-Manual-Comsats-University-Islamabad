package Lab3;

public class GLT4 {
    public static void main(String[] args) {
        HotDogStand stand1 = new HotDogStand(1, 0);
        HotDogStand stand2 = new HotDogStand(2, 0);
        HotDogStand stand3 = new HotDogStand(3, 0);

        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand1.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand2.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();
        stand3.justSold();

        stand1.display();
        stand2.display();
        stand3.display();
    }

}

class HotDogStand {
    private int _uid;
    private int soldToday;

    public HotDogStand(int _uid, int soldToday) {
        this._uid = _uid;
        this.soldToday = soldToday;
    }

    public int get_uid() {
        return _uid;
    }

    public void set_uid(int _uid) {
        this._uid = _uid;
    }

    public int getSoldToday() {
        return soldToday;
    }

    public void setSoldToday(int soldToday) {
        this.soldToday = soldToday;
    }

    void justSold() {
        soldToday++;
    }

    void display() {
        System.out.println("ID : " + _uid);
        System.out.println("Sold Today: " + soldToday);
    }

}
