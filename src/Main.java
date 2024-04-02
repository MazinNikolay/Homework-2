public class Main {
    public static void main(String[] args) {
        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);
        System.out.println();
        //Задача2
        dog+=4;
        cat+=4;
        paper+=4;

        System.out.println("Now dog="+dog);
        System.out.println("Now cat="+cat);
        System.out.println("Now paper="+paper);
        System.out.println();
        //Задача3
        dog-=3.5;
        cat-=1.6;
        paper-=7639;

        System.out.println("Now dog="+dog);
        System.out.println("Now cat="+cat);
        System.out.println("Now paper="+paper);
        System.out.println();
        //Задача4
        var friend=19;
        System.out.println("friend="+friend);
        friend+=2;
        System.out.println("Now friend="+friend);
        System.out.println();
        friend/=7;
        System.out.println("Now friend="+friend);
        System.out.println();
        //Задача5
        var frog=3.5;
        System.out.println("frog="+frog);
        frog*=10;
        System.out.println("Now frog="+frog);
        frog/=3.5;
        System.out.println("Now frog="+frog);
        frog+=4;
        System.out.println("Now frog="+frog);
        System.out.println();
        //Задача6
        var firstBoxerWeight=78.2;
        var secondBoxerWeight=82.7;
        var sumWeight=firstBoxerWeight+secondBoxerWeight;
        var divWeight=secondBoxerWeight%firstBoxerWeight;
        System.out.println("Общая масса боксеров равна "+sumWeight+" кг.");
        System.out.println("Раница в массе боксеров равна "+divWeight+" кг.");
        System.out.println();
        //Задача7
        divWeight=secondBoxerWeight-firstBoxerWeight;
        System.out.println("Раница в массе боксеров равна "+divWeight+" кг.");
        System.out.println();
        //Задача8
        var summaryTime=640.0;
        var workTime=8.0;
        var allWorkers=summaryTime/workTime;
        System.out.println("Всего работников в компании "+allWorkers+" человек");
        allWorkers+=94;
        var eachWorkTime=summaryTime/allWorkers;
        System.out.println("Если в компании работает "+allWorkers+" человек, то всего "+eachWorkTime+" часа работы может быть поделено между сотрудниками");
        hard1();
        hard2();
        hard3();
    }
    public static void hard1(){
        int a=12;
        int b=27;
        int c=44;
        int d=15;
        int e=9;
        int result=a*(b+(c-d*e));
        System.out.println(result);
        result=-result;
        System.out.println(result);
        result=-result;
        System.out.println(result);

    }

    public static void hard2(){
        int a=5;
        int b=7;
        System.out.println("a="+a);
        System.out.println("b="+b);
        if (b>a){
            a=a+b;
            b=a-b;
            a=a-b;
        }else{
            b=a+b;
            a=b-a;
            b=b-a;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    public static void hard3(){
        int a=456;
        int b=(a/10)%10;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}