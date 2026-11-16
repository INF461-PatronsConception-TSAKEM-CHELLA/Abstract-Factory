public class App {
    public static void main(String[] args) {
        // ==========================================
        // 1. TEST DE L'EXEMPLE DU COURS (2 familles)
        // ==========================================
        System.out.println("=== EXEMPLE DU COURS (Abstract Factory) ===");
        cours.IProduitFactory coursFactory1 = new cours.ProduitFactory1();
        cours.IProduitFactory coursFactory2 = new cours.ProduitFactory2();

        System.out.println("Utilisation de la premiere fabrique :");
        cours.ProduitA cProdA = coursFactory1.getProduitA();
        cours.ProduitB cProdB = coursFactory1.getProduitB();
        cProdA.methodeA();
        cProdB.methodeB();

        System.out.println("Utilisation de la seconde fabrique :");
        cProdA = coursFactory2.getProduitA();
        cProdB = coursFactory2.getProduitB();
        cProdA.methodeA();
        cProdB.methodeB();

        // ==========================================
        // 2. TEST DE L'EXEMPLE MODIFIE (3 familles)
        // ==========================================
        System.out.println("\n=== EXEMPLE MODIFIE (Ajout 3e famille) ===");
        modifie.IProduitFactory modFactory1 = new modifie.ProduitFactory1();
        modifie.IProduitFactory modFactory2 = new modifie.ProduitFactory2();
        modifie.IProduitFactory modFactory3 = new modifie.ProduitFactory3();

        System.out.println("Utilisation de la premiere fabrique :");
        modFactory1.getProduitA().methodeA();
        modFactory1.getProduitB().methodeB();

        System.out.println("Utilisation de la seconde fabrique :");
        modFactory2.getProduitA().methodeA();
        modFactory2.getProduitB().methodeB();

        System.out.println("Utilisation de la troisieme fabrique :");
        modFactory3.getProduitA().methodeA();
        modFactory3.getProduitB().methodeB();
    }
}