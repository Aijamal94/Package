package ru.netology.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    public void testVacationCount(int income, int expenses, int threshold, int expected) {
        VacationService vacationService = new VacationService();
        assertEquals(expected, vacationService.calculate(income, expenses, threshold));
    }
}

