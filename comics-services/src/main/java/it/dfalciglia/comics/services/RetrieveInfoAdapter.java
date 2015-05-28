package it.dfalciglia.comics.services;

import it.dfalciglia.comics.model.Comic;
import it.dfalciglia.comics.model.Series;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RetrieveInfoAdapter {

	List<Series> retrieveSeries();
	
	List<Comic> retrieveComics(Series series);
	
}
