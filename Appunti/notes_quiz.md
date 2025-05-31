#### esempio static
Lo static applicato ad un metodo, significa che appartiene alla classe, non all'istanza.

#### esempio Math.random()
Il Math.random() retistuisce un numero decimale tra 0.0 e 1.0.

#### esempio stringhe
```java
public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "Hello";
    String s3 = new String("Hello");

    System.out.println(s1 == s2);
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
}
```
quello che verrà visualizzato sarà: ```true, false, true```.<br> Perchè s3 essendo un istanza e s1 una stringa hanno bisogno dell'equals, che controlla solo il contenuto, invece l'operatore == controlla contenuto e tipo. Essendo di due tipi diversi darà false l'output.

#### esempio cicli
```java
public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};
    int sum = 0;

    for (int i = 0; i < numbers.length; i++) {
        if(i == 2) continue;
        if(sum > 5) break;
        sum += numbers[i];
    }

    System.out.println(sum);
}
```
quello che verrà visualizzato sarà: ```7```.  
Perchè inizia con l'1 e lo somma, passa al 2 e lo somma, arriva al 3 e lo salta per la condizione ```if(i == 2) continue;```, passa al 4 e lo somma, arriva al 5 e lo scarta perchè esce dal ciclo per la condizione ```if(sum > 5) break;```. Il risultato finale è 7.

#### esempio List()
Il metodo size() delle List restituisce il numero di elementi.

#### esempio ereditarietà
L'ereditarietà in Java rappresenta una classe che eredita proprietà e metodi da un'altra classe.  
Per polimorfismo si intende stessi metodi con comportamenti diversi.  
Con la parola chiave ```final``` definiamo una classe che NON può essere ereditata.
##### esempio 1
```java 
static class Base {
    private int value = 10;

    public Base() {
        addValue();
    }

    public void addValue() {
        value++;
    }

    public int getValue() {
        return value;
    }
}

static class Derived extends Base {
    private int value = 20;

    public void addValue() {
        value += 2;
    }

    public int getValue() {
        return value;
    }
}

public static void main(String[] args) {
    Base b = new Derived();
    System.out.println(b.getValue());
}
```
quello che verrà visualizzato sarà: ```20```.

##### esempio 2
```java
static class Parent {
    void show() {
        System.out.println("Parent ");
    }
}

static class Child extends Parent {
    @Override
    void show() {
        super.show();
        System.out.println("Child ");
    }
}

public static void main(String[] args) {
    Parent p = new Child();
    p.show();
}
```
quello che verrà visualizzato sarà: ```Parent Child ```.

##### esempio 3
```java
static class Animal {
    protected String makeSound() {
        return "Animal";
    }
}

static class Bird extends Animal {
    private String sound = "Tweet";

    protected String makeSound() {
        return sound + " " + super.makeSound();
    }
}

static class Parrot extends Bird {
    private String sound = "Hello";

    public String talk() {
        return sound + " " + makeSound();
    }
}

public static void main(String[] args) {
    Animal a = new Parrot();
    Bird b = (Bird) a;
    Parrot p = (Parrot) b

    System.out.println(p.talk());
}
```
quello che verrà visualizzato sarà: ```Hello Tweet Animal```.

##### esempio 4
```java
static class Parent {
    private int x = 1;
    protected int y = 2;

    public int getSum() {
        return x + y;
    }
}

static class Child extends Parent {
    private int x = 3;
    public int y = 4;

    public int getSum() {
        return x + y + super.getSum();
    }
}

public static void main(String[] args) {
    Parent p = new Child();
    Child c = new Child();

    System.out.println(p.y + " " + c.y + " " + p.getSum() + " " + c.getSum());
}
```
quello che verrà visualizzato sarà: ```2 4 10 10``` e NON 2 4 7 10, perchè vanno in override SOLO i metodi e non le proprietà.

##### esempio 5
```java
static class Outer {
    private int x = 1;

    class Inner {
        private int x = 2;
        
        class Deep {
            private int x = 3;

            public void printAll() {
                System.out.println(Outer.this.x + " ");
                System.out.println(Inner.this.x + " ");
                System.out.println(this.x);
            }
        }
    }
}

public static void main(String[] args) {
    Outer.Inner.Deep deep = new Outer().new Inner().new Deep();
    deep.printAll();
}
```
quello che verrà visualizato sarà: ```1 2 3```.

#### esempio interfaccia
```java 
interface A {
    default void show() {
        System.out.println("A ");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B ");
    }
}

static class C implements A, B {
    public void show() {
        B.super.show();
        System.out.println("C ");
    }

    private void special() {
        A.super.show();
    }
}

public static void main(String[] args) {
    A a = new C();
    B b = new C();
    C c = new C();

    a.show();
    b.show();
    c.show();
}
```
quello che verrà visualizzato sarà: ```B C B C B C ```.

#### esempio exceptions
```java
public static void main(String[] args) {
    try {
        System.out.println("A");
        throw new RuntimeException();
    } catch (Exception e) {
        System.out.println("B");
        return;
    } finally {
        System.out.println("C");
    }
    System.out.println("D");
}
```
quello che verrà visualizzato sarà: ```ABC ```
e non ABCD perchè 
##### Analisi passo per passo:
1. System.out.println("A");  
    👉 Viene eseguito e stampa A.
1. throw new RuntimeException();  
    👉 Genera un'eccezione, quindi l'esecuzione salta subito al blocco catch.
1. catch (Exception e) viene attivato perché RuntimeException è una sottoclasse di Exception.  
    👉 Stampa B.
1. Dentro al catch, c'è return;  
    👉 Questo interrompe il metodo main e torna indietro — ma prima viene eseguito finally.
1. Il blocco finally viene sempre eseguito, anche se c'è un return nel catch.  
    👉 Stampa C.
1. System.out.println("D"); non viene mai eseguito, perché c'è stato un return prima.