public class Main {
    public static void main(String[] args) {
        ChaineCryptee chaine=ChaineCryptee.deCryptee("BCDEFG",1);
        System.out.println(chaine.crypte());
        System.out.println(chaine.decrypte());

        ChaineCryptee chaine2=ChaineCryptee.deEnClair("CDEFGH",1);
        System.out.println(chaine2.decrypte());
        System.out.println(chaine2.crypte());


    }

}
