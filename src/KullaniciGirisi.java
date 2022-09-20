import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, passWord, reset, newPassWord;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        passWord = input.nextLine();

        if (userName.equals("patika") && passWord.equals("java101")) {
            System.out.println("Giriş Yaptınız. ");

        } else {
            System.out.println("Hatalı Giriş Yaptınız. Şifrenizi Sıfırlamak İster Misiniz ? (Yes/No)");
            reset = input.nextLine();

            if (reset.equals("No")) {
                System.out.println("Giriş Sona Erdi. ");

            }else if(reset.equals("Yes")){
                System.out.println("Yeni Şifreyi Giriniz : ");
                newPassWord = input.nextLine();

                if(newPassWord.equals("java101")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz. ");
                }else{
                    System.out.println("Şifre oluşturuldu. ");

                }
            } else{
                System.out.println("Hatalı Giriş Yaptınız. Tekrar Deneyiniz. ");
                }

            }
        }

    }

