package com.zycus.dao.interfaces;

import com.zycus.entity.CarPart;

import java.sql.SQLException;
import java.util.List;
public interface CarPartDao {
	public void addNewPart(CarPart carPart) throws SQLException;
	public List<CarPart> getCarParts();
}
