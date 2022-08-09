package com.adobe.aem.guides.foodieland.core.models;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

import java.util.Date;
import java.util.Optional;

@Model(adaptables = Resource.class,  defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
public class HeroComponent {

    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE)
    @Default(values="No resourceType")
    protected String resourceType;



   

    @ValueMapValue
    private String title;
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String prepareTime;
    @ValueMapValue
    private String mainIngredient;
    @ValueMapValue
    private boolean hotRecipe;

    @ValueMapValue
    private String author;
    @ValueMapValue
    private Date date;

    @ValueMapValue
    private String authorImageReference;
    @ValueMapValue
    private String mainImageReference;

    

   /*
     @ScriptVariable
    protected Resource resource;
    private String imgPath;


    @PostConstruct
    private void initModel() {
        imgPath = fileReference;
        if ((imgPath == null) && (resource != null)) {
            Resource res = resource.getChild("file");
            if (res != null) {
                imgPath = res.getPath();
            }
        }
    } 


      public String getImgPath(){
        return this.imgPath;
    }

    */

  

    public String getTitle(){
        return this.title;
    }
    public String getText(){
        return this.text;
    }
    public String getPrepareTime(){
        return this.prepareTime;
    }

    public String getMainIngredient(){
        return this.mainIngredient;
    }
    public Boolean getHotRecipe(){
        return this.hotRecipe;
    }

    public String getAuthor(){
        return this.author;
    }
    public String getAuthorImageReference(){
        return this.authorImageReference;
    }
    public Date getDate(){
        return this.date;
    }
    public String getMainImageReference(){
        return this.mainImageReference;
    }


    



}