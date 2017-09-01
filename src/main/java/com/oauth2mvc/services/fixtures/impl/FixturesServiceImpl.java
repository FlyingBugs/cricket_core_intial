package com.oauth2mvc.services.fixtures.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oauth2mvc.dao.fixturesdao.FixturesDao;
import com.oauth2mvc.dto.FixturesClientDto;
import com.oauth2mvc.model.MatchSchedule;
import com.oauth2mvc.services.fixtures.FixturesService;

@Service
public class FixturesServiceImpl implements FixturesService {
	
	@Autowired
	FixturesDao fixturesDao;

	@Override
	public List<FixturesClientDto> returnAllMatchSchedule() throws Exception {
		
		List<FixturesClientDto> matchCientList = null;
		
		// Need to check weather cache hold the result or not, if yes then fetch and return else
		// process rest of the code.
		
		List<MatchSchedule> matchList = fixturesDao.returnAllMatchSchedule();
		
		if(matchList != null && !matchList.isEmpty()){
			
			matchCientList = new ArrayList<FixturesClientDto>();
			FixturesClientDto midwayMatchListObject = null;
			
			for(MatchSchedule matchScheduleTemp : matchList){
				midwayMatchListObject = generateMatchListObject(matchScheduleTemp);
				matchCientList.add(midwayMatchListObject);
			}
			
			// Need to update the cache if results are not in cache, This should happen only once.
			
		}else{
			System.out.println("");
		}
		
		
		return matchCientList;
	}

	/**
	 * 
	 * @param matchScheduleTemp
	 * @return
	 */
	private FixturesClientDto generateMatchListObject(MatchSchedule matchScheduleTemp) {
		
		FixturesClientDto fixturesClientDto = new FixturesClientDto();
		
		BeanUtils.copyProperties(fixturesClientDto, matchScheduleTemp);
		
		// setting the hardcoad values as of now.
		fixturesClientDto.setTeam1("SRH");
		fixturesClientDto.setTeam2("MI");
		fixturesClientDto.setUserActiveForMatch(true);
		fixturesClientDto.setTeam1Image("https://upload.wikimedia.org/wikipedia/en/thumb/8/81/Sunrisers_Hyderabad.svg/1280px-Sunrisers_Hyderabad.svg.png");
		fixturesClientDto.setTeam2Image("https://upload.wikimedia.org/wikipedia/en/thumb/8/81/Sunrisers_Hyderabad.svg/1280px-Sunrisers_Hyderabad.svg.png");

		
		return fixturesClientDto;
	}

}
