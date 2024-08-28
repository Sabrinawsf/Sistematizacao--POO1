package estrutura;

import java.util.Scanner;

public class ContactManager {
	

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contactList = new ContactList();
        int option;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Remover Contato");
            System.out.println("4. Listar Contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    contactList.addContact(new Contact(name, phoneNumber, email));
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome ou telefone do contato: ");
                    String searchTerm = scanner.nextLine();
                    Contact foundContact = contactList.searchContact(searchTerm);
                    if (foundContact != null) {
                        System.out.println("Contato encontrado: " + foundContact);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome ou telefone do contato a ser removido: ");
                    String removeTerm = scanner.nextLine();
                    boolean removed = contactList.removeContact(removeTerm);
                    if (removed) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Lista de Contatos:");
                    contactList.listContacts();
                    break;

                case 5:
                    System.out.println("Encerrando o programa.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (option != 5);

        scanner.close();
    }
}

