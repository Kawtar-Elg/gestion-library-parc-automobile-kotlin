class Bibliotheque : GestionBibliotheque {

    private val utilisateurs: MutableList<Utilisateur> = mutableListOf()
    private val livres: MutableList<Livre> = mutableListOf()

    override fun ajouterUtilisateur(utilisateur: Utilisateur) {
        utilisateurs.add(utilisateur)
        println("Utilisateur ajouté : ${utilisateur.prenom} ${utilisateur.nom}")
    }

    override fun ajouterLivre(livre: Livre) {
        livres.add(livre)
        println("Livre ajouté : ${livre.titre}")
    }

    override fun afficherTousLesLivres() {
        println("\nTous les livres disponibles")
        if (livres.isEmpty()) {
            println("Aucun livre dans la bibliothèque.")
        } else {

            for (livre in livres) {
                livre.afficherInfos()
            }
        }
    }

    fun rechercherLivreParTitre(titre: String): Livre? {
        for (livre in livres) {
            if (livre.titre.equals(titre, ignoreCase = true)) {
                return livre
            }
        }
        return null // Pas trouvé
    }
}