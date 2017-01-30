class Gravity {
  public static void main(String[] args) {
    double mass, gravity, weight;

    mass = 51;
    gravity = 1.6;

    weight = mass * gravity;

    System.out.println("My weight on the moon is " + weight + " newtons.");

    gravity = 10;

    weight = mass * gravity;

    System.out.println("My weight on Earth is " + weight + " newtons.");

  }
}
