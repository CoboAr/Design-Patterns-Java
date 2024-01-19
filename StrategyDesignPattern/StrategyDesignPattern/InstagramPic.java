public class InstagramPic {
    private Filter filter;
    private Image image;
    public InstagramPic(Image img, Filter f){
        this.filter=f;
        this.image = img;
    }
    public void apply(){
        filter.applyFilter(image);
    }

    public void setStrategy(Filter f){
        filter=filter;
    }
}
