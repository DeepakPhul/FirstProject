package com.tenniscourts.tenniscourts;

import com.tenniscourts.schedules.ScheduleDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TennisCourtDTO {

    private Long id;

    @NotNull
    private String name;

    private List<ScheduleDTO> tennisCourtSchedules;

    public void setTennisCourtSchedules(List<ScheduleDTO> findSchedulesByTennisCourtId) {
        this.tennisCourtSchedules=findSchedulesByTennisCourtId;
    }
    public List<ScheduleDTO> getTennisCourtSchedules(){
        return this.tennisCourtSchedules;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

}
