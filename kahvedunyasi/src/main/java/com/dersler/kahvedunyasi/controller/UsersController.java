package com.dersler.kahvedunyasi.controller;

import com.dersler.kahvedunyasi.mernis.JAAKPSPublicSoap;
import com.dersler.kahvedunyasi.model.User;
import com.dersler.kahvedunyasi.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UsersController {

    private final UserRepository userRepository;

    public UsersController(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) throws Exception {
        JAAKPSPublicSoap client = new JAAKPSPublicSoap();
        boolean isRealPerson = client.TCKimlikNoDogrula( Long.valueOf( user.getIdentityNumber() ), user.getFirstName(), user.getLastName(), user.getBirthOfDateYear() );
        if(isRealPerson){
            userRepository.save(user);
            return ResponseEntity.ok("Hesabınız başarılı bir şekilde oluşturuldu");
        }
        return ResponseEntity.badRequest().body("Girilen bilgiler yanlıştır.");
    }
}
