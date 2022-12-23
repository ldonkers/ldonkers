public class NewSwitch {

    enum Animals {
        Dog, Cat, Mouse, Pig, Moose,
    }
    public static void main(String[] args) {
        print(Animals.Cat);
        print(Animals.Moose);
        print(Animals.Dog);
        print(Animals.Pig);
    }
    static void print(Animals animal ) {
        String description = switch (animal) {
            case Dog, Cat       -> "pet";
            case Pig            -> "farm animal";
            case Moose          -> "wild animal";
            default            -> {
                System.out.printf("Oops! I don't know about %s%n", animal);
                yield "---";
            }
        };
        
          System.out.printf("%s ia a %s%n", animal, description);
    }
}

