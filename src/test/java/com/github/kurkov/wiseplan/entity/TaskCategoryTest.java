package com.github.kurkov.wiseplan.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Aleksey Kurkov. Created on 12.02.2017
 * @version 1.0
 */
class TaskCategoryTest {

    @Test
    @DisplayName("Check toString method")
    void checkToStringMethod() {
        String expected = "1";
        TaskCategory category = TaskCategory.FIRST;
        String actual = category.toString();
        Assertions.assertEquals(expected, actual);
    }
}