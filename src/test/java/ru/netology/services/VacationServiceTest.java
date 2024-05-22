package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class VacationServiceTest {

        @Test
        public void testVacationCount() {
            VacationService vacationService = new VacationService();

            // Первый сценарий из задания
            assertEquals(3, vacationService.calculate(10000, 3000, 20000));

            // Второй сценарий из задания
            assertEquals(2, vacationService.calculate(100000, 60000, 150000));
        }
    }
