package Aula2.Ex5;

public class User {
    public String name;
    public String password;
    public Permission permission;

    User(String name, String password, Permission permission){
        this.name = name;
        this.password = password;
        this.permission = permission;
    }
}
