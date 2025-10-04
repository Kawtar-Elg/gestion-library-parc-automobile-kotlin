class Utilisateur(
    nom: String,
    prenom: String,
    email: String,
    val idUtilisateur: Int
) : Personne(nom, prenom, email) {

    val emprunts: MutableList<Emprunt> = mutableListOf()

    fun emprunterLivre(livre: Livre, dateEmprunt: String) {
        if (livre.disponiblePourEmprunt()) {
            livre.nombreExemplaires -= 1
            val nouvelEmprunt = Emprunt(this, livre, dateEmprunt)
            emprunts.add(nouvelEmprunt)
            println("${prenom} a emprunté le livre '${livre.titre}'.")
        } else {
            println("Le livre '${livre.titre}' n'est pas disponible.")
        }
    }

    fun afficherEmprunts() {
        if (emprunts.isEmpty()) {
            println("Aucun emprunt pour ${prenom} ${nom}.")
        } else {
            println(" Emprunts de ${prenom} ${nom} :")
            emprunts.forEach { it.afficherInfos() }
        }
    }
}