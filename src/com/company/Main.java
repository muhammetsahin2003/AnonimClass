package com.company;

public class Main
{

    public static void main(String [] args)
    {
        ATMApp app = new ATMApp(3);

        app.run();
    }

}




class ATMApp {
    public int tryNum;

    public ATMApp(int val)
    {
        tryNum = val;
    }

    public void doWorkForSuccess()
    {
        System.out.println("Giriş başarılı");
    }

    public void doWorkForFail()
    {
        System.out.println("Giriş başarısız. Kartınız iptal edilmiştir");
    }

    public void run()
    {
        String uname = "test";
        String passwd = "1234";

        java.util.Scanner kb = new java.util.Scanner(System.in);

        int i;

        for (i = 0; i < tryNum; ++i) {
            System.out.print("Kullanıcı adı giriniz:");
            String username = kb.nextLine();

            System.out.print("Şifre giriniz:");
            String password = kb.nextLine();

            if (username.equals(uname) && password.equals(passwd))
                break;
        }

        if (i != tryNum)
            doWorkForSuccess();
        else
            doWorkForFail();
    }
}







