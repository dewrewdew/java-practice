package test1023;

import java.util.*;

public class Repository {
    private final List<TransactionDto> transactions;
    public Repository() {
        this.transactions = new ArrayList<>();
    }

    private static long nextId = 1;

    public static long getNextId() {
        return nextId;
    }

    public static void incrementNextId() {
        nextId++;
    }

    // Create
    public TransactionDto save(TransactionDto dto) {
        transactions.add(dto);
        return dto;
    }

    // Read All
    public List<TransactionDto> findAll() {
        return new ArrayList<>(transactions);
    }

    // Delete
    public boolean deleteById(long id) {
        for(int i = 0 ; i < transactions.size() ; i++) {
            TransactionDto dto = transactions.get(i);
            if(dto.getId() == id) {
                transactions.remove(i);
                return true;
            }
        }
    return false;
    }

}
