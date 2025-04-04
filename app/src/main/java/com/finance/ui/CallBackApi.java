package com.finance.ui;

public interface CallBackApi<T> {
    void doError(Throwable throwable);
    void doSuccess();
    default void doSuccess(T object) {
        doSuccess();
    }
}
