package services.contract_service;

import models.booking.Booking;
import models.contract.Contract;
import models.person.Customer;
import services.booking_service.BookingServiceImpl;

import java.io.File;
import java.util.*;

import static services.contract_service.ReadContractData.readFileContract;
import static services.contract_service.WriteContractData.writeFileContract;

public class ContractServiceImpl implements ContractService {
    static Scanner scanner = new Scanner(System.in);
    public static final String CONTRACT_PATH = "src/data/contract.csv";
    List<Contract> contractList = readFileContract(CONTRACT_PATH);



    @Override
    public void add() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();

            System.out.println("Making contract for Booking with info: " + booking.toString());
            System.out.println("Making contract for Customer with info: " + customer.toString());
            System.out.println("Input id of contract: ");
            int idContract = Integer.parseInt(scanner.nextLine());
            System.out.println("Input deposit: ");
            double deposit = Double.parseDouble(scanner.nextLine());
            System.out.println("Input id of Booking: ");
            int idBooking = Integer.parseInt(scanner.nextLine());
            System.out.println("Input total Pay: ");
            double totalPay = Double.parseDouble(scanner.nextLine());
            System.out.println("Input id of Customer: ");
            int IdCustomer = Integer.parseInt(scanner.nextLine());

            Contract contract = new Contract(idContract, idBooking, deposit, totalPay, IdCustomer);
            contractList.add(contract);
            System.out.println("Complete!");
        }
        File file = new File(CONTRACT_PATH);
        file.delete();
        writeFileContract(contractList, CONTRACT_PATH, true);
    }

    @Override
    public void display() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void edit() {
        ContractService.super.edit();
    }

    @Override
    public void delete() {
        ContractService.super.delete();
    }
}
