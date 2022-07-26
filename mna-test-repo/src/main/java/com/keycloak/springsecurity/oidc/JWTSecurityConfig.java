//package com.keycloak.springsecurity.oidc;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@SuppressWarnings("deprecation")
//@Configuration
//@PropertySource(value={"classpath:application.properties"})
//	public class JWTSecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Value("${spring.security.oauth2.resourceserver.opaquetoken.introspection-uri}")
//    String introspectionUri;
//
//    @Value("${spring.security.oauth2.resourceserver.opaquetoken.client-id}")
//    String clientId;
//
//    @Value("${spring.security.oauth2.resourceserver.opaquetoken.client-secret}")
//    String clientSecret;
//
//
//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	        http
//	          .authorizeRequests(authz -> authz
//	            .antMatchers(HttpMethod.GET, "/home/**").hasAuthority("SCOPE_read")
//	            .antMatchers(HttpMethod.POST, "/home").hasAuthority("SCOPE_write")
//	            .anyRequest().authenticated())
//	          .oauth2ResourceServer(oauth2 -> oauth2
//	                  .opaqueToken(token -> token.introspectionUri(this.introspectionUri)
//	                    .introspectionClientCredentials(this.clientId, this.clientSecret)));
//		}
//	
//
//
//}
