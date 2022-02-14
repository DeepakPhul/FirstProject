package com.tenniscourts.schedules;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;
  
    private final ScheduleMapper scheduleMapper;

    @Autowired
    public ScheduleService(ScheduleRepository scheduleRepository,ScheduleMapper scheduleMapper){
        this.scheduleRepository=scheduleRepository;
        this.scheduleMapper=scheduleMapper;
    }

    public ScheduleDTO addSchedule(Long tennisCourtId, CreateScheduleRequestDTO createScheduleRequestDTO) {
        //TODO: implement addSchedule
        return null;
    }

    public List<ScheduleDTO> findSchedulesByDates(LocalDateTime startDate, LocalDateTime endDate) {
        //TODO: implement
        List<ScheduleDTO> allList = scheduleMapper.map(scheduleRepository.findAll());
        List<ScheduleDTO> result = new ArrayList<ScheduleDTO>();
        for (ScheduleDTO scheduleDTO : allList) {
            if(scheduleDTO.getEndDateTime().isBefore(endDate) && scheduleDTO.getStartDateTime().isAfter(startDate))
            result.add(scheduleDTO);
        }
        return result;
    }

    public ScheduleDTO findSchedule(Long scheduleId) {
        //TODO: implement
        return scheduleMapper.map(scheduleRepository.findById(scheduleId).get());
    }

    public List<ScheduleDTO> findSchedulesByTennisCourtId(Long tennisCourtId) {
        return scheduleMapper.map(scheduleRepository.findByTennisCourt_IdOrderByStartDateTime(tennisCourtId));
    }
}
