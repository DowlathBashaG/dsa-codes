package io.dowlath.design_pattern.Observer;

public interface Subject {
public void registerObservers(Observer observer);
public void removeRegister(Observer observer);
public void notifyObservers();
}
