public class DigitalVideoDisc{
    private String title;
    private float cost;
    private String category;
    private float length;
    private String director;
    
    
    public DigitalVideoDisc(String title)
    {
        super();
        this.title=title;
    }
   
    public DigitalVideoDisc(String category,String title,float cost)
    {
        super();
        this.category=category;
        this.title=title;
        this.cost=cost;
    }
    
    public DigitalVideoDisc(String title, String category, String director,float cost)
    {
        super();
        this.title=title;
        this.cost=cost;
        this.director=director;
        this.category=category;
    }
    
    public DigitalVideoDisc(String title, String category, String director,float length,float cost)
    {
        super();
        this.title=title;
        this.cost=cost;
        this.length=length;
        this.director=director;
        this.category=category;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String nTitle)
    {
        this.title=nTitle;
    }
   
    public float getCost()
    {
        return cost;
    }
    
    public void getCost(float nCost)
    {
        this.cost=nCost;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public void setCategory(String nCategory)
    {
        this.category=nCategory;
    }
    
    public String getDirector()
    {
        return this.director;
    }
    
    public void setDirector(String ndirector)
    {
        this.director = ndirector;
    }
    
    public float getLength()
    {
        return this.length;
    }
    
    public void setLength(float Length)
    {
        this.length= Length;
    }
}