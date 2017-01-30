class InchToMet {
  public static void main(String[] args) {
    double inches, metres, conversion, counter;

    conversion = 39.37;
    counter = 0;

    for(inches = 1; inches < 145; inches++) {
      metres = inches/conversion;
      System.out.println("There are " + metres + " metres in " + inches + "inches.");
      counter++;

      if(counter == 12) {
        System.out.println();
        counter = 0;
      }
    }
  }
}
