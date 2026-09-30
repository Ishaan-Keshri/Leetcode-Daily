class Solution {
    public String reverseByType(String s) {
        char[] arr=s.toCharArray();
        ArrayList<Character> letter=new ArrayList<>();
        ArrayList<Character> special=new ArrayList<>();
        for(char i:arr)
        {
            if(i>='a' && i<='z')
            {
                letter.add(i);
            }
            else{
                special.add(i);
            }
        }
        Collections.reverse(letter);
        Collections.reverse(special);
        int l=0,sp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                arr[i]=letter.get(l++);
            }
            else{
                arr[i]=special.get(sp++);
            }
        }
        return String.valueOf(arr);
    }
}