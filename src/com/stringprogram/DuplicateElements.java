package com.stringprogram;

class DuplicateElements
{
    public static void main(String[] args) 
    {   

        String str ="gayatrigagli";
        char[] ch = str.toCharArray();
        int i=0,j=0;
        for(i=0;i<ch.length;i++)
        {
            int count = 0 ;
            for( j =1;j<ch.length;j++)
            {//      4          6 , 8 , 10
                if(ch[i] == ch[j] )                                           
                {
                    count++;
                }
                if(count > 0)           
                {
                    System.out.println("character  " +ch[i]+ " count " +count );
                }
            }
            


        }



    }
}