package ru.otus.grpc;

import io.grpc.stub.StreamObserver;

public class TestServiceImpl extends TestServiceGrpc.TestServiceImplBase {
    @Override
    public void test(TestRequest request, StreamObserver<TestResponse> responseObserver) {
        TestResponse response = TestResponse.newBuilder()
                .setGreeting(request.getFirstName() +  "-" + request.getLastName())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
