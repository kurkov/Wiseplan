package com.github.kurkov.wiseplan.entity;

/**
 * @author Aleksey Kurkov. Created on 12.02.2017
 * @version 1.0
 */
public enum TaskCategory {
    FIRST(1), SECOND(2), THIRD(3), FOURTH(4);

    private int taskCategory;

    TaskCategory(int i) {
        taskCategory = i;
    }

    @Override
    public String toString() {
        return String.valueOf(taskCategory);
    }
}
