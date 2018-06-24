class AI
{
    int aimove(char []data)
    {
        Data dataobj = new Data();
        if((Data.count == 0) || (Data.count == 1))
        {            
            if(data[4] == '-')
            {
                return 4;
            }

            else
            {
                return 0;
            }
        }

        else
        {
            int c;
           
            if((c = dataobj.checkwin('0')) != -1)
            {
                return c;
            }

            else if((c = dataobj.checkwin('X')) != -1)
            {
                return c;
            }
            
            else
            {
                for(int i = 2; i < 9; i++)
                {
                    if(data[i] == '-')
                    {
                        return i;
                    }
                }
            }

        return 1;
        }
    }
}