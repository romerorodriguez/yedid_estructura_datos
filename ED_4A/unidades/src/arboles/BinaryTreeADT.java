package arboles;
import java.util.Iterator;

public interface BinaryTreeADT <T>{
    public void removeLeftSubTree();
    public void removeRightSubTree();
    public void removeAllElements();
    public boolean isEmpty();
    public int size();
    public boolean constains(T element);
    public T find (T element);
    public String toString();
    public Iterator<T> iteratorInOrder(); //en arbol
    public Iterator<T> iteratorPreOrder(); //descendente
    public Iterator<T> iteratorPostOrder(); //ascendente
    public Iterator<T> iteratorLevelOrder(); //niveles
}
