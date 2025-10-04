import kotlin.collections.*

class ParcAutomobile {
    private val vehicules: MutableList<Vehicule> = mutableListOf()
    val reservations: MutableList<Reservation> = mutableListOf()

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules.add(vehicule)
        println("Véhicule ajouté : ${vehicule.immatriculation}")
    }

    fun supprimerVehicule(immatriculation: String) {
        val vehicule = vehicules.find { it.immatriculation == immatriculation }
        if (vehicule != null) {
            vehicules.remove(vehicule)
            println("Véhicule supprimé : $immatriculation")
        } else {
            throw VehiculeNonTrouveException(immatriculation)
        }
    }

    fun reserverVehicule(immatriculation: String, conducteur: Conducteur, dateDebut: String, dateFin: String) {
        val vehicule = vehicules.find { it.immatriculation == immatriculation }
            ?: throw VehiculeNonTrouveException(immatriculation)

        if (!vehicule.estDisponible()) {
            throw VehiculeIndisponibleException()
        }

        vehicule.marquerIndisponible()
        val reservation = Reservation(vehicule, conducteur, dateDebut, dateFin, vehicule.kilometrage)
        reservations.add(reservation)
        println("Réservation confirmée pour ${vehicule.immatriculation} au nom de ${conducteur.prenom} ${conducteur.nom}")
    }

    fun afficherVehiculesDisponibles() {
        println("\nVéhicules disponibles-")
        val disponibles = vehicules.filter { it.estDisponible() }
        if (disponibles.isEmpty()) {
            println("Aucun véhicule disponible.")
        } else {
            disponibles.forEach { it.afficherDetails() }
        }
    }

    fun afficherReservations() {
        println("\nRéservations en cours")
        if (reservations.isEmpty()) {
            println("Aucune réservation.")
        } else {
            reservations.forEach { it.afficherDetails() }
        }
    }
}