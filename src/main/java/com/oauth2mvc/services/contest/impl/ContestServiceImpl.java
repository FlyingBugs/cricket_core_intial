package com.oauth2mvc.services.contest.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oauth2mvc.dao.contestdao.ContestDao;
import com.oauth2mvc.dto.ContestClientDto;
import com.oauth2mvc.dto.ContestClientExposedObjectDto;
import com.oauth2mvc.model.Contest;
import com.oauth2mvc.services.contest.ContestService;

/**
 * 
 * @author Prashant
 *
 */
@Service
public class ContestServiceImpl implements ContestService{
	
	static final Logger LOGGER = Logger.getLogger(ContestServiceImpl.class);
	
	@Autowired
	ContestDao contestDao;

	@Override
	public ContestClientExposedObjectDto getAllContestForAMatch(Long userId, Long matchId) throws Exception {
		
		List<Object[]> contestListTemp = null;
		List<ContestClientDto> contestListClient = null;
		ContestClientExposedObjectDto finalDataObject = null;
		
		
		try{
			contestListTemp = contestDao.getAllContestForAMatch(matchId);
			contestListClient = convertIntoContestClientDtoList(contestListTemp);
			
		}catch(Exception e){
			LOGGER.error("Found error inside contestDao.getAllContestForAMatch : ",e);
		}
		
		if(contestListClient == null ){
			return null;
		}
		
		finalDataObject = new ContestClientExposedObjectDto();
		finalDataObject.setMatchId(2l);
		finalDataObject.setListOfContest(contestListClient);
		finalDataObject.setFirstContestant("MI");
		finalDataObject.setSecondContestant("DD");
		
		Date dt = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE, 1);
		dt = c.getTime();
		
		finalDataObject.setMatchCloseTime(dt);
		
		return finalDataObject;
	}

	
	/**
	 * @author Prashant
	 * @param contestListTemp
	 * @return
	 */
	private List<ContestClientDto> convertIntoContestClientDtoList(List<Object[]> contestListTemp) {
		
		List<ContestClientDto> result = null;
		
		if(contestListTemp == null || contestListTemp.size() <=0){
			return null;
		}
		
		result = new ArrayList<ContestClientDto>();
		
		for(Object[] temp : contestListTemp){
			
			ContestClientDto contestClientDto = createContestClientDtoObject(temp);
			result.add(contestClientDto);
			
		}
		
		return result;
	}

	
	/**
	 * @author Prashant
	 * @param input
	 * @return
	 * 
	 * This function convert the Obect array to ContestClientDto Object
	 * by calling the setter indexwise.
	 * 
	 */
	private ContestClientDto createContestClientDtoObject(Object[] input) {
		
		ContestClientDto contestClientDto = new ContestClientDto();
		
		contestClientDto.setId((Long) input[0] );
		contestClientDto.setName((String) input[1]);
		contestClientDto.setTotalWinningAmount((BigDecimal) input[2]);
		// contestClientDto.setTotalNoOfCurrentParticipents((Integer) input[3]);
		contestClientDto.setTotalNoOfCurrentParticipents( (Long) input[3] );
		contestClientDto.setMaxContestent((Integer) input[4]);
		contestClientDto.setMaxWinnerCount((Integer) input[5]);
		contestClientDto.setContestType((Short) input[6]);
		contestClientDto.setEntryFees((BigDecimal) input[7]);
		
		
		
		return contestClientDto;
	}
	
}
