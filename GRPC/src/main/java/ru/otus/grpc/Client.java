package ru.otus.grpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
                .usePlaintext()
                .build();

        TestServiceGrpc.TestServiceBlockingStub stub
                = TestServiceGrpc.newBlockingStub(channel);

        TestResponse helloResponse = stub.test(TestRequest.newBuilder()
                .setFirstName("First")
                .setLastName("Second")
                .build());

        System.out.println(helloResponse.getGreeting());

        channel.shutdown();
    }
}
