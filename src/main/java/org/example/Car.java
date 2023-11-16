package org.example;

public class Car {
    Integer carModal;
    Engine engine;

public void setCarModel(Integer model){
    this.carModal  = model;
}

public void setEngine(Engine engine){
    this.engine = engine;
}

public void work(){
    engine.work();
}
}
