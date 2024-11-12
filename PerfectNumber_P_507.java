class PerfectNumber_P_507{
    public boolean checkPerfectNumber(int num) {
        if(num==0 || num==1){
            return false;
        }
        int fac= 0;
        for(int i = 1; i<num ; i++ ){
            if(num%i==0){
                fac = fac+i;
            }

        }
        if(num==fac){
            return true;
        }
        else{
            return false;
        }
        
    }
}