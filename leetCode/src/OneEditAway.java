/**
 *
 * Problem: Consider two given strings, q and p. Write a snippet of code that determines whether
 * we can obtain two identical strings by performing a single edit in q or p. More precisely, we can insert, remove,
 * or replace a single character in q or in p, and q will become equal to p.
 *
 *
 *
 *
 * Solution: To better understand the requirements, let's consider several examples:
 *
 * tank, tanc One edit: Replace k with c (or vice versa)
 * tnk, tank One edit: Insert a in tnk between t and n or remove a from tank
 * tank, tinck More than one edit is needed!
 * tank, tankist More than one edit is needed!
 * By inspecting these examples, we can conclude that we are one edit away if the following occurs:
 *
 * The difference in length between q and p is not bigger than 1
 * q and p are different in a single place
 *
 *
 * */

public class OneEditAway {

    public static boolean isOneEditAway(String q, String p) {

    // if the difference between the strings is bigger than 1
        // then they are at more than one edit away
        if (Math.abs(q.length() - p.length()) > 1) {
            return false;
        }
        // get shorter and longer string
        String shorter = q.length() < p.length() ? q : p;
        String longer = q.length() < p.length() ? p : q;
        int is = 0;
        int il = 0;
        boolean marker = false;
        while (is < shorter.length() && il < longer.length()) {
            if (shorter.charAt(is) != longer.charAt(il)) {
                // first difference was found
                // at the second difference we return false
                if (marker) {

                    return false;

                }

                marker = true;

                if (shorter.length() == longer.length()) {

                    is++;

                }
            } else {

                is++;

            }
            il++;
        }
        return true;
    }

}
