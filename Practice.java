public class Practice {

    public  static String atBash(String cipher){

        StringBuilder mirror = new StringBuilder("");
        for(int i =0;i<cipher.length();i++){
            char letter = cipher.charAt(i);
            int asciiValue = (int)letter;
            if(asciiValue >=97 && asciiValue<=122){
                //do operation for lowercase
                int start = 97;
                int counter = 0;

                while(start != asciiValue){
                    counter++;
                    start++;
                }

                asciiValue = 122-counter;
                mirror.append((char) asciiValue);


            }else if(asciiValue>=65 && asciiValue<=90){
                //then we do uppercase operation
                int start = 65;
                int counter = 0;

                while(start != asciiValue){
                    counter++;
                    start++;
                }

                asciiValue = 90-counter;
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
