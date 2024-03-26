package telran.java51.pulse.service;

import java.util.function.Consumer;

import javax.xml.crypto.Data;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java51.pulse.dto.PulseDto;

@Configuration
public class PulseService {

	@Bean
	Consumer <PulseDto> receivePulse() {
		
		return data -> {
			
			long delay = System.currentTimeMillis() - data.getTimeStamp();
			System.out.println("delay: "+delay+", id: "+data.getId()+", pulse: "+data.getPayload());
	
		
		};
	}
}
