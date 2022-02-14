package com.tenniscourts.reservations;

import com.tenniscourts.config.persistence.BaseEntity;
import com.tenniscourts.guests.Guest;
import com.tenniscourts.schedules.Schedule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
public class Reservation extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Guest guest;

    @ManyToOne
    @NotNull
    private Schedule schedule;

    @NotNull
    private BigDecimal value;

    @NotNull
    private ReservationStatus reservationStatus = ReservationStatus.READY_TO_PLAY;

    private BigDecimal refundValue;

    public void setReservationStatus(ReservationStatus status) {
        this.reservationStatus=status;
    }

    public void setRefundValue(BigDecimal refundValue2) {
        this.refundValue=refundValue2;
    }

    public BigDecimal getRefundValue(){
        return this.refundValue;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public void setValue(BigDecimal newValue) {
        this.value=newValue;
    }

    public ReservationStatus getReservationStatus() {
        return this.reservationStatus;
    }

    public Schedule getSchedule() {
        return this.schedule;
    }

    public Guest getGuest() {
        return this.guest;
    }

    public void setSchedule(Schedule schedule2) {
        this.schedule=schedule2;
    }
}
