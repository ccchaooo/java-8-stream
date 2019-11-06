import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * @author dengchao
 * 2019/9/11 23:28
 */
public class CollectorsDemoTest {
    private List<String> strings;

    @Before
    public void setUp() {
        strings = Arrays.asList("a", "bb", "ccc", "ddd");
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

}