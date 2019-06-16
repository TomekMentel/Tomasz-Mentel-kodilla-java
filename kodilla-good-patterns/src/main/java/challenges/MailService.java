package challenges;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Panie/Pani " + user.getName() + " Zamowienie zrealizowane ");
    }
}
