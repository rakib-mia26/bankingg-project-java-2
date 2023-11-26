import java.util.ArrayList;
import java.util.Scanner;

public class Login extends UserInfo {
    private String name1;
    private String user;
    private String pass;
    void setName1(String name1){
        this.name1=name1;
    }
    void setPass(String pass){
        this.pass=pass;
    }
    void setUser(String user){
        this.user = user;
    }

    ArrayList<String> username = new ArrayList<>();
    ArrayList<String> password = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    void register(){
        name.add(name1);
        username.add(user);
        password.add(pass);
        System.out.println("Registration Successful");
        System.out.println("Press any key and enter");
        scanner.next();
    }
    void login(String user, String pass){
        int ind1= username.indexOf(user);
        int ind2= password.indexOf(pass);
        if(ind1!=-1){
            if(ind1==ind2){
                new_account(name.get(ind1),ind1);
            }
            else System.out.println("Invalid Password");
        }
        else System.out.println("Invalid Username");
    }

}
