// package delicious.delicious.controllers;

// import com.google.firebase.messaging.FirebaseMessagingException;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import delicious.delicious.services.FireBaseService;

// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;

// @RestController
// public class FireBaseController {

//     @Autowired
//     FireBaseService fireBaseService;

//     @RequestMapping(value = "/send", method = RequestMethod.GET)
//     public String sendNotification(@RequestParam String title, @RequestParam String message,
//             @RequestParam String token) {
//         try {
//             return fireBaseService.sendMessage(title, message, token);
//         } catch (FirebaseMessagingException e) {
//             return e.getMessage();
//         }
//     }

// }
