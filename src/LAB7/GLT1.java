package LAB7;

/*
Create a class named Movie that can be used with your video rental business. The Movie class should 
track the Motion Picture Association of America (MPAA) rating (e.g., Rated G, PG-13, R), ID Number, 
and movie title with appropriate accessor and mutator methods. Also create an equals() method that 
overrides Object ’s equals() method, where two movies are equal if their ID number is identical. Next, 
create three additional classes named Action , Comedy , and Drama that are derived from Movie . 
Finally, create an overridden method named calcLateFees that takes as input the number of days a movie 
is late and returns the late fee for that movie. The default late fee is $2/day. Action movies have a late fee 
of $3/day, comedies are $2.50/day, and dramas are $2/day. Test your classes from a main method
*/

class Movie {
    String rating;
    int ID;
    String Title;

    public Movie(String rating, int iD, String title) {
        this.rating = rating;
        ID = iD;
        Title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    Boolean equals(Movie m1) {
        if (this.ID == m1.ID) {
            System.out.println("Equal");
            return true;
        } else {
            System.out.println("Not Equal");
            return false;
        }
    }
}

class Action extends Movie {
    public Action(String rating, int iD, String title) {
        super(rating, iD, title);
    }

    double calcLateFees(int days) {
        return days * 3;
    }
}

class Comedy extends Movie {
    public Comedy(String rating, int iD, String title) {
        super(rating, iD, title);
    }

    double calcLateFees(int days) {
        return days * 2.5;
    }
}

class Drama extends Movie {
    public Drama(String rating, int iD, String title) {
        super(rating, iD, title);
    }

    double calcLateFees(int days) {
        return days * 2;
    }
}

public class GLT1 {
    public static void main(String[] args) {
        Movie m1 = new Movie("R Rated", 101, "The adventures of JAVA");
        Action a1 = new Action("R Rated", 101, "The adventures of JAVA");
        Comedy c1 = new Comedy("R Rated", 101, "The adventures of JAVA");
        Drama d1 = new Drama("R Rated", 101, "The adventures of JAVA");

        System.out.println("$" + a1.calcLateFees(2));
        System.out.println("$" + c1.calcLateFees(2));
        System.out.println("$" + d1.calcLateFees(2));
        m1.equals(a1);
    }

}
