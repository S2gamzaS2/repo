package org.scoula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //JavaBean으로 등록됨 ≒ @Component
@Slf4j // 멤버 필드가 자동으로 생성됨 (log)
public class HomeController {

    @GetMapping("/") //  getMap.put("/", 메서드)
    public String home() {
        log.info("====================> HomeController /");
        return "index"; // view 이름  →  /WEB-INF/views/index.jsp
    }
}
