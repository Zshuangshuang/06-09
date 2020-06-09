package src2;

import java.util.Stack;

/**
 * @ClassName: TestStackAndQueue
 * @Author: 邹双双
 * Date: 2020/6/9 13:40
 * @Description:
 */
public class TestStackAndQueue {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.empty()){
                return false;
            }
            Character top = stack.pop();
            if (c == '(' && top ==')'){
               continue;
            }
            if (c == '[' && top == ']'){
               continue;
            }
            if (c == '{' && top == '}'){
                continue;
            }
            return false;
        }
        return  true;
    }

}
