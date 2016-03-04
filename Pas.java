import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingPassword {

private static Pattern pswNamePtrn1 = Pattern.compile("([a-zA-Z+]+[0-9+]+[&@!#+]+)$");
public static boolean validatePassword(String userName){

Matcher mtch = pswNamePtrn1.matcher(userName);
if(mtch.matches() & userName.length()==6){
return true;
}
return false;
}

public static void main(String args[]){
System.out.println(validatePassword("t3232#"));
}
}