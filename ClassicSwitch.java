public class ClassicSwitch {
    
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
            switch (animal) {
                case Dog:
                case Cat:
                    System.out.printf("%s is a pet%n", animal);
                    break;
                case Pig:
                    System.out.printf("%s is a farm animal%n", animal);
                    break;
                case Moose:
                    System.out.printf("%s is a wild animal%n", animal);
                    break;
                default:
                    throw new IllegalArgumentException(
                            String.format("Unknown person: %s", animal));
            }
        }
}
