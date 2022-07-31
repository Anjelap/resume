package com.example.resume.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.example.resume.entity.Resume;
import com.example.resume.Repo.ResumeRepo;
@Controller
public class ResumeController {
    
    @Autowired
	private ResumeRepo eRepo;
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllresume() {
		ModelAndView mav = new ModelAndView("displayresume");
		mav.addObject("resumes", eRepo.findAll());
		return mav;
	}
	
	
	
	@PostMapping("/saveResume")
	public String saveResume(@ModelAttribute Resume resume) {
		eRepo.save(resume);
		return "redirect:/list";
	}
	
	@GetMapping("/showResume")
	public ModelAndView showResume(@RequestParam Long Id) {
		ModelAndView mav = new ModelAndView("addresume");
		Resume resume = eRepo.findById(Id).get();
		mav.addObject("resume", resume);
		return mav;
	}
}
