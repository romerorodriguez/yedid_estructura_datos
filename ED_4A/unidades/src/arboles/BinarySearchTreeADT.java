package arboles;

public interface BinarySearchTreeADT <T> extends BinaryTreeADT{
    public void addElement(T element);
    public T removeElement(T element);
    public void removeAllElements(T element);
    public T removeMin();
    public T removeMax();
    public T findMin();
    public T findMax();
}
