package ci583.labs.test;
import org.junit.Test;
import static org.junit.Assert.*;
import ci583.labs.lists.Set;

//Finlay Watling

public class SetTest {

    @Test
    public void testDupes () {
        Set s = new Set();
        s.insert(1);
        s.insert(1);
        assertEquals(s.length(), 1);
    }

    @Test
    public void insertTest(){
        Set s = new Set();
        s.insert(3);
        s.insert(4);
        assertTrue(s.member(3));
        assertFalse(s.member(5));
    }

    @Test
    public void unionTest(){
        Set s1 = new Set();
        Set s2 = new Set();
        s1.insert(3);
        s1.insert(4);
        s1.insert(7);
        s2.insert(6);
        s2.insert(7);
        s2.insert(8);
        assertEquals(s1.union(s2).length(), 5);
    }

    @Test
    public void intersectionTest(){
        Set s1 = new Set();
        Set s2 = new Set();
        s1.insert(3);
        s1.insert(6);
        s2.insert(3);
        s2.insert(8);
        assertFalse(s1.intersection(s2).member(8));
        assertTrue(s1.intersection(s2).member(3));
    }

    @Test
    public void differenceTest(){
        Set s1 = new Set();
        Set s2 = new Set();
        s1.insert(1);
        s1.insert(3);
        s1.insert(5);
        s2.insert(2);
        s2.insert(3);
        s2.insert(4);
        s2.insert(5);
        assertTrue(s1.difference(s2).member(1));
        assertFalse(s1.difference(s2).member(3));
    }

}
