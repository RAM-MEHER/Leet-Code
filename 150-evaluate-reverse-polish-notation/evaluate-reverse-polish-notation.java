class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        int len = tokens.length , val1 = 0 , val2 = 0 , p = -1;
        int arr[] = new int[len/2+1];

        for(int i = 0 ; i < len ; i++)
        {
            switch(tokens[i])
            {
                case "+":
                    val1 = arr[p--];
                    val2 = arr[p--];
                    arr[++p] = val1+val2;
                    break;
                case "-":
                    val1 = arr[p--];
                    val2 = arr[p--];
                    arr[++p] = val2-val1;
                    break;
                case "*":
                    val1 = arr[p--];
                    val2 = arr[p--];
                    arr[++p] = val1*val2;
                    break;
                case "/":
                    val1 = arr[p--];
                    val2 = arr[p--];
                    arr[++p] = val2/val1;
                    break;
                default :
                    arr[++p] = Integer.parseInt(tokens[i]);

            }
        }
        return arr[0];
    }
}