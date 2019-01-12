// changes required
class elimination
{
    public static void main(String[] args)
    {
        String main = "i an studing DCDR in lab";
        int length=1;
        for (int i = 0; i < main.length(); i++) 
        {
            if(main.charAt(i)==' ')
            {
                length++;
            }    
        }
        String s[] = {"is","are","at","the","in"};
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<=length+1;i++)
        {
            if(main.toLowerCase().contains(s[i].toLowerCase()))
            {
                System.out.println("false");
            }
            else
            {
                System.out.println("true");
            }
        }
    }
}