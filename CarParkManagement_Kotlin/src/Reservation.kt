class Reservation(
    val vehicule: Vehicule,
    val conducteur: Conducteur,
    val dateDebut: String,
    val dateFin: String,
    val kilometrageDebut: Int,
    var kilometrageFin: Int? = null
) {
    fun cloturerReservation(kilometrageRetour: Int) {
        kilometrageFin = kilometrageRetour
        vehicule.mettreAJourKilometrage(kilometrageRetour)
        vehicule.marquerDisponible()
        println("Réservation clôturée pour ${vehicule.immatriculation}. Nouveau kilométrage : $kilometrageRetour km.")
    }

    fun afficherDetails() {
        val kmFin = kilometrageFin ?: "Non retourné"
        println("Réservation - Véhicule : ${vehicule.immatriculation} | Conducteur : ${conducteur.prenom} ${conducteur.nom} | " +
                "Du $dateDebut au $dateFin | KM début : $kilometrageDebut | KM fin : $kmFin")
    }
}