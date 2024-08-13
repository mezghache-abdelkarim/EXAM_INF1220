import java.util.Arrays;

public class VerificationCours {

    // Le sigle du cours de programmation inscrits 
    private static final int SIGLE_COURS = 1220; 

    public boolean verifierSigle(int[] tab) {
        int count = 0;
        System.out.println("Tableau en cours de vérification : " + Arrays.toString(tab));

        for (int valeur : tab) {
            if (valeur == SIGLE_COURS) {
                count++;
            }
        }

        return count == 1;
    }

    public static void main(String[] args) {
        VerificationCours verification = new VerificationCours();
        
        int[] tab1 = {1250, 1220, 1220, 1425}; // le sigle du cour 1220 est present plusieur fois
        int[] tab2 = {1220, 1410};       // le sigle du cour 1220 est present une seul fois 
        int[] tab3 = {1410, 1250, 1425};  // le sigle du cour 1220 n'est present

        System.out.println("Résultat : " + verification.verifierSigle(tab1) +"\n"); // false
      
        System.out.println("Résultat : " + verification.verifierSigle(tab2)+"\n"); // true

        System.out.println("Résultat : " + verification.verifierSigle(tab3)+"\n"); // false

    }
}
