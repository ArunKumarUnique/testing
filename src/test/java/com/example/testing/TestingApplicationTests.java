package com.example.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.web.context.ConfigurableWebEnvironment;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TestingApplicationTests {

	@LocalServerPort
	private int port;

	@BeforeAll
	public static void init() {

	}

	@BeforeEach
    public void execute() {

	}

}
