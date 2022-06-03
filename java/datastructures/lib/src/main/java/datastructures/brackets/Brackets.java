

// Referenced from Rodger Reyes https://github.com/RogerMReyes
package datastructures.brackets;


import datastructures.queue.Queue;
import datastructures.stack.Stack;

public class Brackets {
  private final Stack<Character> brackets = new Stack<>();
  private final Queue<Character> primer = new Queue<>();

  public boolean validateBrackets(String string){
    if(string.length() < 2) return false;
    for(int i = 0; i < string.length(); i++){
      if(checkOpen(string.charAt(i)) || checkClose(string.charAt(i))){
        primer.enqueue(string.charAt(i));
      }
    }
    while(!primer.isEmpty()){
      if(checkOpen(primer.peek())){
        brackets.push(primer.dequeue());
      }
      if(checkClose(primer.peek())){
        if(checkMatch(brackets.peek(), primer.peek())){
          brackets.pop();
          primer.dequeue();
        }
        else return false;
      }
    }
    return true;
  }

  public static boolean checkOpen(Character bracket){
    return bracket == '{' || bracket == '[' || bracket == '(';
  }

  public static boolean checkClose(Character bracket){
    return bracket == '}' || bracket == ']' || bracket == ')';
  }

  public static boolean checkMatch(Character stack, Character queue){
    return (stack + queue.toString()).equals("{}")
      || (stack + queue.toString()).equals("[]")
      || (stack + queue.toString()).equals("()");
  }
}
