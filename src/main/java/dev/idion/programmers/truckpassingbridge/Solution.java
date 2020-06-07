package dev.idion.programmers.truckpassingbridge;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        int time = 0;
        int totalWeight = 0;
        Queue<Truck> bridge = new LinkedList<>();
        Queue<Truck> truckQueue = new LinkedList<>();

        // 대기열(Queue)에 truck 추가
        for (int truckWeight : truckWeights) {
            truckQueue.offer(new Truck(truckWeight, 0));
        }

        while (!truckQueue.isEmpty() || !bridge.isEmpty()) {
            time++; // 진입시간 (루프 마다 1초씩 진행된다.)
            // 다리가 비어있지 않고, 현재시간 - 다리에 진입한 시간이 다리의 길이보다 크거나 같다면(지나갔다면)
            // 다리에서 트럭을 꺼내고 다리의 무게에서 트럭의 무게를 뺀다.
            if (!bridge.isEmpty() && time - bridge.peek().entryTime >= bridgeLength) {
                totalWeight -= bridge.poll().weight;
            }

            // 대기열이 있고, 제한 무게보다 다리위의 무게 + 올라갈 트럭의 무게가 적다면...
            // 대기열에서 트럭을 꺼내서 다리위의 무게에 더한 후, 진입 시점의 시간을 저장하고 다리에 올린다.
            if (!truckQueue.isEmpty() && totalWeight + truckQueue.peek().weight <= weight) {
                Truck truck = truckQueue.poll();
                totalWeight += truck.weight;

                truck.entryTime = time;
                bridge.offer(truck);
            }
        }
        return time;
    }


    private static class Truck {
        private int weight;
        private int entryTime;

        public Truck(int weight, int entryTime) {
            this.weight = weight;
            this.entryTime = entryTime;
        }
    }
}
