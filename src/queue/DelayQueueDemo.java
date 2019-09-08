package queue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {

    public static void main(String[] args) {
        DelayedPerson marlon = new DelayedPerson("Marlon", 10);
        DelayedPerson diana = new DelayedPerson("Diana", 7);
        DelayedPerson roger = new DelayedPerson("Roger", 9);
        DelayedPerson luvier = new DelayedPerson("Luvier", 2);
        DelayedPerson luz = new DelayedPerson("Luz Adriana", 5);

        DelayQueue<DelayedPerson> delayQueue = new DelayQueue<>();
        delayQueue.add(marlon);
        delayQueue.add(diana);
        delayQueue.add(roger);
        delayQueue.add(luvier);
        delayQueue.add(luz);
        System.out.println(delayQueue);

        System.out.println("Polling: " + delayQueue.poll());
        System.out.println(delayQueue);
        System.out.println("Polling: " + delayQueue.poll());
        System.out.println(delayQueue);
        System.out.println("Polling: " + delayQueue.poll());
        System.out.println(delayQueue);
        System.out.println("Polling: " + delayQueue.poll());
        System.out.println(delayQueue);
        System.out.println("Polling: " + delayQueue.poll());
        System.out.println(delayQueue);

    }

    static class DelayedPerson implements Delayed {

        private String name;
        private long time;

        DelayedPerson(String name, long delayTime) {
            this.name = name;
            this.time = System.currentTimeMillis() + delayTime;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long diff = time - System.currentTimeMillis();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed object) {
            return Long.compare(this.time, ((DelayedPerson) object).time);
        }

        @Override
        public String toString() {
            return String.format("{name=%s, time=%d}", name, time);
        }
    }

}
