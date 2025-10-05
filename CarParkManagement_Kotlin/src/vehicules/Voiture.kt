class Voiture(
    override val immatriculation: String,
    override val marque: String,
    override val modele: String,
    override var kilometrage: Int,
    override var disponible: Boolean = true,
    val nombrePortes: Int,
    val typeCarburant: String
) : Vehicule {

    override fun afficherDetails() {
        println("Voiture - Immatriculation : $immatriculation | Marque : $marque | Modèle : $modele | " +
                "Portes : $nombrePortes | Carburant : $typeCarburant | Kilométrage : $kilometrage km | Disponible : $disponible")
    }
}