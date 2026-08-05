class Temperature
{
    public static void main(String[] args)
    {
        int temp[] = {30, 32, 31, 29, 33};

        for(int i = 0; i < temp.length; i++)
        {
        	if(temp[i] > 31) 
        	{
            System.out.println("Day " + (i + 1) + " : " + temp[i]);
        	}
        }
    }
}