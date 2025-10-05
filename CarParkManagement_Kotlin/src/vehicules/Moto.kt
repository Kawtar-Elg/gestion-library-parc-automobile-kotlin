class Moto(
    override val immatriculation: String,
    override val marque: String,
    override val modele: String,
    override var kilometrage: Int,
    override var disponible: Boolean = true,
    val cylindree: Int
) : Vehicule {

    override fun afficherDetails() {
        println("Moto - Immatriculation :" +
                " \n$immatriculation " +
                " \nMarque : $marque " +
                " \nModèle : $modele  " +
                " \nCylindrée : ${cylindree}cm³ " +
                " \nKilométrage : $kilometrage km" +
                " \nDisponible : $disponible")
    }
}