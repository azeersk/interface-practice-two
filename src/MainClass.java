import java.util.*;

interface arrayInter{
    public void arrayListMethod(int a);
    public void linkedListMethod(int b);
}

interface setInter{
    public void hashSetMethod(int a);

    public void linkedHashSetMethod(int b);
}

class arrayClass implements arrayInter{
    public void arrayListMethod(int a){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=1; i<a; i++){
            arrayList.add(i*12);
        }

        System.out.println("The size of the arrayList is: "+arrayList.size());
        System.out.println("The arrayList is: "+ arrayList);
        System.out.println("Elements in the ArrayList is: ");
        arrayList.forEach(e->{System.out.print(e);
        System.out.print("  ");});
        arrayList.clear();
    }

    public void linkedListMethod(int b){
        int a = 6;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=1; i<b; i++){
            linkedList.add(i*7);
        }

        System.out.println("The size of LinkedList is: "+ linkedList.size());
        System.out.println("The LinkedList is: " +linkedList);
        System.out.println("Elements in the LinkedList is: ");
        linkedList.forEach(l->{System.out.print(l);
        System.out.print("  ");});
        arrayListMethod(a);
        linkedList.clear();
    }
}

class setClass implements setInter{

    public void hashSetMethod(int a){
        HashSet<Integer> Values = new HashSet<>();
        System.out.println(Values);
        for(int i=1; i<a; i++){
            Values.add(i*3);
        }
        System.out.println("The values as String: "+ Values.toString());
        System.out.println("The given Values set is: "+ Values);
        System.out.println("The size of HashSet is: "+ Values.size());
        System.out.println("Each element in the Hashset is: ");

        Values.forEach(h->{System.out.print(h);
        System.out.print("  ");});
        Values.clear();
    }

    public void linkedHashSetMethod(int a ) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        System.out.println("Size of the linkedHashSet is: "+ linkedHashSet.size());
        System.out.println(linkedHashSet);
        for(int i=1; i<a; i++){
            linkedHashSet.add(i*2);
        }
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        System.out.println("Elements in the linkedHashSet is: ");
        linkedHashSet.forEach(l->{System.out.print(l);
        System.out.print("  ");});
        System.out.println();
        linkedHashSet.clear();
    }
}

public class MainClass {
    public static void main(String[] args){
        int a = 5;
        arrayClass objA = new arrayClass();
        objA.arrayListMethod(a);


        System.out.println();
        System.out.println();
        objA.linkedListMethod(a);


        System.out.println();
        System.out.println();

        setClass objS = new setClass();

        objS.hashSetMethod(a);

        System.out.println();
        System.out.println();
        objS.linkedHashSetMethod(a);
    }
}