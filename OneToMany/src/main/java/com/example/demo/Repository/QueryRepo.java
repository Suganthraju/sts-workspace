package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.IceCream;
@Repository
public interface QueryRepo extends JpaRepository<IceCream, Integer> {

	@Query("select s from IceCream s where s.name=?1 and s.flavour=?2")
	List<IceCream> queryicecream(String name, String flavour);
	
	   //named parameters
		@Query("select s from IceCream s where s.flavour=:flavour")
		public List<IceCream> getIceByFlavour(String flavour);
		
		@Query(value="select * from ice_cream where sno=:id",nativeQuery = true)
		public List<IceCream> getDataId(@Param("id")int id);

		
		
	
}
