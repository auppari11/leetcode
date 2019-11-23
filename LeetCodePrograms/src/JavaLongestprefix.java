/*Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:
*/

public class JavaLongestprefix {
public String longestCommonPrefix(String[] strs) {
if(strs==null|| strs.length==0) return "";
String pre=strs[0];
int i=1;
System.out.println(pre);
while (i<strs.length)
{
	System.out.println(strs[i].indexOf(pre));

	while(strs[i].indexOf(pre)!=0)
	{
		pre=pre.substring(0, pre.length()-1);
		System.out.println(pre);
	}
	i++;
}
return pre;
        	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaLongestprefix lp=new JavaLongestprefix();
		String newval= "";
		String s[]={"flower","flow","flight"};
		newval=lp.longestCommonPrefix(s);
		System.out.println(newval);

	}

}
