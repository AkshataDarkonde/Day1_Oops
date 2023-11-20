package databaseAbstraction;

abstract class Persistence {
    abstract void persist();
}

class FilePersistence extends Persistence{
    @Override
    void persist(){
        System.out.println("Data saved to File");
    }
}
class DatabasePersistence extends Persistence{
    @Override
    void persist(){
        System.out.println("Data saved to Datatbase");
    }
}
public class PersistenceClient{
    public static void main(String[] args) {
        Persistence persistence = getPersistenceObject();
        persistence.persist();
    }
    private static Persistence getPersistenceObject(){
        return  new FilePersistence();
    }
}
