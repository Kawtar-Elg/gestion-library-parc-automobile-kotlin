class VehiculeIndisponibleException(message: String = "Ce véhicule n'est pas disponible pour réservation.") :
    Exception(message)