public class Cup {
    private String liquidType;
    private int percentFilled;

    public Cup(String liquidType, int percentFilled){
        this.liquidType = liquidType;
        this.percentFilled = percentFilled;
    }

    public String getLiquidType(){
        return liquidType;
    }

    public void setLiquidType(String liquidType){
        this.liquidType = liquidType;
    }

    public int getPercentFilled(){
        return percentFilled;
    }

    public void setPercentFilled(int percentFilled){
        this.percentFilled = percentFilled;
    }
}
