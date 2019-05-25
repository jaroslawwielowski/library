package com.library.app.services;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Id;

import com.sun.mail.handlers.image_gif;

public interface BaseService<D, I extends Serializable> {
	
	D save (D dto);
	
	D update (D dto);
	
	D find (I id);
	
	Boolean remove(I id);
	
	Collection<D> getAll();

}
