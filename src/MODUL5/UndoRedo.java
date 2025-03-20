package MODUL5;

import java.util.ListIterator;
import java.util.Stack;

public class UndoRedo <E>{
    private Stack<E> undoStack;
    private Stack<E> redoStack;

    public UndoRedo() {
        this.undoStack = new Stack();
        this.redoStack = new Stack();
    }

    public void tambahData(E data) {
        undoStack.push(data);
        redoStack.clear();
    }

    public void undo(){
        if (undoStack.isEmpty()) {
            System.out.println("List undo kosong");
        } else {
            E value = (E) undoStack.pop();
            redoStack.push(value);
        }
    }

    public void redo(){
        if (redoStack.isEmpty()){
            System.out.println("List redo kosong");
        } else {
            E value = (E) redoStack.pop();
            undoStack.push(value);
        }
    }

    public void viewListUndo() {
        ListIterator iterator = undoStack.listIterator(undoStack.size());
        if(undoStack.isEmpty()){
            System.out.println("Undo masih kosong");
        }else{
            while (iterator.hasPrevious()){
                Object value = iterator.previous();
                System.out.println(value);
            }
        }
    }
    public void viewListRedo() {
        ListIterator iterator = redoStack.listIterator(redoStack.size());
        if(redoStack.isEmpty()){
            System.out.println("Redo masih kosong");
        }else{
            while (iterator.hasPrevious()){
                Object value = iterator.previous();
                System.out.println(value);
            }
        }

    }
}
