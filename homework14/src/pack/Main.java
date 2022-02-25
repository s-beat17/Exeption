package pack;

import exception.UserValidException;

import java.util.Scanner;

import static pack.User.valid;

public class Main {

    public static void main(String[] args) throws UserValidException {
//        int array[] = new int[4];
//        Scanner input = new Scanner(System.in);
//        System.out.println("Insert array elements:");
//        for (int i = 0; i < array.length; i++) {
//            try {
//                array[i] = handlerNegative(input.nextInt());
//            } catch (NegativeValueException e) {
//                e.printStackTrace();
//                array[i] = 0;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        C cc = new C();
//        A aa = cc;
//
//        try {
//            aa.start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        User user = new User();
        user.setSurname("Ivanov1");
        user.setName("Ivan");
        user.setAge(24);
        user.setEmail("Ivanov@gmail.com");
        user.setPhone("0234567890");
        System.out.println(user);

        valid(user);


    }

    public static int handleNegative(int i) throws NegativeValueException {
        if (i >= 0)
            return i;
        throw new NegativeValueException(i);
    }
}
