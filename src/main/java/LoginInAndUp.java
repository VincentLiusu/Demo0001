import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LoginInAndUp {
    public static void main(String[] args) {
        System.out.println("请注册账号！！！");
        Register();

    }
    //注册方法
    public static void Register(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的注册账号：");
        String ACcount = sc.next();
        System.out.println("请输入你的注册密码：");
        String Password = sc.next();
        System.out.println("请输入你的邮箱：");
        String Email = sc.next();
        //设置正则表达式的规则
        String regex1 = ".{8,14}";
        String regex2 = ".{6,10}";
        String regex3 = "\\w+@{1}\\w+\\.[a-z]+";
        //验证是否符合正则表达式
        if (ACcount.matches(regex1) && Password.matches(regex2) && Email.matches(regex3)){
            System.out.println("注册成功！");
            System.out.println("请开始登录！！！");
            Login(ACcount+" "+Password+" "+Email);
        }else{
            System.out.println("信息输入有误！");
        }

    }
    //登录方法
    public static void Login(String s1){
        //将注册信息字符串分割成具体的账号密码，等待用户输入再进行验证
        String[] people1 = s1.split(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的账号：");
        String ACcount = sc.next();
        System.out.println("请输入你的密码：");
        String Password = sc.next();

        System.out.println("发送验证码y/n？");
        String s = sc.next();
        //选择y发送验证码，否则不登录
        if ("y".equals(s)){
            //生成验证码
            String str = "554648133165488978979";
            String yzm = "";
            for (int i=0;i<4;i++){
                int index = (int) Math.round(Math.random()*(str.length()-1));
                char c = str.charAt(index);
                yzm+=c;
            }
            System.out.println("您本次登录的验证码为："+yzm);
            System.out.println("请输入你的验证码：");
            String Code = sc.next();
            //将输入的信息和正确的用户信息比对，账号密码验证码都正确登录成功
            if (ACcount.equals(people1[0]) && Password.equals(people1[1]) && Code.equals(yzm)){
                //设置日期格式
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.println("尊敬的"+people1[0]+",当前的时间是："+df.format(new Date()));
                System.out.println("用户名   "+"  密码  "+"   邮箱");
                System.out.println(people1[0]+" "+people1[1]+" "+people1[2]);
            }
        }else{
            System.out.println("不发送验证码");
        }




    }
}
