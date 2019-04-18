package net.wanho.pojo;

/**
 * Created by acer on 2019/4/18.
 */
public class User {
    private int id;
    private String name;
    private String sid;

    public User() {
    }

    public User(int id, String name, String sid) {
        this.id = id;
        this.name = name;
        this.sid = sid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                '}';
    }
}
