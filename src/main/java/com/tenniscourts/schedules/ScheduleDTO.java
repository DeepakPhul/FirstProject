package com.tenniscourts.schedules;

import com.tenniscourts.tenniscourts.TennisCourtDTO;

import org.apache.coyote.http11.filters.VoidOutputFilter;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
public class ScheduleDTO {

    private Long id;

    private TennisCourtDTO tennisCourt;

    @NotNull
    private Long tennisCourtId;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm")
    @NotNull
    private LocalDateTime startDateTime;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm")
    private LocalDateTime endDateTime;

    public TennisCourtDTO getTennisCourt() {
        return tennisCourt;
    }
    public void setTennisCourt(TennisCourtDTO tennisCourt) {
        this.tennisCourt = tennisCourt;
    }
    public Long getTennisCourtId() {
        return tennisCourtId;
    }
    public void setTennisCourtId(Long tennisCourtId) {
        this.tennisCourtId = tennisCourtId;
    }
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Long getId() {
        return this.id;
    }
    public void setId(Long id){
        this.id=id;
    }

}
