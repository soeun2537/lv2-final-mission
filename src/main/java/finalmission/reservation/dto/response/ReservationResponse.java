package finalmission.reservation.dto.response;

import finalmission.reservation.entity.Reservation;
import java.time.LocalDate;
import java.time.LocalTime;

public record ReservationResponse(
        Long id,
        Long memberId,
        Long roomId,
        LocalDate date,
        LocalTime startTime,
        LocalTime endTime,
        String purpose
) {
    public static ReservationResponse from(Reservation reservation) {
        return new ReservationResponse(
                reservation.getId(),
                reservation.getMember().getId(),
                reservation.getRoom().getId(),
                reservation.getDate(),
                reservation.getStartTime(),
                reservation.getEndTime(),
                reservation.getPurpose()
        );
    }
}
