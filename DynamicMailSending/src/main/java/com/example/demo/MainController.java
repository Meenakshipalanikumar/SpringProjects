package com.example.demo;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.repositoryimplementation.RepositoryService;
import com.example.demo.repository.RegisterRepository;

@Controller
@RequestMapping("/main")
public class MainController {
	@Autowired
	RegisterRepository rs;
	@Autowired
	private JavaMailSender javaMailSender;

	RegData rd = new RegData();
	ModelAndView mv = new ModelAndView();

	@RequestMapping("/")
	public String indexing() {
		return "index";
	}

	@RequestMapping("/regAction")
	public String regAction(@ModelAttribute("regform") RegData rd, HttpSession sess) {
		System.out.println("helllooo");
		rs.save(rd);
		String a = rd.getUemail();
		String ab = rd.getUname();
		System.out.println(a);

		sess.setAttribute("usermail", a);
		sess.setAttribute("username", ab);
		return "home";
	}

	@RequestMapping("/mail")
	public String mailAction(HttpSession sess) {
		SimpleMailMessage message = new SimpleMailMessage();
		String str = (String) sess.getAttribute("usermail");
		String str1 = (String) sess.getAttribute("username");
		message.setTo(str);
		message.setSubject("Hello " + str1);
		message.setText("Thank you register with us");
		javaMailSender.send(message);
		return "home";
	}

	@RequestMapping("/mailwithfile")
	public String mailWithFile(HttpSession sess) throws MessagingException {
		MimeMessage m = javaMailSender.createMimeMessage();
		MimeMessageHelper mmh = new MimeMessageHelper(m, true);
		String str = (String) sess.getAttribute("usermail");
		String str1 = (String) sess.getAttribute("username");
		mmh.setTo(str);
		mmh.setSubject("Hello " + str1);
		mmh.setText("Thanks for register with us");
		FileSystemResource file = new FileSystemResource(new File("C:/Users/office/Pictures/mott.jpg"));
		mmh.addAttachment("image", file);
		javaMailSender.send(m);
		return "home";
	}
}
