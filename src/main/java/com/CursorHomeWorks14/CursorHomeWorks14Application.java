package com.CursorHomeWorks14;

import lombok.RequiredArgsConstructor;
import com.CursorHomeWorks14.model.AppUser;
import com.CursorHomeWorks14.model.AppUserRole;
import com.CursorHomeWorks14.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication
@RequiredArgsConstructor
public class CursorHomeWorks14Application implements CommandLineRunner {

    final UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(CursorHomeWorks14Application.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public void run(String... params) throws Exception {
        AppUser admin = new AppUser();
        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setEmail("admin@mmmail.som");
        admin.setAppUserRoles(new ArrayList<>(Collections.singletonList(AppUserRole.ROLE_ADMIN)));
        userService.signup(admin);

        AppUser user01 = new AppUser();
        user01.setUsername("user01");
        user01.setPassword("user01");
        user01.setEmail("user01@mmmail.som");
        user01.setAppUserRoles(new ArrayList<>(Collections.singletonList(AppUserRole.ROLE_CLIENT)));
        userService.signup(user01);

        AppUser user02 = new AppUser();
        user02.setUsername("user02");
        user02.setPassword("user02");
        user02.setEmail("user02@mmmail.som");
        user02.setAppUserRoles(new ArrayList<>(Collections.singletonList(AppUserRole.ROLE_CLIENT)));
        userService.signup(user02);
    }
}
