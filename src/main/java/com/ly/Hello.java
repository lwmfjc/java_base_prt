package com.ly;

class Person {
    public String name;

    public Person() {
        System.out.println("Person()");
        name = "Person";
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    public String name;

    public Student() {
        System.out.println("Student()");
        name = "Student";
    }

    public String getName() {
        return name;
    }
}

/**
 * 引用变量在编译阶段只能调用其编译时类型所具有的方法，但运行时则执行它运行时类型所具有的方法（意思是说：编写代码时，只能调用父类中具有的方法，如果子类重写了该方法，运行时实际调用的是运行时类型的该方法。程序在编译时，会在编译类型中检查是否具有所调用的方法，如果编写代码时，使用引用变量调用子类中的特有方法，或者调用重载了父类中的方法，而父类中找不到该方法，则会报编译错误），因此，编写Java代码时，引用变量只能调用声明该变量所用类里包含的方法。与方法不同的是，对象的属性则不具备多态性。通过引用变量来访问其包含的实例属性时，系统总是试图访问它编译时类所定义的属性，而不是它运行时所定义的属性。
 *
 * 要访问子类中特有的方法和属性，在编写代码时，则必须进行类型转换。
 *
 * —— 以上摘自《疯狂Java讲义》
 * ————————————————
 * 版权声明：本文为CSDN博主「努力coding的小工」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/Cherish20151011/article/details/75579035
 */
public class Hello {
    public static void main(String[] args) {
        Person person = new Student();
        System.out.println(person.name); // Person
        //System.out.println(person.getName()); // Student
    }
}
