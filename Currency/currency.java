class currency{
    private double usd;
    private double euro;
    private double jpy;
    private double pound;
    private double Aud;

    public void setusd(double usd){
        this.usd = usd;
    }
    public void seteuro(double euro){
        this.euro = euro;
    }
    public void	setjpy(double jpy){
        this.jpy = jpy;
    }
    public void setpound(double pound){
        this.pound = pound;
    }
    public void setAud(double Aud){
        this.Aud = Aud;
    }
    public double getusd(){
        return usd;
    }
    public double geteuro(){
        return euro;
    }
    public double getjpy(){
        return jpy;
    }
    public double getpound(){
        return pound;
    }
    public double getAud(){
        return Aud;
    }

}