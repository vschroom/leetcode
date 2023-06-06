package ru.chernov.algorythms;

import java.util.*;

public class GraphAndQueue {

    private static final String OWNER = "Sam";
    private static final String PETER = "Peter";
    private static final String TONY = "Tony";
    private static final String BEN = "Ben";
    private static final String CODY = "Cody";
    private static final String CONOR = "Conor";
    private static final String CRIS = "Cris";
    private static final String BRUCE = "Bruce";
    private static final String TARGET = "Alexander";


    private static final Map<String, Deque<String>> DEQUE_MAP = Map.of(
            OWNER, new ArrayDeque<>(List.of(BEN, TONY, PETER)),
            BEN, new ArrayDeque<>(List.of(OWNER, TONY, PETER, CODY, CONOR)),
            TONY, new ArrayDeque<>(List.of(BEN, OWNER, PETER, BRUCE, CRIS)),
            PETER, new ArrayDeque<>(List.of(BEN, TONY, OWNER)),
            CODY, new ArrayDeque<>(List.of(BEN)),
            CONOR, new ArrayDeque<>(List.of(BEN)),
            BRUCE, new ArrayDeque<>(List.of(TONY)),
            CRIS, new ArrayDeque<>(List.of(TONY, TARGET)),
            TARGET, new ArrayDeque<>()
    );

    public String findSellerFor(String name) {
        Deque<String> searchQueue = DEQUE_MAP.get(name);
        List<String> cheked = new ArrayList<>();
        while (!searchQueue.isEmpty()) {
            String friend = searchQueue.pop();
            if (!cheked.contains(friend)) {
                if (friend.contains("Alex")) {
                    return friend;
                } else {
                    cheked.add(friend);
                    searchQueue = new ArrayDeque<>(searchQueue);
                    Deque<String> deque = DEQUE_MAP.get(friend);
                    searchQueue.addAll(deque);
                }
            }
        }

        return "Seller not found";
    }
}
