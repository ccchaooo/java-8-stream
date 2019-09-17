import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * @author dengchao
 * @date 2019/9/11 23:28
 */
public class CollectorsDemoTest {
    private List<String> strings;

    @Before
    public void setUp() {
        strings = Arrays.asList("a", "bb", "ccc", "ddd");
    }

    @Test
    public void toList() {
        List<Integer> lengthList = strings
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
        assertEquals(1, (int) lengthList.get(0));
        assertEquals(2, (int) lengthList.get(1));
        assertEquals(3, (int) lengthList.get(2));
        assertEquals(4, (int) lengthList.get(3));
    }

    @Test
    public void toSet() {
        Set<Integer> stringSet = this.strings
                .stream()
                .map(String::length)
                .collect(Collectors.toSet());
        assertEquals(3, stringSet.size());
    }

    @Test
    public void joining() {
        String joinedString = this.strings
                .stream().collect(Collectors.joining());
        assertEquals("abbcccddd", joinedString);
    }

    @Test
    public void joining_with_delimiter() {
        CharSequence delimiter = "---";
        String joinedString = this.strings
                .stream().collect(Collectors.joining(delimiter));
        assertEquals("a---bb---ccc---ddd", joinedString);
    }


    @Test
    public void joining_with_delimiter_prefix_suffix() {
        CharSequence delimiter = "---";
        CharSequence prefix = "begin->";
        CharSequence suffix = "->end";
        String joinedString = this.strings
                .stream().collect(Collectors.joining(delimiter, prefix, suffix));
        assertEquals("begin->a---bb---ccc---ddd->end", joinedString);
    }

    @Test
    public void mapping() {
        this.strings
                .stream().collect(Collectors.mapping(String::length),Integer.class);
    }


}