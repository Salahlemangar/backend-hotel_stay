package org.sid.web;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;
import org.sid.dao.HotelRepository;
import org.sid.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HotelRestController {
 
	@Autowired
	HotelRepository hotelRepository;
	
	
	@GetMapping(path="/imageHotel/{id}",produces = MediaType.IMAGE_JPEG_VALUE)
	public byte[] image(@PathVariable(name = "id")Long id) throws Exception{
		Hotel hotel =hotelRepository.findById(id).get();
		String image = hotel.getImage();
		File file = new File(System.getProperty("user.home")+"/HotelPictures/"+image);
		Path path = Paths.get(file.toURI());
		return Files.readAllBytes(path);
	}
	
	@GetMapping("/getHotels")
	public List<Hotel> getHotels(){
		List<Hotel> hotels= hotelRepository.findAll();
          return hotels;	
	}

	@GetMapping(path = "/findHotel")
	public List<Hotel> list(@RequestParam(name = "keyword", defaultValue = "") String motCle) {
		List<Hotel> hotels = hotelRepository.findByNameContains("%"+motCle+"%");
		return hotels;
	}
	@PostMapping("/addHotel")
	@Transactional
	public String addHotel(@RequestBody Hotel hotel){
		hotelRepository.save(hotel);
		return "added Succefully";
		
	}
}
