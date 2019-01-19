package com.test.user.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@JsonAutoDetect
public class ApiFunctionApi implements Serializable
{

    private String apiId;
    private String apiName;
    private String apiService;
    private String apiDescribe;
    private String apidbFlag;
    private String apiMethod;
    private String apiDc;
    private String apiObjectType;
    private String apiCreatedDate;
    private String apiCreatedBy;
    private String groupFlag;
    private String mcPlatform;
    private String apiStatus;
    private String appId;
    private String serviceAliasIn;
    private String appName;
    private String location;
    private String apiModifiedTime;
    private String lastUpdateBy;
    private String returnFormat;
    private String apiVersion;

}
