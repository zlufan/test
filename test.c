#include "_secret_keys.h"
#include <stdio.h>

void printCredential() {
  printf("AKIAIOSFODNN7EXAMPLE"); // aws api key
  printf("AKIAAAAAAAAAAAAAAAAA"); // fake key
  printf(SECRET_KEY_1); // Google oauth token
  printf(SECRET_KEY_2); // fake key
  printf("12345232268769045678"); // nothing
  printf(SECRET_KEY_3); // twitter oauth token
  
}

void main() {
  printCredential();
}
