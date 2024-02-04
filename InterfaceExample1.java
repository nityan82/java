public class InterfaceExample1 {
    public static void main(String[] args) {
        Player sam = new PlayerImpl();
        sam.play("Solitaire");

        Player ram = new Player() {
            @Override
            public void play(String game) {
                System.out.println("Playing " + game);
            }
        };
        ram.play("Cricket");

        Player nitya = game -> System.out.println("Playing " + game); //lambda expression
        nitya.play("Badminton");

        Greetings greetings = name -> System.out.println("Hello  " + name);
        greetings.hello("Sam");

        //Lambda expression is an implementation of interface
        Addition sumoftwo = (x,y) -> System.out.println("Sum is "+ (x+y));
        sumoftwo.sum(5,2);
    }
}

interface Greetings {
    void hello(String name);
   // void bye(String name);
}

interface Addition {
    void sum(int x, int y);
}

interface Player {
    void play(String game);
}

class PlayerImpl implements Player {
    @Override
    public void play(String game) {
        System.out.println("Playing " + game);
    }
}
