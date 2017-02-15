package com.Decorate1;

/**
 * 装饰类 用来装饰boy对象
 *
 * @author user【该出保持了一个队persion对象的引用，可以方便的调用具体被装饰对象的方法，可以不破坏原类层次结构的功能】
 */
public abstract class PersonCloth extends Person {

    Person person;

    public PersonCloth(Person person) {
        this.person = person;
    }


    @Override
    public void dressed() {

        person.dressed();

    }
}
