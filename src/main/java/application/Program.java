package application;

import entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {

        // ---> Comandos abaixo são para persistir no banco de dados;
        /* //O ID é nulo porque o próprio banco de dados vai incluir;
        Person p1 = new Person(null, "Carlos da Silva", "carlos@gmail.com");
        Person p2 = new Person(null, "Fernando da Silva", "fernando@gmail.com");
        Person p3 = new Person(null, "Andrey da Silva", "andrey@gmail.com");

        //O persistenceUnitName fica dentro do arquivo "persistence.xml"
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        System.out.println("Pronto!");
        em.close();
        emf.close();
        */


        // ---> Comando para listar um elemento do banco de dados;
       /* EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        Person p = em.find(Person.class, 2);

        System.out.println(p);

        System.out.println("Pronto!");
        em.close();
        emf.close();*/

        // ---> Comando para apagar uma pessoa do banco de dados;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // ---> Primeiro você busca a pessoa no banco de dados, para depois consegui-lo excluir. Isso se chama, entidade monitorada;
        Person p = em.find(Person.class, 2);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();


    }
}
