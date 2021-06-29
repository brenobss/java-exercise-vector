package main;

import entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int rent = sc.nextInt();
        System.out.println();
        Rooms[] rooms = new Rooms[10];

        for(int i = 1; i <= rent; i++){
            sc.nextLine();
            System.out.println("Rent #" + i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rooms[room] = new Rooms(name, email, room);
        }

        for (Rooms room : rooms) {
            if (room != null) {
                System.out.println("Busy rooms: ");
                System.out.println(room.getRoom() + ": " +
                        room.getName() +
                        ", " +
                        room.getEmail());
            }
        }

        sc.close();
    }
}
