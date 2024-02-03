package hashing;

import org.junit.jupiter.api.Test;

import static hashing.Intersection.intersect;
import static org.junit.jupiter.api.Assertions.*;

class IntersectionTest {

    @Test
    void itShouldMain() {
        //Given
        int[] a = {10,15,20,25,30,50};
        int[] b = {30,5,15,80};
        //When
        intersect(a,b);
        //Then
    }
}