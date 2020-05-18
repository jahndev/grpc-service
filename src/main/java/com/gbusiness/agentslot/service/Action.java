package com.gbusiness.agentslot.service;

/**
 * This simulates the real interface that must be implemented for each rpc action in our proto definition
 * @param <T>
 * @param <R>
 */
@FunctionalInterface
public interface Action<T, R> {
    R execute(T input);
}
