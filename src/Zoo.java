import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */
  public static void feed (List<? extends Bird> list) {
    // TODO fix method declaration

    for (int i = 0; i < list.size(); i++) {
      System.out.println("Feeding birds: " + list.get(i).getClass().getSimpleName());
    }
    // TODO print birds in the cycle
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    // TODO fix method declaration
    bird.checkWings();
    list.add(bird);
    System.out.println("Accepting bird to a section");

    // TODO check flying bird wings
    // TODO add bird to the list and print it
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List<Bird> list, Bird newBird) {
    // TODO fix method declaration
    System.out.println("Adding bird to the birds list");

    // TODO add bird to list
    list.add(newBird);
    for (Bird bird : list) {
      System.out.println(bird.toString());
    }
    // TODO print birds in the cycle
  }
}