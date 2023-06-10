package com.prueba.apps.mooc.controller.health_check;

import com.prueba.apps.mooc.controller.RequestTestCase;
import org.junit.jupiter.api.Test;

final class HealthCheckGetControllerShould extends RequestTestCase {
    @Test
    void check_the_app_is_working_ok() throws Exception {
        assertResponse("/health-check", 200, "{'status':'ok'}");
    }
}