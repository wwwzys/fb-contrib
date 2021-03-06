package ex;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MUC_Sample {

    public void testMUC() {
        List<String> l = getImmutableList();

        l.add("Uhoh");
    }

    public void testPossiblyMUC() {
        Set<String> s = getPossiblyImmutableSet(Math.random() > 0.5);

        s.add("Yowsers");
    }

    public void testMUCChained() {
        List<String> l = getImmutableListChained();

        l.add("Uhoh");
    }

    public List<String> getImmutableList() {
        return Arrays.asList("foo");
    }

    public Set<String> getPossiblyImmutableSet(boolean b) {
        if (b)
            return Collections.unmodifiableSet(new HashSet<String>());

        return new HashSet<String>();
    }

    public List<String> getImmutableListChained() {
        return getImmutableList();
    }

}
