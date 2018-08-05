/*
476. Number Complement
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0
*/

//Solution in Java
class Solution {
    private List<Integer> list = new ArrayList<Integer>();
    public int findComplement(int num) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(num != 0)
        {
            list.add(num%2);
            num = num / 2;
        }
        Collections.reverse(list);
        for(int j = 0; j < list.size(); j++)
            list.set(j,1-list.get(j));
        
        for(int j = 0; j < list.size(); j++)
        {
            answer = answer*2 + list.get(j);
        }
        return answer;
    }
}
