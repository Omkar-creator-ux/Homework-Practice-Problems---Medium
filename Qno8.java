public class Qno8 {

   
    static class Contact {
        String name;
        String phoneNumber;
        String emailAddress;

        
        public Contact(String name, String phoneNumber, String emailAddress) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailAddress = emailAddress;
        }
    }

    public static void main(String[] args) {
       
        Contact contact1 = new Contact("Omkar", "1234567890", "omkar@gmail.com");
        Contact contact2 = new Contact("Ayush", "876543210", "Ayush@example.com");
        Contact contact3 = new Contact("Pritam", "55555555", "Pritam@gmail");

       
        if (!contact1.emailAddress.isEmpty()) {
            System.out.println("Name: " + contact1.name);
            System.out.println("Phone: " + contact1.phoneNumber);
            System.out.println("Email: " + contact1.emailAddress);
            System.out.println();
        }

        if (!contact2.emailAddress.isEmpty()) {
            System.out.println("Name: " + contact2.name);
            System.out.println("Phone: " + contact2.phoneNumber);
            System.out.println("Email: " + contact2.emailAddress);
            System.out.println();
        }

        if (!contact3.emailAddress.isEmpty()) {
            System.out.println("Name: " + contact3.name);
            System.out.println("Phone: " + contact3.phoneNumber);
            System.out.println("Email: " + contact3.emailAddress);
            System.out.println();
        }
    }
}

