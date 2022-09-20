# ehelply-java-sdk

eHelply SDK - 1.1.109
- API version: 1.1.109
  - Build date: 2022-09-20T20:41:14.551218Z[Etc/UTC]

eHelply SDK for SuperStack Services

  For more information, please visit [https://superstack.ehelply.com/support](https://superstack.ehelply.com/support)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.ehelply</groupId>
  <artifactId>ehelply-java-sdk</artifactId>
  <version>1.1.109</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'ehelply-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'ehelply-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.ehelply:ehelply-java-sdk:1.1.109"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ehelply-java-sdk-1.1.109.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import com.ehelply.client.ApiClient;
import com.ehelply.client.ApiException;
import com.ehelply.client.Configuration;
import com.ehelply.client.models.*;
import com.ehelply.client.api.AppointmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.prod.ehelply.com");

    AppointmentsApi apiInstance = new AppointmentsApi(defaultClient);
    String appointmentUuid = "appointmentUuid_example"; // String | 
    String entityUuid = "entityUuid_example"; // String | 
    String xAccessToken = "xAccessToken_example"; // String | 
    String xSecretToken = "xSecretToken_example"; // String | 
    String authorization = "authorization_example"; // String | 
    String ehelplyActiveParticipant = "ehelplyActiveParticipant_example"; // String | 
    String ehelplyProject = "ehelplyProject_example"; // String | 
    String ehelplyData = "ehelplyData_example"; // String | 
    try {
      Boolean result = apiInstance.addEntityToAppointment(appointmentUuid, entityUuid, xAccessToken, xSecretToken, authorization, ehelplyActiveParticipant, ehelplyProject, ehelplyData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppointmentsApi#addEntityToAppointment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.prod.ehelply.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppointmentsApi* | [**addEntityToAppointment**](docs/AppointmentsApi.md#addEntityToAppointment) | **POST** /appointments/appointments/{appointment_uuid}/entities/{entity_uuid} | Addentitytoappointment
*AppointmentsApi* | [**createAppointment**](docs/AppointmentsApi.md#createAppointment) | **POST** /appointments/appointments | Createappointment
*AppointmentsApi* | [**deleteAppointment**](docs/AppointmentsApi.md#deleteAppointment) | **DELETE** /appointments/appointments/{appointment_uuid} | Deleteappointment
*AppointmentsApi* | [**detachEntityFromAppointment**](docs/AppointmentsApi.md#detachEntityFromAppointment) | **DELETE** /appointments/appointments/{appointment_uuid}/entities/{entity_uuid} | Removeentityfromappointment
*AppointmentsApi* | [**getAppointment**](docs/AppointmentsApi.md#getAppointment) | **GET** /appointments/appointments/{appointment_uuid} | Getappointment
*AppointmentsApi* | [**searchAppointment**](docs/AppointmentsApi.md#searchAppointment) | **GET** /appointments/appointments | Searchappointments
*AppointmentsApi* | [**searchAppointmentEntities**](docs/AppointmentsApi.md#searchAppointmentEntities) | **GET** /appointments/appointments/{appointment_uuid}/entities | Searchappointmententities
*AppointmentsApi* | [**searchEntityAppointments**](docs/AppointmentsApi.md#searchEntityAppointments) | **GET** /appointments/appointments/entities/{entity_uuid}/appointments | Getentityappointments
*AppointmentsApi* | [**updateAppointment**](docs/AppointmentsApi.md#updateAppointment) | **PUT** /appointments/appointments/{appointment_uuid} | Updateappointment
*BillingApi* | [**createBillingAccount**](docs/BillingApi.md#createBillingAccount) | **POST** /sam/billing/create_billing_account | Createbillingaccount
*BillingApi* | [**getClientSecret**](docs/BillingApi.md#getClientSecret) | **GET** /sam/billing/retrieve_secret | Getclientsecret
*BillingApi* | [**hasPayment**](docs/BillingApi.md#hasPayment) | **GET** /sam/billing/has_payment | Haspayment
*BillingApi* | [**listPaymentMethods**](docs/BillingApi.md#listPaymentMethods) | **GET** /sam/billing/view_payment_method | Listpaymentmethods
*BillingApi* | [**processPayment**](docs/BillingApi.md#processPayment) | **POST** /sam/billing/process_payment | Processpayment
*BillingApi* | [**reconcilePaymentMethod**](docs/BillingApi.md#reconcilePaymentMethod) | **GET** /sam/billing/reconcile_payment | Reconcilepaymentmethod
*BillingApi* | [**removePaymentMethod**](docs/BillingApi.md#removePaymentMethod) | **DELETE** /sam/billing/remove_payment_method | Removepaymentmethod
*CatalogsApi* | [**attachProductToCatalog**](docs/CatalogsApi.md#attachProductToCatalog) | **POST** /products/catalogs/{catalog_uuid}/products/{product_uuid} | Addproducttocatalog
*CatalogsApi* | [**createCatalog**](docs/CatalogsApi.md#createCatalog) | **POST** /products/catalogs | Createcatalog
*CatalogsApi* | [**deleteCatalog**](docs/CatalogsApi.md#deleteCatalog) | **DELETE** /products/catalogs/{catalog_uuid} | Deletecatalog
*CatalogsApi* | [**detachProductFromCatalog**](docs/CatalogsApi.md#detachProductFromCatalog) | **DELETE** /products/catalogs/{catalog_uuid}/products/{product_uuid} | Removeproductfromcatalog
*CatalogsApi* | [**getCatalog**](docs/CatalogsApi.md#getCatalog) | **GET** /products/catalogs/{catalog_uuid} | Getcatalog
*CatalogsApi* | [**searchCatalogProducts**](docs/CatalogsApi.md#searchCatalogProducts) | **GET** /products/catalogs/{catalog_uuid}/products | Searchcatalogproducts
*CatalogsApi* | [**searchCatalogs**](docs/CatalogsApi.md#searchCatalogs) | **GET** /products/catalogs | Searchcatalogs
*CatalogsApi* | [**updateCatalog**](docs/CatalogsApi.md#updateCatalog) | **PUT** /products/catalogs/{catalog_uuid} | Updatecatalog
*CategoryApi* | [**createCategoryPlacesCategoriesPost**](docs/CategoryApi.md#createCategoryPlacesCategoriesPost) | **POST** /places/categories | Create Category
*CategoryApi* | [**deleteCategoryPlacesCategoriesCategoryUuidDelete**](docs/CategoryApi.md#deleteCategoryPlacesCategoriesCategoryUuidDelete) | **DELETE** /places/categories/{category_uuid} | Delete Category
*CategoryApi* | [**getCategoryPlacesCategoriesCategoryUuidGet**](docs/CategoryApi.md#getCategoryPlacesCategoriesCategoryUuidGet) | **GET** /places/categories/{category_uuid} | Get Category
*CategoryApi* | [**searchCategoriesPlacesCategoriesGet**](docs/CategoryApi.md#searchCategoriesPlacesCategoriesGet) | **GET** /places/categories | Search Categories
*CategoryApi* | [**updateCategoryPlacesCategoriesCategoryUuidPut**](docs/CategoryApi.md#updateCategoryPlacesCategoriesCategoryUuidPut) | **PUT** /places/categories/{category_uuid} | Update Category
*CompaniesApi* | [**createCompanyPlacesCompaniesPost**](docs/CompaniesApi.md#createCompanyPlacesCompaniesPost) | **POST** /places/companies | Create Company
*CompaniesApi* | [**deletePlacePlacesCompaniesCompanyUuidDelete**](docs/CompaniesApi.md#deletePlacePlacesCompaniesCompanyUuidDelete) | **DELETE** /places/companies/{company_uuid} | Delete Place
*CompaniesApi* | [**getCompanyPlacesCompaniesCompanyUuidGet**](docs/CompaniesApi.md#getCompanyPlacesCompaniesCompanyUuidGet) | **GET** /places/companies/{company_uuid} | Get Company
*CompaniesApi* | [**searchCompaniesPlacesCompaniesGet**](docs/CompaniesApi.md#searchCompaniesPlacesCompaniesGet) | **GET** /places/companies | Search Companies
*CompaniesApi* | [**updateCompanyPlacesCompaniesCompanyUuidPut**](docs/CompaniesApi.md#updateCompanyPlacesCompaniesCompanyUuidPut) | **PUT** /places/companies/{company_uuid} | Update Company
*LoggingApi* | [**getSubjectLogs**](docs/LoggingApi.md#getSubjectLogs) | **GET** /sam/logging/logs/services/{service}/subjects/{subject} | Getsubjectlogs
*MetaApi* | [**createField**](docs/MetaApi.md#createField) | **POST** /meta/field | Create Field
*MetaApi* | [**createMeta**](docs/MetaApi.md#createMeta) | **POST** /meta/meta/service/{service}/type/{type_str}/entity/{entity_uuid} | Create Meta
*MetaApi* | [**deleteField**](docs/MetaApi.md#deleteField) | **DELETE** /meta/field/{field_uuid} | Delete Field
*MetaApi* | [**deleteMeta**](docs/MetaApi.md#deleteMeta) | **DELETE** /meta/meta/service/{service}/type/{type_str}/entity/{entity_uuid} | Delete Meta
*MetaApi* | [**deleteMetaFromUuid**](docs/MetaApi.md#deleteMetaFromUuid) | **DELETE** /meta/meta/{meta_uuid} | Delete Meta From Uuid
*MetaApi* | [**getField**](docs/MetaApi.md#getField) | **GET** /meta/field/{field_uuid} | Get Field
*MetaApi* | [**getMeta**](docs/MetaApi.md#getMeta) | **GET** /meta/meta/service/{service}/type/{type_str}/entity/{entity_uuid} | Get Meta
*MetaApi* | [**getMetaFromUuid**](docs/MetaApi.md#getMetaFromUuid) | **GET** /meta/meta/{meta_uuid} | Get Meta From Uuid
*MetaApi* | [**makeSlug**](docs/MetaApi.md#makeSlug) | **POST** /meta/meta/slug | Make Slug
*MetaApi* | [**touchMeta**](docs/MetaApi.md#touchMeta) | **POST** /meta/meta/service/{service}/type/{type_str}/entity/{entity_uuid}/touch | Touch Meta
*MetaApi* | [**updateField**](docs/MetaApi.md#updateField) | **PUT** /meta/field/{field_uuid} | Update Field
*MetaApi* | [**updateMeta**](docs/MetaApi.md#updateMeta) | **PUT** /meta/meta/service/{service}/type/{type_str}/entity/{entity_uuid} | Update Meta
*MetaApi* | [**updateMetaFromUuid**](docs/MetaApi.md#updateMetaFromUuid) | **PUT** /meta/meta/{meta_uuid} | Update Meta From Uuid
*MonitorApi* | [**acknowledgeAlarm**](docs/MonitorApi.md#acknowledgeAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/acknowledge | Acknowledgealarm
*MonitorApi* | [**assignAlarm**](docs/MonitorApi.md#assignAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/assign | Assignalarm
*MonitorApi* | [**attachAlarmNote**](docs/MonitorApi.md#attachAlarmNote) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/note | Attachalarmnote
*MonitorApi* | [**attachAlarmTicket**](docs/MonitorApi.md#attachAlarmTicket) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/ticket | Attachalarmticket
*MonitorApi* | [**clearAlarm**](docs/MonitorApi.md#clearAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/clear | Clearalarm
*MonitorApi* | [**getService**](docs/MonitorApi.md#getService) | **GET** /sam/monitor/services/{service} | Getservice
*MonitorApi* | [**getServiceAlarm**](docs/MonitorApi.md#getServiceAlarm) | **GET** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid} | Getservicealarm
*MonitorApi* | [**getServiceAlarms**](docs/MonitorApi.md#getServiceAlarms) | **GET** /sam/monitor/services/{service}/stages/{stage}/alarms | Getservicealarms
*MonitorApi* | [**getServiceHeartbeat**](docs/MonitorApi.md#getServiceHeartbeat) | **GET** /sam/monitor/services/{service}/stages/{stage}/heartbeats | Getserviceheartbeat
*MonitorApi* | [**getServiceKpis**](docs/MonitorApi.md#getServiceKpis) | **GET** /sam/monitor/services/{service}/kpis | Getservicekpis
*MonitorApi* | [**getServiceSpec**](docs/MonitorApi.md#getServiceSpec) | **GET** /sam/monitor/services/{service}/specs/{spec} | Getservicespec
*MonitorApi* | [**getServiceSpecs**](docs/MonitorApi.md#getServiceSpecs) | **GET** /sam/monitor/services/{service}/specs | Getservicespecs
*MonitorApi* | [**getServiceVitals**](docs/MonitorApi.md#getServiceVitals) | **GET** /sam/monitor/services/{service}/stages/{stage}/vitals | Getservicevitals
*MonitorApi* | [**getServices**](docs/MonitorApi.md#getServices) | **GET** /sam/monitor/services | Getservices
*MonitorApi* | [**getServicesWithSpecs**](docs/MonitorApi.md#getServicesWithSpecs) | **GET** /sam/monitor/specs/services | Getserviceswithspecs
*MonitorApi* | [**hideService**](docs/MonitorApi.md#hideService) | **POST** /sam/monitor/services/{service}/stages/{stage}/hide | Hideservice
*MonitorApi* | [**ignoreAlarm**](docs/MonitorApi.md#ignoreAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/ignore | Ignorealarm
*MonitorApi* | [**registerService**](docs/MonitorApi.md#registerService) | **POST** /sam/monitor/services | Registerservice
*MonitorApi* | [**searchAlarms**](docs/MonitorApi.md#searchAlarms) | **GET** /sam/monitor/services/{service}/alarms | Searchalarms
*MonitorApi* | [**showService**](docs/MonitorApi.md#showService) | **POST** /sam/monitor/services/{service}/stages/{stage}/show | Showservice
*MonitorApi* | [**terminateAlarm**](docs/MonitorApi.md#terminateAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms/{alarm_uuid}/terminate | Terminatealarm
*MonitorApi* | [**triggerAlarm**](docs/MonitorApi.md#triggerAlarm) | **POST** /sam/monitor/services/{service}/stages/{stage}/alarms | Triggeralarm
*NotesApi* | [**createNote**](docs/NotesApi.md#createNote) | **POST** /notes/notes | Create Note
*NotesApi* | [**deleteNote**](docs/NotesApi.md#deleteNote) | **DELETE** /notes/notes/{note_id} | Delete Note
*NotesApi* | [**getNote**](docs/NotesApi.md#getNote) | **GET** /notes/notes/{note_id} | Get Note
*NotesApi* | [**updateNote**](docs/NotesApi.md#updateNote) | **PUT** /notes/notes/{note_id} | Update Note
*PlacesApi* | [**advancedSearchPlaces**](docs/PlacesApi.md#advancedSearchPlaces) | **GET** /places/search/places/string | Advancedsearchplaces
*PlacesApi* | [**createPlacePlacesPlacesPost**](docs/PlacesApi.md#createPlacePlacesPlacesPost) | **POST** /places/places | Create Place
*PlacesApi* | [**deletePlace**](docs/PlacesApi.md#deletePlace) | **DELETE** /places/places/{place_uuid} | Deleteplace
*PlacesApi* | [**forwardGeocodingPlacesGeocodingForwardGet**](docs/PlacesApi.md#forwardGeocodingPlacesGeocodingForwardGet) | **GET** /places/geocoding/forward | Forward Geocoding
*PlacesApi* | [**getPlace**](docs/PlacesApi.md#getPlace) | **GET** /places/places/{place_uuid} | Getplace
*PlacesApi* | [**reverseGeocodingPlacesGeocodingReverseGet**](docs/PlacesApi.md#reverseGeocodingPlacesGeocodingReverseGet) | **GET** /places/geocoding/reverse | Reverse Geocoding
*PlacesApi* | [**searchPlaces**](docs/PlacesApi.md#searchPlaces) | **GET** /places/places | Searchplaces
*PlacesApi* | [**updatePlace**](docs/PlacesApi.md#updatePlace) | **PUT** /places/places/{place_uuid} | Updateplace
*ProductsApi* | [**createProduct**](docs/ProductsApi.md#createProduct) | **POST** /products/products | Createproduct
*ProductsApi* | [**deleteProduct**](docs/ProductsApi.md#deleteProduct) | **DELETE** /products/products/{product_uuid} | Deleteproduct
*ProductsApi* | [**getProduct**](docs/ProductsApi.md#getProduct) | **GET** /products/products/{product_uuid} | Getproduct
*ProductsApi* | [**searchProductCatalog**](docs/ProductsApi.md#searchProductCatalog) | **GET** /products/products/{product_uuid}/catalogs | Searchproductcatalog
*ProductsApi* | [**searchProducts**](docs/ProductsApi.md#searchProducts) | **GET** /products/products | Searchproducts
*ProductsApi* | [**updateProduct**](docs/ProductsApi.md#updateProduct) | **PUT** /products/products/{product_uuid} | Updateproduct
*ProjectsApi* | [**addMemberToProject**](docs/ProjectsApi.md#addMemberToProject) | **POST** /sam/projects/projects/{project_uuid}/members/{entity_uuid} | Addmembertoproject
*ProjectsApi* | [**archiveProject**](docs/ProjectsApi.md#archiveProject) | **DELETE** /sam/projects/projects/{project_uuid} | Archiveproject
*ProjectsApi* | [**createProject**](docs/ProjectsApi.md#createProject) | **POST** /sam/projects/projects | Createproject
*ProjectsApi* | [**createProjectCredential**](docs/ProjectsApi.md#createProjectCredential) | **POST** /sam/projects/projects/{project_uuid}/credentials | Createprojectcredential
*ProjectsApi* | [**createProjectCredit**](docs/ProjectsApi.md#createProjectCredit) | **POST** /sam/projects/projects/{project_uuid}/credits | Createprojectcredit
*ProjectsApi* | [**createProjectInvoice**](docs/ProjectsApi.md#createProjectInvoice) | **POST** /sam/projects/projects/{project_uuid}/invoices | Createprojectinvoice
*ProjectsApi* | [**createProjectKey**](docs/ProjectsApi.md#createProjectKey) | **POST** /sam/projects/projects/{project_uuid}/keys | Createprojectkey
*ProjectsApi* | [**createUsageType**](docs/ProjectsApi.md#createUsageType) | **POST** /sam/projects/usage/types | Createusagetype
*ProjectsApi* | [**deleteProjectCredential**](docs/ProjectsApi.md#deleteProjectCredential) | **DELETE** /sam/projects/projects/{project_uuid}/credentials/{service_name} | Deleteprojectcredential
*ProjectsApi* | [**deleteProjectKey**](docs/ProjectsApi.md#deleteProjectKey) | **DELETE** /sam/projects/projects/{project_uuid}/keys | Deleteprojectkey
*ProjectsApi* | [**deleteUsageType**](docs/ProjectsApi.md#deleteUsageType) | **DELETE** /sam/projects/usage/types/{usage_type_key} | Deleteusagetype
*ProjectsApi* | [**getAllProjectCredentials**](docs/ProjectsApi.md#getAllProjectCredentials) | **GET** /sam/projects/projects/{project_uuid}/credentials | Getallprojectcredentials
*ProjectsApi* | [**getAllProjectCredits**](docs/ProjectsApi.md#getAllProjectCredits) | **GET** /sam/projects/projects/{project_uuid}/credits | Getallprojectcredits
*ProjectsApi* | [**getAllProjectUsage**](docs/ProjectsApi.md#getAllProjectUsage) | **GET** /sam/projects/projects/{project_uuid}/usage | Getallprojectusage
*ProjectsApi* | [**getMemberProjects**](docs/ProjectsApi.md#getMemberProjects) | **GET** /sam/projects/members/{entity_uuid}/projects | Getmemberprojects
*ProjectsApi* | [**getProject**](docs/ProjectsApi.md#getProject) | **GET** /sam/projects/projects/{project_uuid} | Getproject
*ProjectsApi* | [**getProjectCreditTransactions**](docs/ProjectsApi.md#getProjectCreditTransactions) | **GET** /sam/projects/projects/{project_uuid}/credits/{credit_uuid}/transactions | Getprojectcredittransactions
*ProjectsApi* | [**getProjectInvoice**](docs/ProjectsApi.md#getProjectInvoice) | **GET** /sam/projects/projects/{project_uuid}/invoices | Getprojectinvoice
*ProjectsApi* | [**getProjectInvoiceHistory**](docs/ProjectsApi.md#getProjectInvoiceHistory) | **GET** /sam/projects/projects/{project_uuid}/invoices/history | Getprojectinvoicehistory
*ProjectsApi* | [**getProjectKeys**](docs/ProjectsApi.md#getProjectKeys) | **GET** /sam/projects/projects/{project_uuid}/keys | Getprojectkeys
*ProjectsApi* | [**getProjectMembers**](docs/ProjectsApi.md#getProjectMembers) | **GET** /sam/projects/projects/{project_uuid}/members | Getprojectmembers
*ProjectsApi* | [**getSpecificProjectCredential**](docs/ProjectsApi.md#getSpecificProjectCredential) | **GET** /sam/projects/projects/{project_uuid}/credentials/{service_name} | Getspecificprojectcredential
*ProjectsApi* | [**getSpecificProjectUsage**](docs/ProjectsApi.md#getSpecificProjectUsage) | **GET** /sam/projects/projects/{project_uuid}/usage/{usage_type_key} | Getspecificprojectusage
*ProjectsApi* | [**getUsageType**](docs/ProjectsApi.md#getUsageType) | **GET** /sam/projects/usage/types/{usage_type_key} | Getusagetype
*ProjectsApi* | [**removeMemberFromProject**](docs/ProjectsApi.md#removeMemberFromProject) | **DELETE** /sam/projects/projects/{project_uuid}/members/{entity_uuid} | Removememberfromproject
*ProjectsApi* | [**revokeProjectCredit**](docs/ProjectsApi.md#revokeProjectCredit) | **DELETE** /sam/projects/projects/{project_uuid}/credits/{credit_uuid} | Revokeprojectcredit
*ProjectsApi* | [**searchProjects**](docs/ProjectsApi.md#searchProjects) | **GET** /sam/projects/projects | Searchprojects
*ProjectsApi* | [**searchUsageType**](docs/ProjectsApi.md#searchUsageType) | **GET** /sam/projects/usage/types | Searchusagetype
*ProjectsApi* | [**updateProject**](docs/ProjectsApi.md#updateProject) | **PUT** /sam/projects/projects/{project_uuid} | Updateproject
*ProjectsApi* | [**updateProjectCredential**](docs/ProjectsApi.md#updateProjectCredential) | **PUT** /sam/projects/projects/{project_uuid}/credentials/{service_name} | Updateprojectcredential
*ProjectsApi* | [**updateUsageType**](docs/ProjectsApi.md#updateUsageType) | **PUT** /sam/projects/usage/types/{usage_type_key} | Updateusagetype
*ReviewsApi* | [**createReview**](docs/ReviewsApi.md#createReview) | **POST** /products/reviews/types/{entity_type}/entities/{entity_uuid} | Create
*ReviewsApi* | [**deleteReview**](docs/ReviewsApi.md#deleteReview) | **DELETE** /products/reviews/types/{entity_type}/entities/{entity_uuid}/reviews/{review_uuid} | Deletereview
*ReviewsApi* | [**getReview**](docs/ReviewsApi.md#getReview) | **GET** /products/reviews/types/{entity_type}/entities/{entity_uuid}/reviews/{review_uuid} | Getreview
*ReviewsApi* | [**searchReviews**](docs/ReviewsApi.md#searchReviews) | **GET** /products/reviews/types/{entity_type}/entities/{entity_uuid} | Searchreview
*ReviewsApi* | [**updateReview**](docs/ReviewsApi.md#updateReview) | **PUT** /products/reviews/types/{entity_type}/entities/{entity_uuid}/reviews/{review_uuid} | Updatereview
*SecurityApi* | [**createEncryptionKey**](docs/SecurityApi.md#createEncryptionKey) | **POST** /sam/security/encryption/categories/{category}/keys | Createencryptionkey
*SecurityApi* | [**createKey**](docs/SecurityApi.md#createKey) | **POST** /sam/security/keys | Createkey
*SecurityApi* | [**deleteKey**](docs/SecurityApi.md#deleteKey) | **DELETE** /sam/security/keys/{key_uuid} | Deletekey
*SecurityApi* | [**generateToken**](docs/SecurityApi.md#generateToken) | **POST** /sam/security/tokens | Generatetoken
*SecurityApi* | [**getEncryptionKey**](docs/SecurityApi.md#getEncryptionKey) | **GET** /sam/security/encryption/categories/{category}/keys | Getencryptionkey
*SecurityApi* | [**getKey**](docs/SecurityApi.md#getKey) | **GET** /sam/security/keys/{key_uuid} | Getkey
*SecurityApi* | [**searchKeys**](docs/SecurityApi.md#searchKeys) | **GET** /sam/security/keys | Searchkeys
*SecurityApi* | [**verifyKey**](docs/SecurityApi.md#verifyKey) | **POST** /sam/security/keys/verify | Verifykey
*StaffApi* | [**createStaff**](docs/StaffApi.md#createStaff) | **POST** /places/staff | Createstaff
*StaffApi* | [**deleteStaff**](docs/StaffApi.md#deleteStaff) | **DELETE** /places/staff/{staff_uuid} | Deletestaff
*StaffApi* | [**getStaff**](docs/StaffApi.md#getStaff) | **GET** /places/staff/{staff_uuid} | Getstaff
*StaffApi* | [**searchStaff**](docs/StaffApi.md#searchStaff) | **GET** /places/staff | Searchstaff
*StaffApi* | [**updateStaff**](docs/StaffApi.md#updateStaff) | **PUT** /places/staff/{staff_uuid} | Updatestaff
*SupportApi* | [**createContact**](docs/SupportApi.md#createContact) | **POST** /sam/support/contact | Createcontact
*SupportApi* | [**createTicket**](docs/SupportApi.md#createTicket) | **POST** /sam/support/projects/{project_uuid}/members/{member_uuid}/tickets | Createticket
*SupportApi* | [**listTickets**](docs/SupportApi.md#listTickets) | **GET** /sam/support/projects/{project_uuid}/members/{member_uuid}/tickets | Listtickets
*SupportApi* | [**updateTicket**](docs/SupportApi.md#updateTicket) | **PUT** /sam/support/projects/{project_uuid}/members/{member_uuid}/tickets/{ticket_id} | Updateticket
*SupportApi* | [**viewTicket**](docs/SupportApi.md#viewTicket) | **GET** /sam/support/projects/{project_uuid}/members/{member_uuid}/tickets/{ticket_id} | Viewticket
*TagApi* | [**deleteTag**](docs/TagApi.md#deleteTag) | **DELETE** /places/tags/{tag_uuid} | Deletetag
*TagsApi* | [**createTag**](docs/TagsApi.md#createTag) | **POST** /places/tags | Createtag
*TagsApi* | [**getTag**](docs/TagsApi.md#getTag) | **GET** /places/tags/{tag_uuid} | Gettag
*TagsApi* | [**searchTag**](docs/TagsApi.md#searchTag) | **GET** /places/tags | Searchtag
*TagsApi* | [**updateTag**](docs/TagsApi.md#updateTag) | **PUT** /places/tags/{tag_uuid} | Updatetag
*UsersApi* | [**confirmSignup**](docs/UsersApi.md#confirmSignup) | **POST** /sam/users/auth/signup/confirm | Confirmsignup
*UsersApi* | [**createParticipant**](docs/UsersApi.md#createParticipant) | **POST** /sam/users/participants | Createparticipant
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /sam/users | Createuser
*UsersApi* | [**deleteParticipant**](docs/UsersApi.md#deleteParticipant) | **DELETE** /sam/users/participants/{participant_id} | Deleteparticipant
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /sam/users/{user_id} | Deleteuser
*UsersApi* | [**getParticipant**](docs/UsersApi.md#getParticipant) | **GET** /sam/users/participants/{participant_id} | Getparticipant
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /sam/users/{user_id} | Getuser
*UsersApi* | [**login**](docs/UsersApi.md#login) | **POST** /sam/users/auth/login | Login
*UsersApi* | [**refreshToken**](docs/UsersApi.md#refreshToken) | **POST** /sam/users/auth/{app_client}/refresh-token | Refreshtoken
*UsersApi* | [**resetPassword**](docs/UsersApi.md#resetPassword) | **POST** /sam/users/auth/password/reset | Resetpassword
*UsersApi* | [**resetPasswordConfirmation**](docs/UsersApi.md#resetPasswordConfirmation) | **POST** /sam/users/auth/password/reset/confirm | Resetpasswordconfirmation
*UsersApi* | [**searchParticipants**](docs/UsersApi.md#searchParticipants) | **GET** /sam/users/participants | Searchparticipants
*UsersApi* | [**signup**](docs/UsersApi.md#signup) | **POST** /sam/users/auth/signup | Signup
*UsersApi* | [**updateParticipant**](docs/UsersApi.md#updateParticipant) | **PUT** /sam/users/participants/{participant_id} | Updateparticipant
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /sam/users/{user_id} | Updateuser
*UsersApi* | [**userValidations**](docs/UsersApi.md#userValidations) | **POST** /sam/users/validations/{field} | Uservalidations


## Documentation for Models

 - [AddressBase](docs/AddressBase.md)
 - [AlarmAcknowledge](docs/AlarmAcknowledge.md)
 - [AlarmAssign](docs/AlarmAssign.md)
 - [AlarmCreate](docs/AlarmCreate.md)
 - [AlarmIgnore](docs/AlarmIgnore.md)
 - [AlarmNote](docs/AlarmNote.md)
 - [AlarmResponse](docs/AlarmResponse.md)
 - [AlarmTerminate](docs/AlarmTerminate.md)
 - [AlarmTicket](docs/AlarmTicket.md)
 - [AppointmentBase](docs/AppointmentBase.md)
 - [AppointmentResponse](docs/AppointmentResponse.md)
 - [AttachPaymentToProject](docs/AttachPaymentToProject.md)
 - [Basic](docs/Basic.md)
 - [BasicMeta](docs/BasicMeta.md)
 - [BasicMetaCreate](docs/BasicMetaCreate.md)
 - [CatalogBase](docs/CatalogBase.md)
 - [CatalogReturn](docs/CatalogReturn.md)
 - [CategoryBase](docs/CategoryBase.md)
 - [CategoryDb](docs/CategoryDb.md)
 - [Company](docs/Company.md)
 - [CompanyBase](docs/CompanyBase.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [Contact](docs/Contact.md)
 - [ContactBase](docs/ContactBase.md)
 - [ContactMethod](docs/ContactMethod.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [CreateKeyResponse](docs/CreateKeyResponse.md)
 - [CreateProjectCredential](docs/CreateProjectCredential.md)
 - [CreateProjectCredit](docs/CreateProjectCredit.md)
 - [CreateProjectInvoice](docs/CreateProjectInvoice.md)
 - [CreateReview](docs/CreateReview.md)
 - [CreateTicket](docs/CreateTicket.md)
 - [Credential](docs/Credential.md)
 - [CustomList](docs/CustomList.md)
 - [DatesMeta](docs/DatesMeta.md)
 - [Detailed](docs/Detailed.md)
 - [DetailedMeta](docs/DetailedMeta.md)
 - [DetailedMetaCreate](docs/DetailedMetaCreate.md)
 - [DetailedMetaGet](docs/DetailedMetaGet.md)
 - [Discount](docs/Discount.md)
 - [Email](docs/Email.md)
 - [Field](docs/Field.md)
 - [FieldDynamo](docs/FieldDynamo.md)
 - [GetAppointment403Response](docs/GetAppointment403Response.md)
 - [GetInvoiceResponse](docs/GetInvoiceResponse.md)
 - [GetProjectCredential](docs/GetProjectCredential.md)
 - [GetProjectInvoiceHistory](docs/GetProjectInvoiceHistory.md)
 - [GetProjectInvoiceResponse](docs/GetProjectInvoiceResponse.md)
 - [GetSecret](docs/GetSecret.md)
 - [GetServiceServiceWithSpecsResponse](docs/GetServiceServiceWithSpecsResponse.md)
 - [GetServiceSpecResponse](docs/GetServiceSpecResponse.md)
 - [GetServiceSpecsResponse](docs/GetServiceSpecsResponse.md)
 - [GetTransactionResponse](docs/GetTransactionResponse.md)
 - [HTTPValidationError](docs/HTTPValidationError.md)
 - [HeartbeatResponse](docs/HeartbeatResponse.md)
 - [History](docs/History.md)
 - [KpiResponse](docs/KpiResponse.md)
 - [LineItem](docs/LineItem.md)
 - [LoggingDynamo](docs/LoggingDynamo.md)
 - [MetaChildren](docs/MetaChildren.md)
 - [MetaCreate](docs/MetaCreate.md)
 - [MetaCustom](docs/MetaCustom.md)
 - [MetaDynamo](docs/MetaDynamo.md)
 - [MetaGet](docs/MetaGet.md)
 - [MetaSlugger](docs/MetaSlugger.md)
 - [Note](docs/Note.md)
 - [NoteBase](docs/NoteBase.md)
 - [NoteDynamoHistoryResponse](docs/NoteDynamoHistoryResponse.md)
 - [NoteDynamoResponse](docs/NoteDynamoResponse.md)
 - [NoteMeta](docs/NoteMeta.md)
 - [OptionGroup](docs/OptionGroup.md)
 - [Options](docs/Options.md)
 - [Page](docs/Page.md)
 - [Pagination](docs/Pagination.md)
 - [ParticipantCreate](docs/ParticipantCreate.md)
 - [ParticipantUpdate](docs/ParticipantUpdate.md)
 - [ParticipantUserReturn](docs/ParticipantUserReturn.md)
 - [Payment](docs/Payment.md)
 - [PaymentMethodResponse](docs/PaymentMethodResponse.md)
 - [PlaceBase](docs/PlaceBase.md)
 - [PlaceResponse](docs/PlaceResponse.md)
 - [ProductBase](docs/ProductBase.md)
 - [ProductReturn](docs/ProductReturn.md)
 - [ProjectCreditResponse](docs/ProjectCreditResponse.md)
 - [ProjectDB](docs/ProjectDB.md)
 - [ProjectsProjectCreate](docs/ProjectsProjectCreate.md)
 - [ProjectsProjectGet](docs/ProjectsProjectGet.md)
 - [ProjectsProjectMemberDB](docs/ProjectsProjectMemberDB.md)
 - [ProjectsProjectUpdate](docs/ProjectsProjectUpdate.md)
 - [ProjectsProjectUsageDB](docs/ProjectsProjectUsageDB.md)
 - [ProjectsUsageTypeCreate](docs/ProjectsUsageTypeCreate.md)
 - [ProjectsUsageTypeDB](docs/ProjectsUsageTypeDB.md)
 - [ProjectsUsageTypeGet](docs/ProjectsUsageTypeGet.md)
 - [ProjectsUsageTypeUnitPrice](docs/ProjectsUsageTypeUnitPrice.md)
 - [ProjectsUsageTypeUpdate](docs/ProjectsUsageTypeUpdate.md)
 - [ResponseAddmembertoproject](docs/ResponseAddmembertoproject.md)
 - [ResponseArchiveproject](docs/ResponseArchiveproject.md)
 - [ResponseCreatekey](docs/ResponseCreatekey.md)
 - [ResponseCreateprojectcredential](docs/ResponseCreateprojectcredential.md)
 - [ResponseCreateprojectinvoice](docs/ResponseCreateprojectinvoice.md)
 - [ResponseDeletekey](docs/ResponseDeletekey.md)
 - [ResponseDeleteprojectcredential](docs/ResponseDeleteprojectcredential.md)
 - [ResponseDeleteusagetype](docs/ResponseDeleteusagetype.md)
 - [ResponseGeneratetoken](docs/ResponseGeneratetoken.md)
 - [ResponseRemovememberfromproject](docs/ResponseRemovememberfromproject.md)
 - [ResponseRevokeprojectcredit](docs/ResponseRevokeprojectcredit.md)
 - [ResponseUpdateprojectcredential](docs/ResponseUpdateprojectcredential.md)
 - [SecurityCreateToken](docs/SecurityCreateToken.md)
 - [SecurityEncryptionKeyGet](docs/SecurityEncryptionKeyGet.md)
 - [SecurityEncryptionKeyResponse](docs/SecurityEncryptionKeyResponse.md)
 - [SecurityKeyCreate](docs/SecurityKeyCreate.md)
 - [SecurityKeyGet](docs/SecurityKeyGet.md)
 - [SecurityKeyVerify](docs/SecurityKeyVerify.md)
 - [Selection](docs/Selection.md)
 - [ServiceCreate](docs/ServiceCreate.md)
 - [ServiceMessageResponse](docs/ServiceMessageResponse.md)
 - [ServiceResponse](docs/ServiceResponse.md)
 - [StaffCreate](docs/StaffCreate.md)
 - [StaffDb](docs/StaffDb.md)
 - [StaffResponse](docs/StaffResponse.md)
 - [StatsVitalsResponse](docs/StatsVitalsResponse.md)
 - [StripeAccountResponse](docs/StripeAccountResponse.md)
 - [StripeCustomerSecretResponse](docs/StripeCustomerSecretResponse.md)
 - [TagBase](docs/TagBase.md)
 - [TagDb](docs/TagDb.md)
 - [Tax](docs/Tax.md)
 - [TicketResponse](docs/TicketResponse.md)
 - [TicketsResponse](docs/TicketsResponse.md)
 - [UpdateProjectCredentialRequest](docs/UpdateProjectCredentialRequest.md)
 - [UpdateReview](docs/UpdateReview.md)
 - [User](docs/User.md)
 - [UserConfirmation](docs/UserConfirmation.md)
 - [UserEmail](docs/UserEmail.md)
 - [UserFlags](docs/UserFlags.md)
 - [UserLogin](docs/UserLogin.md)
 - [UserLoginReturn](docs/UserLoginReturn.md)
 - [UserPasswordReset](docs/UserPasswordReset.md)
 - [UserPasswordResetConfirmation](docs/UserPasswordResetConfirmation.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserSignup](docs/UserSignup.md)
 - [UserSignupReturn](docs/UserSignupReturn.md)
 - [UserTokenReturn](docs/UserTokenReturn.md)
 - [UserValidations](docs/UserValidations.md)
 - [ValidationError](docs/ValidationError.md)
 - [Validations](docs/Validations.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@ehelply.com

