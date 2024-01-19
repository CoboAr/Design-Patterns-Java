public class Green extends Filter{
    @Override
    public void applyFilter(Image img) {
        System.out.println("Green filter was applied to "+img.name);    }
}
