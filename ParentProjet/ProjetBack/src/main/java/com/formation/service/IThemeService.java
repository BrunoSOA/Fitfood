package com.formation.service;

import java.util.List;

import com.formation.entity.Formation;
import com.formation.entity.Theme;

public interface IThemeService {
	
	public void save(Theme entity);

	public void delete(Theme entity);

	public Theme find(int entityID);

	public List<Theme> findAll();

	public Theme update(Theme entity);
	
	public List<Formation> getFormationByTheme(int idTheme);

}
