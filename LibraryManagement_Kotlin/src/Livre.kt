class Livre(
    val titre: String,
    val auteur: String,
    val isbn: String,
    var nombreExemplaires: Int
) : Affichable {

    override fun afficherInfos() {
        println("Titre : $titre, Auteur : $auteur, ISBN : $isbn, Exemplaires disponibles : $nombreExemplaires")
    }

    fun disponiblePourEmprunt(): Boolean {
        return nombreExemplaires > 0
    }

    fun mettreAJourStock(nouveauStock: Int) {
        nombreExemplaires = nouveauStock
    }
}