package ru.netology.services;

public class VacationService {


        public int calculate(int income, int expenses, int threshold) {
            int count = 0; // счётчик месяцев отдыха
            int money = 0; // количество денег на счету

            for (int month = 0; month < 12; month++) {
                if (money >= threshold) { // можем ли отдыхать?
                    count++; // увеличиваем счётчик месяцев отдыха
                    money -= expenses; // уменьшаем остаток на траты на отдых
                    money /= 3; // уменьшаем остаток еще в три раза
                } else {
                    money += income - expenses; // доход за вычетом расходов
                }
            }

            return count;
        }
    }







