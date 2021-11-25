 
import java.security.SecureRandom;
import java.util.Base64;

class GenerateToken {
    
    private static final SecureRandom secureRandom = new SecureRandom(); //threadsafe
    private static final Base64.Encoder base64Encoder = Base64.getUrlEncoder(); //threadsafe


    public static void main(String[] args) {
         byte[] randomBytes = new byte[24];
         secureRandom.nextBytes(randomBytes);
         System.out.println( base64Encoder.encodeToString(randomBytes));
    }
}