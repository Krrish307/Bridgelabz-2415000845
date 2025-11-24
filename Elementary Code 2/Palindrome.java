if(input1 < 0 && input1 % 2 == 0)
            return 2;

        
        if(input1 > 0 && input1 % 2 != 0)
            return 1;

        
        if(input1 > 0 && input1 % 2 == 0)
            return 0;

        
        if(input1 < 0 && input1 % 2 != 0)
            return 1;  

        return 0;
		
	}