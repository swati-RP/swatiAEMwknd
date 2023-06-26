package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.Column;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.inject.Named;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Column.class }, resourceType = {
        ColumnImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ColumnImpl implements Column

{
    protected static final String RESOURCE_TYPE = "wknd/components/column";

    @Self
    private SlingHttpServletRequest request;

    @SlingObject
    Resource componentResource;

    @ValueMapValue
    private String title;

    @ValueMapValue
    private String subtitle;

    @ValueMapValue
    private String description;

    @ChildResource
    @Named("feature")
    private Resource featureResource;

    @ValueMapValue
    private String phoneNumber;

    @ValueMapValue
    private String ctaText;

    @ValueMapValue
    private String ctaLink;

    @ValueMapValue
    private String imageCopy;

    @ValueMapValue
    private String button;

    private List<String> feature;

    @Override
    public String getButton() {
        return button;
    }

    @Override
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public String getTitle() {

        return title;
    }

    @Override
    public String getDescription() {

        return description;
    }

    @Override
    public List<String> getFeature() {
        return feature;
    }

    @Override
    public String getPhoneNumber() {

        return phoneNumber;
    }

    @Override
    public String getCtaText() {

        return ctaText;
    }

    @Override
    public String getCtaLink() {

        return ctaLink;
    }

    @Override
    public String getImageCopy() {

        return imageCopy;
    }

        @Override
        public boolean isEmpty() {

            return StringUtils.isBlank(title) && StringUtils.isBlank(subtitle) && StringUtils.isBlank(description)

                    && StringUtils.isBlank(phoneNumber) 
                    && StringUtils.isBlank(ctaText)
                    && StringUtils.isBlank(ctaLink) 
                    && StringUtils.isBlank(imageCopy)
                    && StringUtils.isBlank(button)
                    && StringUtils.isBlank((CharSequence) featureResource);

    }

    private List<Map<String, String>> details = new ArrayList<>();

    public List<Map<String, String>> getMultiDataMap() {

        return details;

    }

    @PostConstruct
    protected void init() {
        if (featureResource != null) {
            feature = new ArrayList<>();
            for (Resource child : featureResource.getChildren()) {
                feature.add(child.getValueMap().get("text", String.class));
            }
        }

    }

}
