import * from _secret_keys.js
function printSecret() {
  console.log("AKIAIOSFODNN7EXAMPLE"); // aws api key
  console.log("AKIAAAAAAAAAAAAAAAAA"); // fake key
  console.log(SECRET_KEY_1); // Google oauth token
  console.log(SECRET_KEY_2); // fake key
  console.log("12345232268769045678"); // nothing
  console.log(SECRET_KEY_3); // twitter oauth token
}

printSecret()
