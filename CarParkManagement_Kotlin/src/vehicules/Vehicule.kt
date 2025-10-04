abstract class Vehicule(
    val immatriculation: String,
    val marque: String,
    val modele: String,
    var kilometrage: Int,
    var disponible: Boolean = true
) {
    open fun afficherDetails() {
        println("Immatriculation : $immatriculation | Marque : $marque | Modèle : $modele | Kilométrage : $kilometrage km | Disponible : $disponible")
    }

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
}