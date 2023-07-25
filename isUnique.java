import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        String Text = Reader.next();

        boolean isUnique = true;

        System.out.println(Text);

        for(int i = 0; i < Text.length(); i++) {
            for (int j = i+ 1; j < Text.length(); j++) {
                if (Text.charAt(i) == Text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) {
                break;
            }
        }

        if(isUnique)
        {
            System.out.println("Your text is unique");
        }
        else {
            System.out.println("It is not unique");
        }
    }
}
