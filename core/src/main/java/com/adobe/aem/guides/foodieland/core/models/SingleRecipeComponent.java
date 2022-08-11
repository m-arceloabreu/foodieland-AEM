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
public class SingleRecipeComponent {

    @ValueMapValue(name=PROPERTY_RESOURCE_TYPE)
    @Default(values="No resourceType")
    protected String resourceType;


    @ValueMapValue
    private String recipeName;

    @ValueMapValue
    private String singleRecipeImageReference;

    @ValueMapValue
    private String singleRecipePrepareTime;

    @ValueMapValue
    private String singleRecipeMainIngredient;

    
    public String getRecipeName() {
        return recipeName;
    }

    public String getSingleRecipeImageReference() {
        return singleRecipeImageReference;
    }

    public String getSingleRecipePrepareTime() {
        return singleRecipePrepareTime;
    }

    public String getSingleRecipeMainIngredient() {
        return singleRecipeMainIngredient;
    }










   

    

  
}