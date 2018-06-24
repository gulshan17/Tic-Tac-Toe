class Data
{
    private static char[] data = new char[9];
    static int count;

    int setdata(int index,int id)
    {
        if(data[index] == '-')
        {
            if(id == 0)
            {
                data[index] = '0';
                count++;
            }

            else
            {
                data[index] = 'X';
                count++;
            }
            
            return 1;
        }

        return 0;
    }

    void resetdata()
    {
        for(int i = 0; i < 9; i++)
        {
            data[i] = '-';
        }
        
        count = 0;
    }
    
    char [] returndata()
    {
        return data;
    }

    int checkwin(char c)
    {
        int count,index;
        
        /*Checking for win in horizontal direction*/
        for(int i = 0; i < 9; i += 3)
        {
            count = 0;
            index = -1;            
                        
            for(int j = i, k = i + 2; j <= k; j++)
            {
                if(data[j] == c)
                {
                    count++;
                }
        
                else if(data[j] == '-')
                {
                    index = j;
                }
            }
            
            if((count == 2) && (index != -1))
            {
                return index;
            }
        }

        /*checking for win in vertical direction*/        
        for(int i = 0; i < 3; i++)
        {
            count = 0;
            index = -1;            
                        
            for(int j = i, k = i + 6; j <= k; j += 3)
            {
                if(data[j] == c)
                {
                    count++;
                }
        
                else if(data[j] == '-')
                {
                    index = j;
                }
            }
            
            if((count == 2) && (index != -1))
            {
                return index;
            }
        }

        /*checking win in diagonal direction*/        
        for(int i = 0; i < 3; i += 2)
        {
            count = 0;
            index = -1;            
                        
            if(i == 0)
            {
                for(int j = i; j < 9; j += 4)
                {
                    if(data[j] == c)
                    {
                       count++;
                    }
            
                    else if(data[j] == '-')
                    {
                        index = j;
                    }
                }
            }

            else
            {
                for(int j = i; j < 7; j += 2)
                {
                    if(data[j] == c)
                    {
                        count++;
                    }
            
                    else if(data[j] == '-')
                    {
                        index = j;
                    }
                }
            }
            
            if((count == 2) && (index != -1) )
            {
                return index;
            }
        }

        /*if all the above cases failed*/
        return -1;
        
    }

    boolean checkwinner(int index)
    {
        /*checking winnner in diagonals*/
        if( (index == 0) || (index == 4) || (index == 8) )
        {
            if( (data[4] == data[0]) && (data[4] == data[8]) )
            {
                return true;
            }
        }
        
        if( (index == 2) || (index == 4) || (index == 6) )
        {
            if( (data[4] == data[2]) && (data[4] == data[6]) )
            {
                return true;
            }
        }

        /*checking winner in horizontal direction*/
        if( (index == 0) || (index == 1) || (index == 2) )
        {
            if( (data[1] == data[0]) && (data[1] == data[2]) )
            {
                return true;
            }
        }
        
        if( (index == 3) || (index == 4) || (index == 5) )
        {
            if( (data[4] == data [3]) && (data[4] == data[5]) )
            {
                return true;
            }
        }

        if( (index == 6) || (index == 7) || (index == 8) )
        {
            if( (data[7] == data[6]) && (data[7] == data[8]) )
            {
                return true;
            }
        }

        /*checking winner in vertical direction*/
        if( (index == 0) || (index == 3) || (index == 6) )
        {
            if( (data[3] == data[0]) && (data[3] == data[6]) )
            {
                return true;
            }
        }
        
        if( (index == 1) || (index == 4) || (index == 7) )
        {
            if( (data[4] == data[1]) && (data[4] == data[7]) )
            {
                return true;
            }
        }
        
        if( (index == 2) || (index == 5) || (index == 8) )
        {
            if( (data[5] == data[2]) && (data[5] == data[8]) )
            {
                return true;
            }
        }
    
        return false;
    }
}