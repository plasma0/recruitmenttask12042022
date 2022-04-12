package com.example.service;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;


@RestController
public class RepositoryController {
    
    RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/repositories/{owner}/{repositoryname}")
	public Repository repositories(@PathVariable("owner") String owner, @PathVariable("repositoryname") String repositoryname) {
        ResponseEntity<Repository> response = restTemplate.getForEntity("https://api.github.com/repos/" + owner + "/" + repositoryname,
                Repository.class);
        return response.getBody();
	}
}