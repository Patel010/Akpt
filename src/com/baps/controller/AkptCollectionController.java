package com.baps.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.baps.model.AkptBook;
import com.baps.service.AkptService;

@Controller
public class AkptCollectionController {
	
	@Autowired
	AkptService akptservice ;
	
	@RequestMapping (value="/addbookC", method=RequestMethod.GET)
	public String addbook (ModelMap m) {
		
		AkptBook akptbook = new AkptBook ();
		m.addAttribute("addbookCMD", akptbook);
		return "add-book-collection";
	    }
	
	@RequestMapping (value="/savebookC", method=RequestMethod.POST)
	@ResponseBody
	public ModelAndView addbookPost (@Valid @ModelAttribute("addbookCMD")AkptBook akptbook, BindingResult result){
		if (result.hasErrors()){
			
			return new ModelAndView ("add-book-collection");
		}else {
		
		akptservice.saveCollection(akptbook);
		ModelAndView mav = new ModelAndView ("book-added-sucessfully-collection");
		mav.addObject("book", akptbook);
		return mav;
		}
	   }
	
	@RequestMapping (value="/showallbooks", method=RequestMethod.GET)
	@ResponseBody
	public String showAllBooks (){
				
		List<AkptBook> akptbookSetArray = akptservice.showAllBooks();
		ModelAndView mav = new ModelAndView ("show-all-books");
		mav.addObject("akptbooksetarray", akptbookSetArray);
		return null;
	}

	@RequestMapping (value="/findbyprise", method=RequestMethod.GET)
	public ModelAndView findByPrizeGET (){
		
		return new ModelAndView ("find-book-by-prize");
	}
	
	@RequestMapping (value="/findbyprisePOST", method=RequestMethod.POST)
	public ModelAndView findByPrize (@RequestParam("min")long min, @RequestParam("max") long max){
		

		List<AkptBook> akptbookSetArray = akptservice.findByPrise(min, max);
		ModelAndView mav = new ModelAndView ("show-all-books");
		mav.addObject("akptbooksetarray", akptbookSetArray);
		return mav;
	}
	
	
	@RequestMapping (value="/selectToDelete", method=RequestMethod.GET)
	public ModelAndView selectToDelete (){
		List <AkptBook> allBooks = akptservice.showAllBooks();
		return new ModelAndView ("delete-book", "allBooks", allBooks);
	}
	
	@RequestMapping (value="/delete", method=RequestMethod.POST)
	public ModelAndView delete (@RequestParam("id") int id){
		AkptBook bookToBeDeleted = akptservice.findBook(id);
		akptservice.delete(id);
		return new ModelAndView ("book-deleted", "bookName", bookToBeDeleted.getBookName());
	}
	
	@RequestMapping (value="/demo", method=RequestMethod.GET, headers="application/json")
	@ResponseBody
	public Map<String, String> jsonDemo (){
				
		
		String xyz = "xyz";
		String abc = "abc";
		Map <String, String> demo = new HashMap <String, String>();
		demo.put(xyz, abc);
		return demo;
	}

	
	


}
