package Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorr
{
    public static void main(String[] args) {

        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseiterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while(iterator.hasNext() && reverseiterator.hasPrevious())
        {
            if(iterator.next() !=reverseiterator.previous())
            {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }

}
