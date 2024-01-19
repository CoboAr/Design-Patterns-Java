public class Blurry extends Filter{
    @Override
    public void applyFilter(Image img) {
        System.out.println("Blurry filter was applied to "+img.name);
    }
}
