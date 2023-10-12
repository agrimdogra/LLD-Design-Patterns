package designpatterns.ui5buttons;

public class RoundButton extends Button implements Circumference{
    Double radius;

    @Override
    public Double getCircumference(Double radius) {
        return 3.14*radius*radius;
    }

    public static Builder builder(){
        return new Builder();
    }

    static class Builder{
        Double radius;

        public Builder setRadius(Double radius) {
            this.radius = radius;
            return this;
        }

        public Boolean validate(){
            if (radius > 0)
                return true;
            else
                return false;
        }

        public RoundButton build(){
            if(validate()){
                RoundButton roundButton = new RoundButton();
                roundButton.radius = this.radius;
                return roundButton;
            }
            throw new RuntimeException("Enter a valid radius");
        }
    }


}
