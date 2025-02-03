package com.KhatsianouskiPavel.javacore.chapter18;

import java.util.*;

public class Shild {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        System.out.println("Начальный размер списочного массива al: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("razmer massiva: " + al.size());

        System.out.println("Soderjimoe massiva al: " + al);

        al.remove("F");
        al.remove(2);
        System.out.println("Soderjimoe massiva al: " + al);

        ///
        ArrayList<Integer> all = new ArrayList<>();
        all.add(1);
        all.add(2);
        all.add(3);
        all.add(4);
        System.out.println("Soderjimoe massiva al: " + all);

        Integer ia[] = new Integer[all.size()];
        ia = all.toArray(ia);
        int sum = 0;
        for (int i : ia) sum += i;
        System.out.println("Summa: " + sum);

        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Soderjimoe sv9znogo spiska: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Soderjimoe sv9znogo spiska ll posle ydaleni9 " + ll);

        String val = ll.get(2);
        ll.set(2, val + " izmeneno");
        System.out.println("Soderjimoe sv9znogo spiska posle izmenenii: " + ll);

        //HashSet
        HashSet<String> hs = new HashSet<>();
        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);

        //TreeSet
        TreeSet<String> ts = new TreeSet<>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);

        //ArrayDeque
        ArrayDeque<String> adq = new ArrayDeque<>();
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");
        System.out.println("Izvlechenie iz steka: ");
        while (adq.peek() != null) {
            System.out.println(adq.pop() + " ");
//            System.out.println(); // тут возможно ошибка у автора со скобками
        }
        //Iterator
        ArrayList<String> alll = new ArrayList<>();
        alll.add("C");
        alll.add("A");
        alll.add("E");
        alll.add("B");
        alll.add("D");
        alll.add("F");
        System.out.println("Ishodnoe soderjimoe spiso4nogo massiva alll: ");
        Iterator<String> itr = alll.iterator();

        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }

        ListIterator<String> litr = alll.listIterator();
        while (litr.hasNext()) {
            String element = litr.next();
            litr.set(element + "+");
        }
        System.out.println("Izmenenie soderjimoe spisochnogo massiva alll: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.println(element + " ");
        }

        //Otobrazit' spisok v obratnom por9dke
        System.out.println("Izmenennii v obratnom por9dke spisok: ");
        while (litr.hasPrevious()) {

        String element = litr.previous();
        System.out.println(element + " ");
    }

        System.out.println();

        ///Cikl for each - alternativa iteratoram
        ArrayList<Integer> vals = new ArrayList<>();
        //Vvesti zna4enie v spiso4nii massiv
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);

        //organizovat' cikl dl9 vivoda 4islovih zna4enii
        System.out.println("Ishodnoe soderjimoe spiso4nogo massiva vals: ");
        for (int v : vals) {
            System.out.println(v + " ");
        }
        System.out.println();

        //summirovat' 4islovie zna4eni9 v cikle for
        int summ = 0;
        for (int v : vals) {
            summ += v;
        }
        System.out.println("Summa 4islovih zna4enii: " + summ);

        // Iteratori-razdeliteli
        ArrayList<Double> valss = new ArrayList<>();
        valss.add(1.0);
        valss.add(2.0);
        valss.add(3.0);
        valss.add(4.0);
        valss.add(5.0);
        //vizvat' metod tryAdvance() dl9 vivoda soderjimogo spiso4nogo massiva vals
        System.out.println("Soderjimoe spiso4nogo massiva valss:\n");
        Spliterator<Double> spltitr = valss.spliterator();
        while (spltitr.tryAdvance((n) -> System.out.println(n))) {}
            System.out.println();

        spltitr = valss.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) {}

            //vizvat' metod forEachRemaining() dl9 vivoda soderjimogo spiso4nogo massiva sqrs
            System.out.println("Soderjimoe spiso4nogo massiva sqrs:\n");
            spltitr = sqrs.spliterator();
            spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();


        }
    }

    ///////////
    class Address {
        private String name;
        private String street;
        private String city;
        private String state;
        private String code;

        Address(String n, String s, String c, String st, String cd) {
            name = n;
            street = s;
            city = c;
            state = st;
            code = cd;
        }

        public String toString() {
            return name + "\n" + street + "\n" + city + " " + state + " " + code;
        }
    }

    class MailList {
        public static void main(String[] args) {
            LinkedList<Address> m1 = new LinkedList<Address>();

            m1.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
            m1.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
            m1.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

            //вывести список почтовых адресов
            for (Address element : m1) {
                System.out.println(element + "\n");
            }
        }
    }

    ////////////////
    class HashMapDemo {
        public static void main(String[] args) {
            HashMap<String, Double> hm = new HashMap<String, Double>();
            hm.put("John Dow", 3434.34);
            hm.put("Tom Smith", 123.22);
            hm.put("Jane Baker", 1378.00);
            hm.put("Todd Hall", 99.22);
            hm.put("Ralph Baker", -19.08);

            //polu4it' mnojestvo zapisei
            Set<Map.Entry<String, Double>> set = hm.entrySet();

            //vivesti mnojestvo zapisei
            for (Map.Entry<String, Double> me : set) {
                System.out.println(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
            System.out.println();

            //vnesti summu 1000 na s4et John Dow
            double balance = hm.get("John Dow");
            hm.put("John Dow", balance + 1000);
            System.out.println("New ostatok na s4ete John Dow: " + hm.get("John Dow"));
        }
    }





