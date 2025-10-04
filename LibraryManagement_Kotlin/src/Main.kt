fun main() {
    val livre1 = Livre("Le Pain Nu", "Mohamed Choukri", "978-3-16-148410-0", 3)
    val livre2 = Livre("La Boîte à Merveilles", "Ahmed Sefrioui", "978-0-452-28423-4", 2)
    val livre3 = Livre("Le Jardin de Badal", "Driss Chraïbi", "978-0-7475-3269-9", 1)

    val user1 = Utilisateur("El Amrani", "Salma", "salma.elamrani@email.com", 101)
    val user2 = Utilisateur("El Mansouri", "Hamza", "hamza.elmansouri@email.com", 102)

    val bibliotheque = Bibliotheque()
    bibliotheque.ajouterLivre(livre1)
    bibliotheque.ajouterLivre(livre2)
    bibliotheque.ajouterLivre(livre3)

    bibliotheque.ajouterUtilisateur(user1)
    bibliotheque.ajouterUtilisateur(user2)

    bibliotheque.afficherTousLesLivres()

    user1.emprunterLivre(livre1, "01/10/2025")
    user2.emprunterLivre(livre2, "02/10/2025")
    user1.emprunterLivre(livre3, "03/10/2025")

    user1.afficherEmprunts()
    user2.afficherEmprunts()

    if (user1.emprunts.isNotEmpty()) {
        user1.emprunts[0].retournerLivre()
    }

    bibliotheque.afficherTousLesLivres()
}