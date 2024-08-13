import java.util.ArrayList;
import java.util.List;

public class Permutations {

    // Méthode principale pour générer toutes les permutations
    public static String[] permute(String str) {
        // Liste pour stocker toutes les permutations
        List<String> permutations = new ArrayList<>();
        // Appel de la méthode récursive pour générer les permutations
        generatePermutations("", str, permutations);
        // Conversion de la liste en tableau pour le retour du résultat
        return permutations.toArray(new String[0]);
    }

    // Méthode récursive pour générer les permutations
    private static void generatePermutations(String current, String remaining, List<String> permutations) {
        // Si tous les caractères ont été utilisés on ajouter la permutation a la liste
        if (remaining.isEmpty()) {
            permutations.add(current);
        } else {
            // Boucle pour iterer sur chaque caractère restant
            for (int i = 0; i < remaining.length(); i++) {
                // Appel récursif avec un caractère ajouté a current et le reste a permuter
                generatePermutations(current + remaining.charAt(i), 
                                     remaining.substring(0, i) + remaining.substring(i + 1), 
                                     permutations);
            }
        }
    }

    public static void main(String[] args) {
        String input = "INF";
        String[] result = permute(input);

        // Affiché le nombre de permutations générées
        System.out.println(result.length);

        // Affichage des permutations générées
        for (String s : result) {
            System.out.println(s);
        }
    }
}
