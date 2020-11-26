from _secret_keys.py import *
def print_credential():
  print(SECRET_KEY_1); # aws api key
  print("AKIAAAAAAAAAAAAAAAAA"); # fake key
  print(SECRET_KEY_2); # Google oauth token
  print(SECRET_KEY_3); # fake key
  print("12345232268769045678"); # nothing
  print(SECRET_KEY_4); # twitter oauth token
  
if __name__ == '__main__':
  print_credential()
