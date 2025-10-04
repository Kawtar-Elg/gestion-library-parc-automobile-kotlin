class Bibliotheque : GestionBibliotheque() {

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
            livres.forEach { it.afficherInfos() }
        }
    }

}