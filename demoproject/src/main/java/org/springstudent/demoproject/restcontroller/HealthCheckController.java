package org.springstudent.demoproject.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private static final Logger log = LoggerFactory.getLogger(HealthCheckController.class);

    @GetMapping("/")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("Healthy");
    }

    @GetMapping("/log")
    private ResponseEntity<String> checkLogLevel() {
        log.trace( "TRACE" );
        log.debug( "DEBUG" );
        log.info ( "INFO"  );
        log.warn ( "WARN"  );
        log.error( "ERROR" );

        return ResponseEntity.ok("Checking Log Level");
    }

}
