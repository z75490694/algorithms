package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WHZ on 2017/7/3.
 */
public class RestoreIpAddresses  {
    public ArrayList<String> restoreIpAddresses(String s) {

        // we need between 4 and 12 digits
        if (s.length() < 4 || s.length() > 12) {
            return new ArrayList<String>();
        }

        final ArrayList<String> addresses = new ArrayList<String>();
        helper(s, 0, 0, addresses);
        return addresses;
    }

    private void helper(final String s, final int position, final int section, final List<String> addresses) {

        int numRemainingCharacters = s.length() - position;
        int maxSectionLength = Math.min(3, numRemainingCharacters - (1 * (3 - section)));
        int minSectionLength = Math.max(1, numRemainingCharacters - (3 * (3 - section)));

        for (int length = minSectionLength; length <= maxSectionLength; ++length) {

            if (!isValidIpAddressSectionValue(s.substring(position, position + length))) {
                // dead end
                continue;
            } else if (section == 3) {
                // if we got this far, we have a valid IP address
                addresses.add(s);
            } else {
                // add a dot to the end of this section
                String dotted = s.substring(0, position + length) + "." + s.substring(position + length);
                // move on to the next section
                helper(dotted, position + length + 1, section + 1, addresses);
            }
        }
    }

    private boolean isValidIpAddressSectionValue(final String value) {
        // no leading zeroes except for 0 itself and must be less than 256
        return (value.charAt(0) != '0' || value.length() == 1) && Integer.parseInt(value) < 256;
    }
}
