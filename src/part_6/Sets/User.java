package part_6.Sets;

//public class User implements Comparable<User> {
public class User {

    String name;
    Integer id;

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", name, id);
    }

//    @Override
//    public int compareTo(User o) {
//        return (this.id - o.id);
//    }
}
