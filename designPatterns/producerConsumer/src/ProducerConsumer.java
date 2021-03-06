/*
CIS566 W16 presentation: Producer/Consumer Design pattern

purpose: the producer/consumer design pattern attempts to solve the idea of two different threads trying to access
         a buffer (i.e. Queue) concurrently to do their tasks. With the asynchronization the pattern offers with the useage
         of semaphores, the pattern is able to block this concurrent access successfully, regulating the execution of each
         thread as appropriate
 */

import java.util.concurrent.Semaphore;

/**
 *
 * @author hadi7
 */
public class ProducerConsumer
{
    //The Buffer Queue:
    //Stores the items generated by the producer
    public static class bufferQueue
    {
        // Since there has to be at least 1 item in the Queue
        //before the consumer can consume it, the producer must
        //produce first.
        //This is where semaphore comes in, in which we assign
        //a semaphore value of 1 to the producer, meaning start
        //executing first

        static Semaphore producerSemaphore = new Semaphore(1);

        // since the producer has to first produce, and since its
        //sempahore was assigned a value of 1, the consumer has to
        //wait in the meantime, in which a consumer semaphore value of
        //0 is assigned, meaning cant do anything yet

        static Semaphore consumerSemaphore = new Semaphore(0);

        int item; //the item that will be stored in buffer/Queue

        public void putItemInBufferQueue(int item)
        {
            try
            {
                //producer will get the semaphore
                producerSemaphore.acquire();

                this.item=item;

                System.out.println(Thread.currentThread().getName()+ " Producing (in the Queue) item : " + item);

                //allow the consumer to get the semaphore now that an item has been stored in the Queue
                consumerSemaphore.release();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        public void get_item_from_bufferQueue()
        {
            try
            {
                //consumer will get the semaphore
                consumerSemaphore.acquire();

                System.out.println(Thread.currentThread().getName()+ " Consuming (from the Queue) item : " + item);

                //allow the producer to get the semaphore now that an item has been removed from the Queue
                producerSemaphore.release();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    } //end of buffer Queue

    //Producer
    public static class Producer extends Thread
    {
        bufferQueue Queue;

        public Producer(bufferQueue Queue)
        {
            this.Queue=Queue;

            this.setName("Producer is");

            //start producing
            this.start();
        }

        @Override
        public void run()
        {
            for(int i = 1; i < 50; i++) //produce 49 items
            {
                Queue.putItemInBufferQueue(i);
            }
        }
    }

    //Consumer
    public static class Consumer extends Thread
    {
        bufferQueue Queue;

        public Consumer(bufferQueue Queue)
        {
            this.Queue=Queue;

            this.setName("Consumer is");

            //start consuming
            this.start();
        }

        @Override
        public void run()
        {
            for(int i = 1; i < 50; i++) //consume 49 items
            {
                Queue.get_item_from_bufferQueue();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        System.out.println("This program utilizes the producer-consumer ");
        System.out.println("design pattern to solve the concurrency ");
        System.out.println("issues between the producer and consumer ");
        System.out.println("when they try executing at once.");
        System.out.println(" ");

        bufferQueue buffQ = new bufferQueue();
        Producer producer = new Producer(buffQ);
        Consumer consumer = new Consumer(buffQ);
    }
}