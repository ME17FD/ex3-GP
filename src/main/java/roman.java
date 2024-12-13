public class roman {
    

        public static String convertirEnRomains(int nombre) {
            
    
            int[] valeurs = { 10, 9, 5, 4, 1};
            String[] symboles = { "X", "IX", "V", "IV", "I"};
    
            StringBuilder resultat = new StringBuilder();
    
            for (int i = 0; i < valeurs.length; i++) {
                while (nombre >= valeurs[i]) {
                    resultat.append(symboles[i]);
                    nombre -= valeurs[i];
                }
            }
    
            return resultat.toString();
        }
    
        public static void main(String[] args) {
            int nombre = 4534; 
           
            String romain = convertirEnRomains(nombre);
            System.out.println("Le chiffre arabe " + nombre + " en chiffre romain est : " + romain);
            
        }
    
}
