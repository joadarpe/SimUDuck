package decorator.base;

/**
 * @author JonathanA.
 */
public abstract class Beverage {

    public enum Size {
        SMALL(0.75f), MEDIUM(1f), LARGE(1.5f);

        private float costCoefficient;

        Size(float ident) {
            this.costCoefficient = ident;
        }

        public float getCostCoefficient() {
            return costCoefficient;
        }
    }

    protected String description = "Unknown Beverage";
    protected Size size;

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
