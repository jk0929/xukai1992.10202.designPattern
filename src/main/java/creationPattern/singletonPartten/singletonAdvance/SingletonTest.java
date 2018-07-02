package creationPattern.singletonPartten.singletonAdvance;



public class SingletonTest {

    public static void main(String[] args) {

        SingletonSynchUpdate singletonOne =  SingletonSynchUpdate.getSingleton();

        SingletonSynchUpdate singletonTwo =  SingletonSynchUpdate.getSingleton();

        if(singletonOne.equals(singletonTwo))
        {
            System.out.println("singletonOne 和 singletonTwo 代表的是同一个实例");
        }else
        {
            System.out.println("singletonOne 和 singletonTwo 代表的是不同实例");
        }

//        Singleton singletonOne1 = Singleton.getSingleton();
//
//        Singleton singletonOne2 = Singleton.getSingleton();
//
//        if(singletonOne1.equals(singletonOne2))
//        {
//            System.out.println("singletonOne 和 singletonTwo 代表的是同一个实例");
//        }else
//        {
//            System.out.println("singletonOne 和 singletonTwo 代表的是不同实例");
//        }

    }

}