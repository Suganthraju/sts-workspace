package com.example.dbc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dbc.model.StreetCafe;

@Repository
public interface QueryRepo extends JpaRepository<StreetCafe, Integer> {
	
	//position parameter
	@Query("select s from StreetCafe s where s.name=?1 and s.varient=?2")
	 public List<StreetCafe> querycafe(String name, String varient);
	
	   //named parameters
		@Query("select s from StreetCafe s where s.name=:name")
		 public List<StreetCafe> getcafeByname(String name);
		
		@Query(value="select * from street_cafe where id=:id",nativeQuery = true)
		public List<StreetCafe> getDataId(@Param("id")int id);
		
		@Query("delete StreetCafe cafe where cafe.id=?1")
		public void deleteById(@Param("id") int id);



		
	

}
