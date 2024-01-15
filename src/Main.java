class TwoGen<T,V>{   //T имя параметра типа
    T ob1;//обьявление обьекта типа Т
    V ob2;
    TwoGen(T o1,V o2){
        ob1=o1;
        ob2=o2;
    }

    void showTypes(){
        System.out.println("Type of T "+ ob1.getClass().getName());
        System.out.println("Type of V "+ ob2.getClass().getName());
    }



    T getob1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}



public class Main {
    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj=new TwoGen<Integer, String>(88,"Generics");
        tgObj.showTypes();
        int v = tgObj.getob1();
        System.out.println("value: "+v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str );

        System.out.println();

        NumericFns<Integer> iOb3 = new NumericFns<Integer>(5);
        System.out.println("Reciprocal of ob3 is "+ iOb3.reciprocal());
        System.out.println("Fractional component of ob3 is "+ iOb3.fraction());
        System.out.println();

        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of dob is "+ dOb.reciprocal());
        System.out.println("Fractional component of dob is "+ dOb.fraction());
        System.out.println();

        NumericFns<Integer> iOb =
                new NumericFns<Integer>(6) ;
        NumericFns<Double> dOb2 =
                new NumericFns<Double>(-6.0) ;
        NumericFns<Long>iob4 =
                new NumericFns<Long>(5L);

        System.out.println("Testing iOb and dOb.");

        if(iOb.absEqual(dOb2))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");

        System.out.println();

        System.out.println("Testing iOb and 10b.");

        if(iOb.absEqual(iob4))
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}