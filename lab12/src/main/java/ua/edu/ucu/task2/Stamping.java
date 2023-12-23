package ua.edu.ucu.task2;

public class Stamping {

    public static <T> Group<T> stamp(Group<T> root) {
        for (Task<T> elem : root.getTasks()) {
            if (elem instanceof Task) {
                processTask((Signature<T>) elem, root);
            } else if (elem instanceof Group) {
                processGroup((Group<T>) elem);
            }
        }
        return root;
    }

    public static <T> void processTask(Signature<T> task, Group<T> group) {
        task.setHeader("groupId", group.getUuid());
    }
    
    public static <T> void processGroup(Group<T> elem) {
        stamp(elem);
    }
}
