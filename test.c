#include "_secret_keys.h"
#include <stdio.h>

void printCredential() {
  printf(SECRET_KEY_1); // aws api key
  printf("AKIAAAAAAAAAAAAAAAAA"); // fake key
  printf(SECRET_KEY_2); // Google oauth token
  printf("AIzaABABABABABABABABA_ABABABABABABAB_AB"); // fake key
  printf("12345232268769045678"); // nothing
  printf(SECRET_KEY_3); // twitter oauth token
  
}

void main() {
  printCredential();
}
