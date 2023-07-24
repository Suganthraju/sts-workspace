package com.example.dbc.controller;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.dbc.model.StreetCafe;
import com.example.dbc.repository.QueryRepo;
import com.example.dbc.repository.StreetCaferepo;
import com.example.dbc.service.StreetCafeserv;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StreetCafecont {	
	@Autowired
	public StreetCafeserv cserv;
    @Autowired
    StreetCaferepo rep;
    @Autowired
    QueryRepo qr;
	
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
		@Tag(name="Getting",description ="alldetails")
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
		
		@Tag(name = "Updating",description = "Details")
		@PutMapping("update/{id}")
	    public ResponseEntity<StreetCafe> update(@PathVariable int id, @RequestBody StreetCafe StreetCafe) {
	        StreetCafe.setId(id);
	        StreetCafe updated = cserv.update(StreetCafe);
	        return ResponseEntity.ok(updated);
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
		@Tag(name="jpqlquery",description ="positionparamater")
		@GetMapping("/query")
	    public List<StreetCafe>fetchqueryStreetCafe(@RequestParam String name,@RequestParam String varient )
	    {
	    	return qr.querycafe(name,varient);
	    }
		
		@Tag(name="jpqlQuery",description ="namedparameter")
		@GetMapping("/query2")
	    public List<StreetCafe>fetchquerycafe(@RequestParam String name)
	    {
	    	return qr. getcafeByname(name);
	    }
		
		@Tag(name="NativeQuery",description ="Get Id")
		@GetMapping("/getall/{id}")
		public List<StreetCafe> getData(@PathVariable("id")int id)
		{
			return qr.getDataId(id);
		}
		@Tag(name="deletequery",description="By Id")
		   @DeleteMapping("/Query3/{id}")
		   public String deleteById(@PathVariable int id)
		   {
			   qr.deleteById(id);
			   return "deleted";
		   }
}
