package exercises01;

class Person {
  String firstName = "Bill";
  String lastName = "Nye";
  int age = 100;

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }
}
