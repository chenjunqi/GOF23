//package com.bookbuf.gof23.prototype.debug;
//
//import com.bookbuf.gof23.prototype.ProtoObject;
//import com.bookbuf.gof23.prototype.impls.Combination;
//import com.bookbuf.gof23.prototype.impls.Leaf;
//import com.bookbuf.gof23.prototype.impls.Root;
//
///**
// * author: robert.
// * date :  2017/2/17.
// */
//
//public class Client {
//
//    public static void main(String[] args) {
//
//
//        ProtoObject root = new Root(null);
//        ProtoObject combination = new Combination(root);
//        ProtoObject leaf = new Leaf(combination);
//
//        leaf.invoke("leaf");
//        leaf.invoke("combination");
//        leaf.invoke("root");
//
//        leaf.printChain();
//    }
//
//}
