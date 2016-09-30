package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Jackson {
    private String fname;
    private String lname;
    private String email;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String introduceYourself(){
        return "Hello I am "+ fname +" "+ lname;
    }

    public Jackson(){

    }

    public Jackson(String fname, String lname){
    this.lname = lname;
    this.fname = fname;
}
}

