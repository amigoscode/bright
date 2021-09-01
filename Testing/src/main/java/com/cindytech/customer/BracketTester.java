package com.cindytech.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BracketTester {

    public boolean check(String test) {
        if (test.equals("")) {
            return false;
        }
        // Creating array of input
        char[] ch = new char[test.length()];
        //Fill in input in array
        for (int i = 0; i < test.length(); i++) {
            ch[i] = test.charAt(i);
        }
        for (int i = 0; i < ch.length / 2; i++) {
            System.out.println("Checking " + ch[i] + " and " + (ch[ch.length - 1 - i]));
            if ((ch[ch.length - 1 - i]) != charReverser(ch[i]) || ch.length % 2 == 1) {
                return false;
            }
        }
        return true;
    }

    private char charReverser(char input) {
        if (input == '(') {
            return ')';
        } else if (input == '[') {
            return ']';
        } else if (input == '{') {
            return '}';
        } else {
            return 0;
        }
    }

    public boolean checkParentheses(String parentheses) {
        if (parentheses.equals("")) {
            return false;
        }
        List<Character> parenthesesArray = new ArrayList<>();
        Stack<Character> openStack = new Stack<>();

        for (int i = 0; i < parentheses.length(); i++) {
            parenthesesArray.add(parentheses.charAt(i));
        }

        for (int i = 0; i < parenthesesArray.size(); i++) {

            if (parenthesesArray.get(i).equals('(') || parenthesesArray.get(i).equals('{') || parenthesesArray.get(i).equals('[')) {
                openStack.push(parenthesesArray.get(i));
            } else if (parenthesesArray.get(i).equals(')')) {
                if (openStack.isEmpty()) {
                    return false;
                }
                else if (openStack.peek().equals('(')) {
                    openStack.pop();
                } else {
                    return false;
                }
            } else if (parenthesesArray.get(i).equals('}')) {
                if (openStack.peek().equals('{')) {
                    openStack.pop();
                } else {
                    return false;
                }
            } else if (parenthesesArray.get(i).equals(']')) {
                if (openStack.isEmpty()) {
                    return false;
                }
                else if (openStack.peek().equals('[')) {
                    openStack.pop();
                } else {
                    return false;
                }
            }
        }

        return openStack.isEmpty();
    }

}
