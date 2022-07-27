package com.keycloak.springsecurity.oidc;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class HomeController {

//    @GetMapping("/")
//    public String homeView(Model model, Principal principal) {
//        model.addAttribute("sub", principal.getName());
//        return "home";
//    }
    
    @GetMapping("/")
    public String homeView(Model model, @AuthenticationPrincipal OidcUser oidcUser) {
        model.addAttribute("sub", oidcUser.getEmail());
        return "home";
    }
    
    @GetMapping("/home")
    @ResponseBody
    public String home() {
       
        return "home";
    }
    
    @GetMapping("/oauth2/loginsuccess")
    @ResponseBody
	public String indexPage(@AuthenticationPrincipal OidcUser oidcUser) {
		return oidcUser.getEmail();
		
		
//		DumaPrincipal userDetails = (DumaPrincipal) userDetailsService.loadUserByUsername(oidcUser.getEmail());
//		
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//
//		List<GrantedAuthority> updatedAuthorities = new ArrayList<>(auth.getAuthorities());
//		
//		userDetails.getAuthorities().forEach(authority->updatedAuthorities.add(new SimpleGrantedAuthority(authority.getAuthority())));
//	
//		UsernamePasswordAuthenticationToken newAuth = new UsernamePasswordAuthenticationToken(auth.getPrincipal(), auth.getCredentials(), updatedAuthorities);
//		
//		newAuth.setDetails(userDetails.getUser());
//		
//		SecurityContextHolder.getContext().setAuthentication(newAuth);
//		
//		return new  RedirectView("/index.html");
	}

}
