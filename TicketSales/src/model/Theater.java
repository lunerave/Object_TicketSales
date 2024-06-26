package model;

/**
 * 극장 도메인 오브젝트 클래스
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관람객 극장 입장
     * @param audience 관람객 정보
     */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
