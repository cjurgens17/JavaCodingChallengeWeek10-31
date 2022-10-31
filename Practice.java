public class Practice {

    public  static String atBash(String cipher){

        StringBuilder mirror = new StringBuilder("");
        int lowLowCase = (int)'a';
        int highLowCase = (int)'z';
        int lowUpCase = (int)'A';
        int HighUpCase = (int)'Z';
        for(int i =0;i<cipher.length();i++){
            char letter = cipher.charAt(i);
            int asciiValue = (int)letter;
            if(asciiValue >=lowLowCase && asciiValue<=highLowCase){
                //do operation for lowercase
                int start = lowLowCase;
                int counter = 0;

                while(start != asciiValue){
                    counter++;
                    start++;
                }

                asciiValue = highLowCase-counter;
                mirror.append((char) asciiValue);


            }else if(asciiValue>=lowUpCase && asciiValue<=highUpCase){
                //then we do uppercase operation
                int start = lowUpCase;
                int counter = 0;

                while(start != asciiValue){
                    counter++;
                    start++;
                }

                asciiValue = highUpCase-counter;
                mirror.append((char) asciiValue);

            }else{
                mirror.append(cipher.charAt(i));
            }

        }



      return mirror.toString();
    }

    public static void main(String[] args) {


        System.out.println(Practice.atBash("apple"));
        System.out.println(Practice.atBash("Hello world!"));
        System.out.println(Practice.atBash("Christmas is the 25th of December"));


    }
}
