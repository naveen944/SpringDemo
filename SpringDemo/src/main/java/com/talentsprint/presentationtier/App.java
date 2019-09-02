package com.talentsprint.presentationtier;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.talentsprint.businesstier.Address;
import com.talentsprint.businesstier.Person;
import com.talentsprint.businesstier.PersonNew;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Person person = (Person)context.getBean("personBean");
        
        System.out.println(person.getAdharCardNumber()+","+person.getAddress().getCity());
        
        PersonNew personNew=(PersonNew)context.getBean("personNewBean");
        
        List<Address> addressList = personNew.getAddressList();
        
        Iterator<Address> iterator= addressList.iterator();
        while(iterator.hasNext()){
        	Address address =  iterator.next();
        	System.out.println(address.getDoorNumber()+","+address.getCity());
        }
    }
}
