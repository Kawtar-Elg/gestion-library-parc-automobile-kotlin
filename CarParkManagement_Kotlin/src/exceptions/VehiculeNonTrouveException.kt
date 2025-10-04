class VehiculeNonTrouveException(immatriculation: String) :
    Exception("Aucun véhicule trouvé avec l'immatriculation : $immatriculation")