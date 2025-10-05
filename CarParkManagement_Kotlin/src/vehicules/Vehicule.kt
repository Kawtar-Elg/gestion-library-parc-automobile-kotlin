interface Vehicule {
    val immatriculation: String
    val marque: String
    val modele: String
    var kilometrage: Int
    var disponible: Boolean


    fun estDisponible(): Boolean = disponible

    fun marquerIndisponible() {
        disponible = false
    }

    fun marquerDisponible() {
        disponible = true
    }

    fun mettreAJourKilometrage(km: Int) {
        kilometrage = km
    }


    fun afficherDetails()
}