import java.util.*;
public class Main{
    static ArrayList<String> task =new ArrayList<String>();
    static ArrayList<ArrayList<String>> list =new ArrayList();
    //static ArrayList<String> selected =new ArrayList<String>();
    static Scanner sc=new Scanner(System.in);
    static ArrayList<String> ch= new ArrayList<>();
    static class Todo{

        public void show(){
            ArrayList<String> list= new ArrayList<>();                             //first display list
            list.add("Create todo list");
            list.add("Use todolist");
            list.add("Remove todolist");
            list.add("Quit");
            System.out.println(list);
        }
    }
    static class Create extends Todo {
        public void Show() {

        }

        public void display() {
            while (true) {
                System.out.println("Give name to your list");
                String str = sc.nextLine();
                ArrayList<String> task =new ArrayList<String>();
                if (str.equals("exit")) {
                    break;
                }
                System.out.println("List name:" + str);
                //  public void ad() {
                System.out.println("Add a task");                                     //Adding task to the list
                while (true) {
                   // ArrayList<String> task =new ArrayList<String>();
                    String input = sc.nextLine();
                    if (input.equals("exit")) {
                        break;
                    }
                    task.add(input);
                   // System.out.println(task);
                }
                System.out.println(task);
                list.add(task);

            }

            System.out.println(list);
        }
    }
    static class Choice extends Todo{
        public void options(){
            System.out.println("Enter the list you want to operate:");
            System.out.println(list);
            int position=sc.nextInt();
            ArrayList<String> selected =list.get(position);
            //super.operations();

            ch.add("Add task");                                                    //Operations to be performed
            ch.add("Remove task");
            ch.add("Mark as completed ✔");
            ch.add("quit");
            System.out.println(ch);
            while(true){
                String al=sc.nextLine();
                if(al.equals("quit")){                                                     //quit
                    break;
                }
                if(al.equals("Add task"))
                {
                    System.out.println("Enter the task to be added:");
                    String addtask=sc.nextLine();
                    selected.add(addtask);                                                                //add task
                    System.out.println(list);
                }
                if(al.equals("Remove task"))
                {
                    System.out.println("Enter the task to be removed:");
                    String removetask=sc.nextLine();
                    selected.remove(removetask);                                                         //remove task
                    System.out.println(list);

                }
                if(al.equals("Mark as completed"))
                {
                    System.out.println("Enter the task completed:");
                    String cmtask=sc.nextLine();
                    int index= selected.indexOf(cmtask);
                    selected.set(index, cmtask+"✔" );                                                   //mark as complete
                    System.out.println(list);
                    System.out.println("Marked as completed ✔");
                }
            }
        }
    }

    static class Use extends Choice{
        public void usetodo(){

            //  System.out.println("List of todolist:");
            //  System.out.println(task);
            super.options();
        }
    }
    static class RemoveObj{
        public void rem()
        {
            System.out.println("Enter the list you want to operate:");
            System.out.println(list);
            int position=sc.nextInt();
            ArrayList<String> selected =list.get(position);
            list.remove(position);
            System.out.println(list);

        }
    }
    public static void main(String[] args) {

        System.out.println("Choices");
        Todo list=new Todo();
        list.show();
        while(true){
            System.out.println("Select the operation");
            String op=sc.nextLine();
            //while(op!="Quit"){
            if(op.equals("Quit"))                                                                         //terminate
            {
                System.exit(0);
            }
            if(op.equals("Create todo list")){                                                         //todolist creation
                Create name=new Create();
                name.display();
                Choice c=new Choice();
                c.options();
            }
            //System.out.println("Select the operation");
            if(op.equals("Use todolist"))                                             //using todolist
            {
                System.out.println("List of todolist:");
                System.out.println(list);
                Use use=new Use();
                use.usetodo();
                //  System.out.println("Select the operation");
            }
            if(op.equals("Remove todolist")){
                RemoveObj removeobj=new RemoveObj();
                removeobj.rem();

            }
        }
    }
}









