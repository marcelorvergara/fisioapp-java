/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.cloud.FirestoreClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class FireBaseClient {

    private static final String CREDENTIALS_FILE_PATH = "/fisioapp.json";

    public Firestore FirebaseInt() {

        InputStream in = FireBaseClient.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        FirebaseOptions options;
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(in))
                    .setDatabaseUrl("https://fisioapp-9cfc0.firebaseio.com")
                    .build();
            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }
        } catch (IOException ex) {
            Logger.getLogger(Anamnese.class.getName()).log(Level.SEVERE, null, ex);
        }

        Firestore db = FirestoreClient.getFirestore();
        return db;
    }

    public FirebaseAuth FirebaseAuth() {

        InputStream in = FireBaseClient.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        FirebaseOptions options;
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(in))
                    .setDatabaseUrl("https://fisioapp-9cfc0.firebaseio.com")
                    .build();
            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(options);
            }
        } catch (IOException ex) {
            Logger.getLogger(Anamnese.class.getName()).log(Level.SEVERE, null, ex);
        }
        FirebaseApp fbApp = FirebaseApp.getInstance();
        FirebaseAuth defaultAuth = FirebaseAuth.getInstance(fbApp);
        return defaultAuth;
    }

}
