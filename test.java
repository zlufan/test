import AASecretKeys.*
public class HelloWorld {
  public static void printCredential() {
    System.out.println(SECRET_KEY_1); // aws api key
    System.out.println(SECRET_KEY_2); // fake key
    System.out.println(SECRET_KEY_3); // Google oauth token
    System.out.println(SECRET_KEY_4); // fake key
    System.out.println("12345232268769045678"); // nothing
    System.out.println(SECRET_KEY_5); // twitter oauth token
  }

  public static void main(String[] args) {
    printCredential();
  }
}
