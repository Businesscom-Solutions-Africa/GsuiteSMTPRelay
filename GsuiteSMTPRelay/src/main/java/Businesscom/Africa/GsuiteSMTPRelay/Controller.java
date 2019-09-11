package Businesscom.Africa.GsuiteSMTPRelay;

import java.net.URI;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nimbusds.oauth2.sdk.http.HTTPRequest;


@RestController
public class Controller {

	
	@RequestMapping("test")
	public ResponseEntity controllervalues(Principal principal) {
		
		List<String> datas=new ArrayList<>();
		
		System.out.println("ON LOGIN=============="+principal);
		
		HttpHeaders headers = new HttpHeaders();
		  headers.setLocation(URI.create("http://localhost:3000/"+principal.getName()));
		  return new ResponseEntity<>(headers, HttpStatus.MOVED_PERMANENTLY);
	}
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/testing")
	public ResponseEntity<?> checkuserAuthenticated(HttpHeaders request) {
		System.out.println("User=============="+request.getAcceptCharset());
		
		List<Student> list=new ArrayList<Student>();
		
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/testpost")
	public ResponseEntity<?> login(HttpHeaders request) {
		System.out.println("User=============="+request.getAcceptCharset());
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student("Toroitic","ALIANCE","4"));
		list.add(new Student("Wagwan","GOOD","6"));
		list.add(new Student("Cherutich","TEST","7"));
		list.add(new Student("Edwin","SD","9"));
		list.add(new Student("Korir","DGS","8"));
		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}
	
	
	
	
	
}
