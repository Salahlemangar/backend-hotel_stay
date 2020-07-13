package org.sid;


import org.sid.dao.HotelRepository;
import org.sid.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelApplication implements CommandLineRunner {
    
	@Autowired
	HotelRepository hotelRepository;
	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		hotelRepository.save(new Hotel(null,"Bahia Golf Beach","Le Bahia Golf Beach vous propose une piscine extérieure, un restaurant ainsi qu'un hébergement indépendant avec connexion Wi-Fi gratuite",
				"Bouznika","hotel1.jpg",null,33.790466, -7.232963,600.0,4.5));
		hotelRepository.save(new Hotel(null,"Vichy Celestins Spa","Le Vichy Célestins Spa Hôtel Casablanca met à votre disposition un institut de beauté luxueux proposant une gamme de soins Vichy. ",
				"Bouznika","hotel2.jpg",null,33.790466, -7.123487,800.0,4.5));
		hotelRepository.save(new Hotel(null,"Bella Vista","Situé en front de mer à Bouznika et doté d'un balcon, l'Apartment Bella Vista bénéficie d'un jardin et d'une vue sur la piscine extérieure. ",
				"Bouznika","hotel3.jpg",null,33.790466, -7.172963,800.0,4.5));
		hotelRepository.save(new Hotel(null,"Hotel du Golf","Installé à Mohammédia, l’Hotel du Golf propose notamment un salon commun, un bar, un restaurant, une réception ouverte 24h/24 ainsi que des services d’étage et de location de voitures pour vous... ",
				"Mohammedia","hotel4.jpg",null,33.707697, -7.401061,600.0,4.1));
		hotelRepository.save(new Hotel(null,"Novotel Mohammedia","Situé à Mohammédia, le Novotel Mohammedia propose une salle de sport. L'établissement possède une terrasse et un salon commun. La réception est ouverte 24h/24. ",
				"Mohammedia","hotel5.jpg",null,33.707391, -7.395704,800.0,4.5));
		hotelRepository.save(new Hotel(null,"Ibis Mohammedia"," L'ibis Mohammedia propose des hébergements à Mohammedia et un bar sur place. Chaque chambre de cet hôtel est climatisée et dispose d'une télévision. ",
				"Mohammedia","hotel6.jpg",null,33.704575, -7.396295,800.0,3));
		hotelRepository.save(new Hotel(null,"Le Sphinx Boutique Hotel","Doté d'une piscine extérieure ouverte en saison et d'une terrasse bien exposée, le Sphinx Boutique Hôtel se situe à Mohammédia, dans la région du Grand Casablanca, à 25 km de Casablanca. ",
				"Mohammedia","hotel7.jpg",null,33.704597, -7.386640,600.0,4.5));
		hotelRepository.save(new Hotel(null,"La Perle De Mimosa","Boasting air-conditioned accommodation with a patio, La Perle De Mimosa is situated in Mohammedia. This apartment features a garden and free private parking. ",
				"Mohammedia","hotel8.jpg",null,33.723716, -7.334154,800.0,4.5));
		hotelRepository.save(new Hotel(null,"Suite Hotel Diamond","Situé à Casablanca, à 5 km de la mosquée Hassan-II, le Suite Hotel Casa Diamond propose des hébergements avec un restaurant, un parking privé gratuit et une salle de sport. ",
				"Casablanca","hotel9.jpg",null,33.586728, -7.622666,800.0,4.5));
		hotelRepository.save(new Hotel(null,"ONOMO Airport Casablanca","Situé à Casablanca, à 36 km de l'Anfa Place Living Resort, l’ONOMO Airport Casablanca propose un restaurant, un parking privé gratuit, une salle de sport et un bar. ",
				"Casablanca","hotel10.jpg",null,33.373439, -7.566494,600.0,4.5));
		hotelRepository.save(new Hotel(null,"Campanile Casablanca","Offrant une vue sur la ville, le Campanile Casablanca Centre Ville propose des hébergements à Casablanca, à 4 km de la mosquée Hassan-II. ",
				"Casablanca","hotel11.jpg",null,33.594305, -7.599760,800.0,4.5));
		hotelRepository.save(new Hotel(null,"Odyssee Center Hotel"," Situé à Casablanca, à 3,4 km de la mosquée Hassan II, l'Odyssee Center Hotel possède des hébergements avec un restaurant, un parking privé gratuit, un bar et un salon ",
				"Casablanca","hotel12.jpg",null,33.596977, -7.613769,800.0,4.5));
	}

}
