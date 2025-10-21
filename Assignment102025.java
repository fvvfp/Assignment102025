class Assignment102025 {
   public static void main(String[] args) {
      for (int i = 0; i < 100; i++) {
         for (int j = 0; j < 10 - (int) (Math.cos(i*0.5)*10); j++) {
            System.out.print("$");
         }
         System.out.println("");
      }
   }
}
