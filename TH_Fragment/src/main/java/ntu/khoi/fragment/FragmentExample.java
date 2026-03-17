package ntu.khoi.fragment;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FragmentExample {
	@GetMapping("/")
	public String getFragment() {
		return "example";
	}
}