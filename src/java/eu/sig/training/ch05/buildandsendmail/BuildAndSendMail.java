package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    public void buildAndSendMail(MailMan mailer, MailRecepientIdentifier recepient, MailMessage message) {
        // Send message
        mailer.send(recepient, message);
    }

    private class MailMan {
        public void send(String mId, MailMessage mMessage) {}
    }

    private class MailRecepientIdentifier {
        String firstName;
        String lastName;
        String division;

        public MailRecepientIdentifier(String firstName, String lastName, String division) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.division = division;
        }

        // Format the email address
        public String toString() {
            return firstName.charAt(0) + "." + lastName.substring(0, 7) + "@" + division.substring(0, 5) + ".compa.ny";
        }
    }

    private class MailFont {}

    private class MailMessage {
        String subject;
        String[] message;
        MailFont font;

        public MailMessage(String subject, String[] message, MailFont font) {
            this.subject = subject;
            this.message = message;
            this.font = font;
        }

        public String getSubject() {
            return subject;
        }

        public String getMessage() {
            return String.join("", message);
        }
    }
}