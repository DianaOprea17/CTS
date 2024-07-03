package factorymethod;

public class EconomyFactory implements NewsArticleFactory{
    @Override
    public NewsArticle createArticle() {
        return new EconomyNews();
    }
}
