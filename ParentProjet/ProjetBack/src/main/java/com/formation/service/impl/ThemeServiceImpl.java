package com.formation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.formation.dao.IThemeDao;
import com.formation.entity.Formation;
import com.formation.entity.Theme;
import com.formation.service.IThemeService;

@Transactional
@Component
public class ThemeServiceImpl implements IThemeService{
	
	@Autowired
	IThemeDao themeDao;

	public void save(Theme entity) {
		themeDao.save(entity);
	}

	public void delete(Theme entity) {
		themeDao.delete(entity);
	}

	public Theme find(int entityID) {
		return themeDao.find(entityID);
	}

	public List<Theme> findAll() {
		return themeDao.findAll();
	}

	public Theme update(Theme entity) {
		return themeDao.update(entity);
	}

	public List<Formation> getFormationByTheme(int idTheme) {
		return themeDao.getFormationByTheme(idTheme);
	}
}
