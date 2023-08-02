import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        names();
    }

        static class Cat {
            private String name;

            public String getName()
            {
                return name;
            }

            public void setName(String s)
            {
                System.out.println("past name "+name+" future "+s);
                name = s;
            }

            public void say()
            {
                System.out.println("cat "+name+" says MEO");
            }

            public Cat()
            {
                setName( "noname");
            }

            public Cat(String name)
            {
                setName(name);
            }
        }

        static void names() {
            System.out.println("Enter three names:");
            Scanner sc = new Scanner(System.in);
            Cat[] massive = new Cat[3];
            for (int i = 0; i < 3 ; i++) {
                massive[i]=new Cat(sc.next());
            }

        }

    }

