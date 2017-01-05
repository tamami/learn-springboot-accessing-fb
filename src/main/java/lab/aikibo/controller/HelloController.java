package lab.aikibo.controller;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.User;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tamami on 04/01/17.
 */
@Controller
@RequestMapping("/")
public class HelloController {

    private Facebook facebook;
    private FacebookConnectionFactory connectionRepository;

    public HelloController(Facebook facebook, FacebookConnectionFactory connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping
    public String helloFacebook(Model model) {
        /*
        if(connectionRepository.test(facebook)) {
            return "redirect:/connect/facebook";
        }
        */

        //model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
        String fields[] = {"id","email","first_name","last_name","middle_name"};
        //PagedList<Post> feed = facebook.feedOperations().getFeed();
        //User userProfile = facebook.userOperations().getUserProfile();

        //model.addAttribute("facebookProfile", );
        //model.addAttribute("feed", userProfile);
        return "hello";
    }

}
