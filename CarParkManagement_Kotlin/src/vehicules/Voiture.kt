class Voiture(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    disponible: Boolean = true,
    val nombrePortes: Int,
    val typeCarburant: String
) : Vehicule(immatriculation, marque, modele, kilometrage, disponible) {

    override fun afficherDetails() {
        println("Voiture - Immatriculation : $immatriculation " +
                "\nMarque : $marque" +
                "\nModèle : $modele  " +
                "\nPortes : $nombrePortes" +
                "\nCarburant : $typeCarburant " +
                "\nKilométrage : $kilometrage km " +
                "\nDisponible : $disponible")
    }
}