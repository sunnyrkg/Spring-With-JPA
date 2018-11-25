package com.zycus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.zycus.entity.CarPart;
@Component
public class CarPartRowMapper implements RowMapper<CarPart> 
{

		public CarPart mapRow(ResultSet rs, int index) throws SQLException {
			// TODO Auto-generated method stub
			CarPart carPart = new CarPart();
			carPart.setPartNo(rs.getInt(1));
			carPart.setPartName(rs.getString(3));
			carPart.setCarModel(rs.getString(2));
			carPart.setPrice(rs.getDouble(4));
			carPart.setQuantity(rs.getInt(5));
			return carPart;
			
		}
}
