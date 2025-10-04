class Emprunt(
    val utilisateur: Utilisateur,
    val livre: Livre,
    val dateEmprunt: String,
    var dateRetour: String? = null
) : Affichable {

    override fun afficherInfos() {
        val retour = dateRetour ?: "Non retourné"
        println("Emprunt - Livre : ${livre.titre}, Utilisateur : ${utilisateur.prenom} ${utilisateur.nom}, " +
                "Emprunté le : $dateEmprunt, Retourné le : $retour")
    }

    fun retournerLivre() {
        if (dateRetour == null) {
            dateRetour = "05/10/2025" // ou la date actuelle
            livre.nombreExemplaires += 1
            println("Le livre '${livre.titre}' a été retourné avec succès.")
        } else {
            println("Ce livre a déjà été retourné.")
        }
    }
}