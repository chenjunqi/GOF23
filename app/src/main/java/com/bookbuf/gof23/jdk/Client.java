//package com.bookbuf.gof23.jdk;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
///**
// * author: robert.
// * date :  2017/2/21.
// */
//
//public class Client {
//
//    static Trader raoul = new Trader("Raoul", "Combridge");
//    static Trader mario = new Trader("Mario", "Milan");
//    static Trader alan = new Trader("Alan", "Combridge");
//    static Trader brian = new Trader("Brian", "Combridge");
//
//    static List<Transaction> TRANSACTIONS = Arrays.asList(
//            new Transaction(brian, 2011, 300),
//            new Transaction(raoul, 2012, 1000),
//            new Transaction(raoul, 2011, 400),
//            new Transaction(mario, 2012, 710),
//            new Transaction(mario, 2012, 700),
//            new Transaction(alan, 2012, 950)
//    );
//
//    public static void main(String[] args) {
//
//        /*find2011();*/
//
//        /*findArea();*/
//
//        findFromCombridge();
//
//        findStringFromTrader();
//    }
//
//    // 找出2011年发生的所有交易，并按交易额排序（从低到高）。
//    private static void find2011() {
//
//        List<Transaction> transactions = TRANSACTIONS
//                .parallelStream()
//                .filter(transaction -> transaction.getYear() == 2011)
//                .sorted(Comparator.comparing(Transaction::getValue))
//                .collect(Collectors.toList());
//
//        transactions
//                .stream()
//                .map(transaction -> transaction.getValue())
//                .forEach(System.out::println);
//    }
//
//    // 找出交易员在哪些城市工作过
//    private static void findArea() {
//
//        List<String> areas = TRANSACTIONS
//                .stream()
//                .map(transaction -> transaction.getTrader().getCity())
//                .distinct()
//                .collect(Collectors.toList());
//
//        areas.stream().forEach(System.out::println);
//    }
//
//    // 查出所有来自剑桥的交易员，并案姓名排序
//    private static void findFromCombridge() {
//        List<Trader> traders = TRANSACTIONS
//                .parallelStream()
//                .map(Transaction::getTrader)//转化为交易员
//                .filter(trader -> trader.getCity().equalsIgnoreCase("Combridge"))
//                .distinct()
//                .sorted(Comparator.comparing(trader -> trader.getName()))
//                .collect(Collectors.toList());
//        traders.stream().forEach(System.out::println);
//    }
//
//    // 返回所有交易员的字符串，按字母顺序排序
//    private static void findStringFromTrader() {
//        String value = TRANSACTIONS
//                .parallelStream()
//                .map(Transaction::getTrader)
//                .map(Trader::getName)
//                .distinct()
//                .sorted()
//                .reduce("", (n1, n2) -> n1 + n2);
//    }
//
//    // 有没交易员在米兰工作
//    private static void findTraderInMiLan() {
//        Boolean bool = TRANSACTIONS
//                .stream()
//                .map(Transaction::getTrader)
//                .anyMatch(trader -> trader.getCity().equalsIgnoreCase("Milan"));
//    }
//
//    // 所有交易额中最高的交易额
//    private static void findMax() {
//        Optional<Integer> optional = TRANSACTIONS
//                .parallelStream()
//                .map(Transaction::getValue)
//                .reduce(Integer::max);
//    }
//}
