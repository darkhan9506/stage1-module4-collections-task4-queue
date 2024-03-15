package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> priorityQueue =
                new PriorityQueue<>((o1, o2) -> -o1.compareTo(o2));

        for (String s : firstList) {
            priorityQueue.add(s);
        }
        for (String s : secondList) {
            priorityQueue.add(s);
        }

        return priorityQueue;
    }
}
