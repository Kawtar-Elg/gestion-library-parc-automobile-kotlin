abstract class GestionBibliotheque {
    protected val utilisateurs: MutableList<Utilisateur> = mutableListOf()
    protected val livres: MutableList<Livre> = mutableListOf()

    abstract fun ajouterUtilisateur(utilisateur: Utilisateur)
    abstract fun ajouterLivre(livre: Livre)
    abstract fun afficherTousLesLivres()
}