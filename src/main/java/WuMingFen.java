class WuMingFen {
    //属性
    String theMa;
    int quantity;
    boolean likeSoup;
    //有参构造方法
    WuMingFen(String theMa,int quantity,boolean likeSoup){
        this.theMa = theMa;
        this.quantity = quantity;
        this.likeSoup = likeSoup;
    }
    //重载构造方法
    WuMingFen(String theMa,int quantity){
        this.theMa = theMa;
        this.quantity = quantity;
    }
    //无参构造方法
    WuMingFen(){
        theMa = "酸辣面";
        quantity = 2;
        likeSoup = true;
    }
    //检查方法
     public static void check(WuMingFen w){
        System.out.println("面码："+w.theMa+"\n"+"粉的分量："+w.quantity+"\n"+"是否带汤："+w.likeSoup);
    }
    public static void main(String[] args) {
        //调用无参构造方法创建对象
        WuMingFen w = new WuMingFen();
        //调用check检查方法，将对象当成参数传递过去
        check(w);
    }
}
