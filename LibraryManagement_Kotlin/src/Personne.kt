open class Personne(
    val nom: String,
    val prenom: String,
    val email: String
) : Affichable {

    override fun afficherInfos() {
        println("Nom : $nom, Prénom : $prenom, Email : $email")
    }
}