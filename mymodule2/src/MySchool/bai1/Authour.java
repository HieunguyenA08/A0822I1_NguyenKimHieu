package MySchool.bai1;

public class Authour {
    private String name, email;
    private boolean gender = false;



    public Authour(String name, String email, boolean gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Authour{" +
                "name='" + name + '\'' +
                ", gender=" + gender + " at " +
                ", email='" + email + '\'' +
                '}';
    }
    public String isMale (){
        if (this.gender==false){
            return "female";
        }else
            return "male";
    }
    public void showAuthor (){
        isMale();
        System.out.println(toString());
    }
}
