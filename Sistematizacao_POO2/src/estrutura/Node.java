package estrutura;

public class Node {
    Contact contact;
    Node next;

    // Construtor que recebe um objeto Contact e inicializa o next como null
    public Node(Contact contact) {
        this.contact = contact;
        this.next = null;
    }
}
