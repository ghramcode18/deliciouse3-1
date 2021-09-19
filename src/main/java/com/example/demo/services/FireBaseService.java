// package delicious.delicious.services;

// import java.io.IOException;
// import java.io.InputStream;

// import com.google.auth.oauth2.GoogleCredentials;
// import com.google.firebase.FirebaseApp;
// import com.google.firebase.FirebaseOptions;
// import com.google.firebase.messaging.FirebaseMessaging;
// import com.google.firebase.messaging.FirebaseMessagingException;
// import com.google.firebase.messaging.Message;
// import com.google.firebase.messaging.Notification;

// import org.springframework.core.io.ResourceLoader;
// import org.springframework.stereotype.Service;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;

// @Service
// public class FireBaseService {
//     @Autowired
//     ResourceLoader resourceLoader; 
//     @Autowired
//     private FirebaseMessaging firebaseMessaging;

    
//     @Bean
//     public FirebaseMessaging init() throws IOException
//     {
//         // initalize firebase app
//         InputStream serviceAccount =
//         resourceLoader.getResource("classpath:googlecred.json").getInputStream();
        
//         FirebaseOptions.Builder builder = FirebaseOptions.builder();
//         GoogleCredentials googleCredentials = GoogleCredentials.fromStream(serviceAccount);
//         FirebaseOptions options = builder.setCredentials(googleCredentials).build();
//         FirebaseApp app = FirebaseApp.initializeApp(options);
//         return FirebaseMessaging.getInstance(app);



//     }

//     public String sendMessage(String title,String message, String token) throws FirebaseMessagingException
//     {

//         Notification notification = Notification
//                 .builder()
//                 .setTitle(title)
//                 .setBody(message)
//                 .setImage("https://static.vecteezy.com/system/resources/previews/000/377/611/original/notification-vector-icon.jpg")
//                 .build();

//         Message packet = Message
//                 .builder()
//                 .setToken(token)
//                 .setNotification(notification)
//                 .build();

//         return firebaseMessaging.send(packet);
//     }

    
// }
