package advance.class01_Arrays.classroom;

import java.util.Stack;

public class SimplifyDirectoryPath {

    public String simplifyPath(String A) {

        Stack<String> stack = new Stack<>();
        String root  = "/";

        int N = A.length();

        for(int i =0; i<A.length(); i++){

            String directory = "";
            while(i < N && A.charAt(i) == '/'){
                i++;
            }

            while(i < N && A.charAt(i) != '/'){
                directory+= A.charAt(i);
                i++;
            }

            if(directory != null  && directory.equals(".")){
                continue;
            }

            else if(directory != null  && directory.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(directory!= null){
                stack.push(directory);
            }
        }

        //System.out.println(stack);
        Stack<String> revStack = new Stack<>();
        while(!stack.isEmpty()){
            revStack.push(stack.pop());
        }

        StringBuffer buffer = new StringBuffer();
        while (!revStack.isEmpty()){
            buffer.append(root).append(revStack.pop());
        }
        if(buffer.length() == 0){
            buffer.append(root);
        }

        return buffer.toString();
    }


    public static void main(String[] args) {

        System.out.println(new SimplifyDirectoryPath().simplifyPath("/a/./b/../../c/d/"));
        System.out.println(new SimplifyDirectoryPath().simplifyPath("/home/"));
        System.out.println(new SimplifyDirectoryPath().simplifyPath("/a/./b/../../c/"));
        System.out.println(new SimplifyDirectoryPath().simplifyPath("/../../../../../a"));
        System.out.println(new SimplifyDirectoryPath().simplifyPath("/a/../.././../../."));
        System.out.println(new SimplifyDirectoryPath().simplifyPath("/a//b//c//////d"));
    }


}
