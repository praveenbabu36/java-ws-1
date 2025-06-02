import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Comparator_Ex_5 {

    public static void main(String[] args) {

        /*
            Comparator before Java 8
         */
        List<User> usersList = new ArrayList<>();
        usersList.add(new User("Vasu", 32));
        usersList.add(new User("Maitreya", 23));
        usersList.add(new User("Jatav", 50));

        // Comparator using anonymous inner class
        Comparator<User> userAgeComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(usersList, userAgeComparator);

        System.out.println("Sort Users by Age:\n--------------------");

        for(User user : usersList) {
            System.out.println(user);
        }


        /*
            Implement Comparator in Lambda Way
         */
        Comparator<User> userNameComparator = (User u1, User u2) -> u1.getName().compareToIgnoreCase(u2.getName());

        Collections.sort(usersList, userNameComparator);

        System.out.println("Sort Users by Name:\n--------------------");

        for(User user : usersList) {
            System.out.println(user);
        }


        /*
            Lambda - Without mentioning the Type in Parameters
         */
        Comparator<User> userAgeComparator2 = (u1, u2) -> u1.getName().compareToIgnoreCase(u2.getName());

        Collections.sort(usersList, userNameComparator);

        System.out.println("Sort Users by Age (Style2):\n-----------------------");

        for(User user : usersList) {
            System.out.println(user);
        }
    }

}


class User {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}



