package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // ->  private final Logger log = LoggerFactory.getLogger(getClass());
@RestController
public class LogTestController {

    // slf4j 인터페이스
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        // log.trace("trace log = " + name ); 이런식으로 로그 작성하면 안됨!!!

        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok"; // 데이터 그 자체가 반환된다.
    }
}
