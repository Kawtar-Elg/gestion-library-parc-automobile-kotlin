fun main() {
    val voiture1 = Voiture("AB-123-CD", "Renault", "Clio", 45000, true, 5, "Essence")
    val voiture2 = Voiture("XY-789-ZW", "Tesla", "Model 3", 12000, true, 4, "Électrique")
    val moto1 = Moto("MOTO-456", "Yamaha", "MT-07", 8000, true, 689)

    val conducteur1 = Conducteur("Lefèvre", "Sophie", "PERMIS-112233")
    val conducteur2 = Conducteur("Dubois", "Thomas", "PERMIS-445566")

    val parc = ParcAutomobile()
    parc.ajouterVehicule(voiture1)
    parc.ajouterVehicule(voiture2)
    parc.ajouterVehicule(moto1)

    parc.afficherVehiculesDisponibles()

    try {
        parc.reserverVehicule("AB-123-CD", conducteur1, "01/10/2025", "05/10/2025")
        parc.reserverVehicule("MOTO-456", conducteur2, "02/10/2025", "04/10/2025")

        parc.reserverVehicule("AB-123-CD", conducteur2, "03/10/2025", "06/10/2025")
    } catch (e: Exception) {
        println("Erreur : ${e.message}")
    }

    parc.afficherReservations()

    val reservationMoto = parc.reservations.find { it.vehicule.immatriculation == "MOTO-456" }
    reservationMoto?.cloturerReservation(8250)

    parc.afficherVehiculesDisponibles()
}

