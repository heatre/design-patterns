package protect;

import java.lang.reflect.Proxy;

/**
 * Created by Swin on 2016/6/16.
 */
public class ProtectTest {
    public static void main(String[] args){
        ProtectTest protectTest = new ProtectTest();
        protectTest.drive();
    }

    public ProtectTest(){

    }
    public void drive(){
        PersonBean joe = new PersonBeanImp("joe","male","reading");
        PersonBean ownerProxy = getOwnerProxy(joe);
        try {
            ownerProxy.setHotOrNotRating(5);
        }catch (Exception e){
            System.out.println("can not set HotOrNotRating from owner proxy");
        }
        System.out.println("Name:"+ownerProxy.getName());
        System.out.println("rating:"+ownerProxy.getHotOrNotRating());


        PersonBean nonOwnerProxy = getProxy(joe);
        System.out.println("Name:"+nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("eat");
        }catch (Exception e){
            System.out.println("can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("rating:"+nonOwnerProxy.getHotOrNotRating());
    }

    public PersonBean getOwnerProxy(PersonBean p){
        return (PersonBean)Proxy.newProxyInstance(p.getClass().getClassLoader(),
                p.getClass().getInterfaces(),
                new OwnerInvocationHandler(p));
    }

    public PersonBean getProxy(PersonBean p){
        return (PersonBean)Proxy.newProxyInstance(p.getClass().getClassLoader(),
                p.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(p));
    }
}
