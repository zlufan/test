import AASecretKeys.*
public class HelloWorld {
  public static void printCredential() {
    System.out.println("AKIAIOSFODNN7EXAMPLE"); // aws api key
    System.out.println("AKIAAAAAAAAAAAAAAAAA"); // fake key
    System.out.println(SECRET_KEY_1); // Google oauth token
    System.out.println(SECRET_KEY_2); // fake key
    System.out.println("12345232268769045678"); // nothing
    System.out.println(SECRET_KEY_3); // twitter oauth token
  }

  public static void main(String[] args) {
    printCredential();
  }
}
