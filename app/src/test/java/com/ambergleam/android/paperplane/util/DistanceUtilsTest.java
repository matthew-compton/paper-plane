package com.ambergleam.android.paperplane.util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistanceUtilsTest {

    @Test
    public void testDistanceUtilsForLargeNumber() {
        // 1,200,300ft
        int testDistance = 1200300;
        String expectedDistanceString = "1,200,300 ft";
        String actualDistanceString = DistanceUtils.formatDistance(testDistance);
        assertThat(actualDistanceString).isEqualTo(expectedDistanceString);
    }

    @Test
    public void testDistanceUtilsForMediumNumber() {
        // 1,200ft
        int testDistance = 1200;
        String expectedDistanceString = "1,200 ft";
        String actualDistanceString = DistanceUtils.formatDistance(testDistance);
        assertThat(actualDistanceString).isEqualTo(expectedDistanceString);
    }

    @Test
    public void testDistanceUtilsForSmallNumber() {
        // 320ft
        int testDistance = 320;
        String expectedDistanceString = "320 ft";
        String actualDistanceString = DistanceUtils.formatDistance(testDistance);
        assertThat(actualDistanceString).isEqualTo(expectedDistanceString);
    }

    @Test
    public void testDistanceUtilsForZero() {
        // 0ft
        int testDistance = 0;
        String expectedDistanceString = "0 ft";
        String actualDistanceString = DistanceUtils.formatDistance(testDistance);
        assertThat(actualDistanceString).isEqualTo(expectedDistanceString);
    }

}