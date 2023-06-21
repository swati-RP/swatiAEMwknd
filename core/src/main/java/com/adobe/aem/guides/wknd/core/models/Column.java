package com.adobe.aem.guides.wknd.core.models;

import java.util.List;
import java.util.Map;

public interface Column {

    String getTitle();
    String getDescription();
    List<String> getFeature();
    String getPhoneNumber();
    String getCtaText();
    String getCtaLink();
    String getImageCopy();
    String getButton();
    String getSubtitle();
    List<Map<String, String>> getMultiDataMap(); 
}

