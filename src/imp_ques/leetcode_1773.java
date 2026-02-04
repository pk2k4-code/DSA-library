/*You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
        color, and name of the ith item. You are also given a rule represented by two strings, ruleKey
        and ruleValue.
        The ith item is said to match the rule if one of the following is true:

        ruleKey == "type" and ruleValue == typei.
        ruleKey == "color" and ruleValue == colori.
        ruleKey == "name" and ruleValue == namei.
        Return the number of items that match the given rule.

Example:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]],
 ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and
 ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */





package imp_ques;
import java.util.List;
public class leetcode_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i;
        int count = 0;
        if(ruleKey.equals("type")) i = 0;
        else if(ruleKey.equals("color")) i = 1;
        else i = 2;

        for(int k = 0; k<items.size(); k++){
            if((items.get(k).get(i)).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}
