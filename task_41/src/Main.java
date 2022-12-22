import java.util.*;

public class Main {
    static LinkedList<Integer> myList = new LinkedList<>();
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {

        input();

        while(!myList. isEmpty()){
            stack.push(myList.get(0));
            myList.remove(0);
        }

        while (!stack.isEmpty()){
            myList.add(stack.pop());

        }
        System.out.println("Перевернутый список:");
        for (int item: myList){
            System.out.print(item+"\t");
        }
    }
    static void input(){
            myList.add(1);
            myList.add(3);
            myList.add(7);
            myList.add(10);
            myList.add(15);


    }
}
