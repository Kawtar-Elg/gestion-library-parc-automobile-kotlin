class Moto(
    immatriculation: String,
    marque: String,
    modele: String,
    kilometrage: Int,
    disponible: Boolean = true,
    val cylindree: Int
) : Vehicule(immatriculation, marque, modele, kilometrage, disponible) {

    override fun afficherDetails() {
        println("Moto - Immatriculation : $immatriculation " +
                "\nMarque : $marque " +
                "\nModèle : $modele " +
                "\nCylindrée : ${cylindree}cm³ " +
                "\nKilométrage : $kilometrage km " +
                "\nDisponible : $disponible")
    }
}