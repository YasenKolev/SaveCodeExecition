package main;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
@Scope("singleton")
public class RequestExecutionQueue {

    private LinkedList executionQueue = new LinkedList<>();

}
