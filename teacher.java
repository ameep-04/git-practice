public class teacher {
    private String email;

    public String getemail(){
        return email;
    }
    public void setemail(String email){
        this.email = email;
    }
    public static void main(String[] args){
        teacher obj = new teacher();
        obj.setemail("ameep04@gmail.com");

        System.out.println(obj.getemail());
    }
}
