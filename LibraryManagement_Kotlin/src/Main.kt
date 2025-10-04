fun main() {
    val livre1 = Livre("Le Petit Prince", "Antoine de Saint-Exupéry", "978-3-16-148410-0", 3)
    val livre2 = Livre("1984", "George Orwell", "978-0-452-28423-4", 2)
    val livre3 = Livre("Harry Potter", "J.K. Rowling", "978-0-7475-3269-9", 1)

    val user1 = Utilisateur("Dupont", "Marie", "marie.dupont@email.com", 101)
    val user2 = Utilisateur("Martin", "Luc", "luc.martin@email.com", 102)

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