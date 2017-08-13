package com.example.exception;

/**
 * Created by WHZ on 2017/6/19.
 */

class Annoyance extends Exception{}
class Sneeze extends Annoyance {}
//抛出异常的时候，异常处理系统会按照代码的书写顺序找出“最近”的处理程序
//找到匹配的处理程序之后，它就认为异常将得到处理，然后不再继续查找
public class Human{

    public static void main(String[] args){
        try {
            throw new Sneeze();
        }
        catch (Sneeze s){
            System.out.print("Caught Sneeze");
        }catch (Annoyance a){
            System.out.print("Caught Annoyance");
        }

        try {
            throw new Sneeze();
        }catch (Annoyance a){
            System.out.print("Caught Annoyance");
        }
    }
}
