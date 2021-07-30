import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IceController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() 
        {
	      return "index";
	   }
	@PostMapping("/success")
	public String success(User user)
	{
		System.out.println(user.getUsername());
		System.out.println(user.getEmail());
		return "rest";
	}

}
