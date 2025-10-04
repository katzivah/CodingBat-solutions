public String doubleChar(String str) {
  String doubled = "";
  for(int i = 0; i < str.length(); i++) {
    doubled += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));
    /** 
      OR -> str.substring(i, i + 1) + str.substring(i, i + 1);
    */
  }
  return doubled;
}
