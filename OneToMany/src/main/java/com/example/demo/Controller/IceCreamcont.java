package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.IceCream;
import com.example.demo.Repository.AdditionalRepo;
import com.example.demo.Repository.IceCreamRepo;
import com.example.demo.Repository.QueryRepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class IceCreamcont {
	@Autowired
	public IceCreamRepo ic;
	@Autowired
	public  AdditionalRepo ir;
	@Autowired
	public QueryRepo qr;
	
	//posting the details
	@Tag(name="Posting",description ="details")
	@PostMapping("/project")
	public IceCream addDetails(@RequestBody IceCream hii)
	{
		return ic.save(hii);
	}
	
	//Deleting the details
	@Tag(name="Delete",description ="details")
		@DeleteMapping("/project/{hii}")
		public String deletedetails(@PathVariable("hii")int hii)
		{
			ic.deleteById(hii);
			return "Deletion was successful";
		}
	
	//getting details
	@Tag(name="Getting",description ="details")
		@GetMapping("/ice")
		public List<IceCream>getAllDetails()
		{
			return ic.findAll();
		}
	
	//update the values
	@Tag(name="Updating",description ="details")
		@PutMapping("/update")
		public IceCream update(@RequestBody IceCream ii)
		{
			return ic.saveAndFlush(ii);
		}
	
	@Tag(name="jpqlQuery",description ="Getting")
	@GetMapping("/query")
    public List<IceCream>fetchqueryIcecream(@RequestParam String name,@RequestParam String flavour )
    {
    	return qr.queryicecream(name,flavour);
    }
	
	@Tag(name="jpqlQuery",description ="Getting")
	@GetMapping("/query2")
    public List<IceCream>fetchqueryIcecream2(@RequestParam String flavour )
    {
    	return qr. getIceByFlavour(flavour);
    }
	
	@Tag(name="NativeQuery",description ="Getting")
	@GetMapping("/getall/{id}")
	public List<IceCream> getData(@PathVariable("id")int id)
	{
		return qr.getDataId(id);
	}
}
