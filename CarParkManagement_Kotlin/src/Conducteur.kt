class Conducteur(
    val nom: String,
    val prenom: String,
    val numeroPermis: String
) {
    fun afficherDetails() {
        println("Conducteur : $prenom $nom | Permis : $numeroPermis")
    }
}