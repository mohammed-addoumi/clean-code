package models.enums;

public enum Wood {
    INDIAN,BRAZILIAN;

    public String toString(){
        switch(this){
            case INDIAN: return "indian wood";
            case BRAZILIAN: return "brazilian wood";
        }
        return null;
    }
}
