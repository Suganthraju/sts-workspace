package com.example.dbc.controller;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbc.model.StreetCafe;
import com.example.dbc.service.StreetCafeserv;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class StreetCafecont {	
	@Autowired
	public StreetCafeserv cserv;

	
	//posting the details
		@Tag(name="Posting",description ="details")
		@PostMapping("/project")
		public StreetCafe addDetails(@RequestBody StreetCafe hii)
		{
			return cserv.saveInfo(hii);
		}
		
		//Deleting the details
		@Tag(name="Delete",description ="details")
		@DeleteMapping("/del/{hii}")
		public String deletedetails(@PathVariable("hii")int hii)
		{
			cserv.deletedetails(hii);
			return "Deletion was successful";
		}
		
		//getting all details
		@Tag(name="Getting",description ="details")
		@GetMapping("/getall")
		public List<StreetCafe> getall()
		{
			return cserv.getall();
		}
		
		//getting the particular details
		@Tag(name="Getting particular",description ="details")
		@GetMapping("/get/{hii}")
		public Optional<StreetCafe> getdetails(@PathVariable("hii")int hii)
		{
			return cserv.getdetails(hii);
		}
		
		//updating the given details
		@Tag(name="updating",description ="details")
		@PutMapping("/update")
		public StreetCafe updatedetails(@RequestBody StreetCafe hii)
		{
			return cserv.updatedetails(hii);
		}
		
		//sorting
		@Tag(name="sorting",description ="details")
		@GetMapping("/sort/{name}")
		public List<StreetCafe> sorting(@PathVariable("name")String name)
		{
			 return cserv.sorting(name);
		}
		
		//pagination
		@Tag(name="pagination",description ="details")
		@GetMapping("/page/{pnum}/{psize}")
		public List<StreetCafe> page(@PathVariable("pnum")int num,@PathVariable("psize")int size)
		{
			return cserv.page(num,size);
		}
		
		//pagination sorting
		@Tag(name="paginationsorting",description ="details")
		@GetMapping("/pagesort/{pnum}/{psize}/{name}")
		public List<StreetCafe> paginationsorting(@PathVariable("pnum")int pnum,@PathVariable("psize")int psize,@PathVariable("name")String name)
		{
			return cserv.paginationsorting(pnum,psize,name);
		}
}
