package com.icia.board;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model/*=request*/) {
		logger.info("콘솔 창에 기록 출력용");
		System.out.println("그냥 콘솔창");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute/*=setAttribute*/("serverTime", formattedDate );
		return "home"/*(="home.jsp")dispatcher forwarding방식*/;
	}
}