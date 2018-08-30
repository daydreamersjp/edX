public static class Crypto {

  public static void main (String[] args) {
  
  
  }
  
  // Part 1 - Normalize Text
  public static String normalizeText(String str) {
    str = str.replaceAll(" ", "");
    for (int i=0; i < ".,:;'\"!?()".length(), i++) {
      str = str.replaceAll(".,:;'\"!?()".charAt(i), "");
    }
    str = str.toUpperCase();
    return str;
  }
  



}
