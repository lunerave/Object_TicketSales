import model.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        ticket1.setFee(70L);
        ticket2.setFee(200L);
        ticket3.setFee(100L);

        System.out.println("ticket1 = " + ticket1.getFee());
        System.out.println("ticket2 = " + ticket2.getFee());
        System.out.println("ticket3 = " + ticket3.getFee());

        TicketOffice ticketOffice = new TicketOffice(0L, ticket1, ticket2, ticket3);
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Bag dontHaveInvitationBag = new Bag(100L);
        Audience dontHaveInvitationAudience = new Audience(dontHaveInvitationBag);
        theater.enter(dontHaveInvitationAudience);
        System.out.println("ticketOffice sales= " + ticketOffice.getAmount());

        Bag hasInvitationBag = new Bag(new Invitation(), 100L);
        Audience hasInvitationAudience = new Audience(hasInvitationBag);
        theater.enter(hasInvitationAudience);
        System.out.println("ticketOffice sales= " + ticketOffice.getAmount());

        Bag dontHaveInvitationBag2 = new Bag(100L);
        Audience dontHaveInvitationAudience2 = new Audience(dontHaveInvitationBag2);
        theater.enter(dontHaveInvitationAudience2);
        System.out.println("ticketOffice sales= " + ticketOffice.getAmount());
    }
}