package kr.co.patternbot.auth.controllers;

import kr.co.patternbot.auth.services.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService service;
}
