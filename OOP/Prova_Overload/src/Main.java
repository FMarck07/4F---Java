public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Alessio");
        // getNome() = interfaccia pubblica
        System.out.println(studente1.getNome());
        Studente studente2 = new Studente("Alessio","Poli");
        System.out.println(studente2.getNome() + " " +studente2.getCognome());
    }
}