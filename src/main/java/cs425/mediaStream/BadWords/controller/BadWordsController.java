package cs425.mediaStream.BadWords.controller;

import java.util.Arrays;
import java.util.Objects;

import cs425.mediaStream.BadWords.service.BadWordsService;
import cs425.mediaStream.BadWords.service.dto.ContentCheckRequest;
import cs425.mediaStream.BadWords.service.dto.ContentCheckResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("content")
public class BadWordsController {
	
	@Autowired
	private BadWordsService badWordsService;


	@PostMapping("/check")
	@ResponseBody
	public ContentCheckResponse validateContent(@RequestBody ContentCheckRequest contentRequest) {


		return  badWordsService.checkContent(contentRequest.getContent());
	}



}
