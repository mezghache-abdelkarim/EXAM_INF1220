public class Main {
    public static void main(String[] args) {
        int a = 2147483647;
        int b = -2147483648;
        System.out.println("La moyenne est : " + moyenne(a, b));
    }

    public static int moyenne(int a, int b) {
        // Calcul de la moyenne sans risque de dépassement de capacité
        return a / 2 + b / 2 + (a % 2 + b % 2) / 2;
    }
}
