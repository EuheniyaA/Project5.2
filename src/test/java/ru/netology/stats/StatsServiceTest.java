package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long [] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(managerSales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        long [] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAvg(managerSales);
        assertEquals(expected,actual);
    }


    @org.junit.jupiter.api.Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long [] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = (int) service.maxSales(managerSales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long [] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = (int) service.minSales(managerSales);
        assertEquals(expected,actual);
    }


    @org.junit.jupiter.api.Test
    void shouldBelowAvg() {
        StatsService service = new StatsService();
        long [] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = (int) service.belowAvg(managerSales);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAboveAvg() {
        StatsService service = new StatsService();
        long [] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = (int) service.aboveAvg(managerSales);
        assertEquals(expected,actual);
    }

}

