

# ParticipantUserReturn

Contains all fields required when doing a Participant GET but also has user fields (name, location, ect). This is what is returned from all participant endpoints.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**uuid** | **String** |  |  [optional] |
|**userUuid** | **String** |  |  [optional] |
|**participantMeta** | **Object** |  |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**email** | [**Email**](Email.md) |  |  [optional] |
|**phoneNumber** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**gpsLocation** | **Object** |  |  [optional] |
|**picture** | **String** |  |  [optional] |
|**lastLogin** | **OffsetDateTime** |  |  [optional] |
|**verifiedLegalTerms** | **Boolean** |  |  [optional] |
|**dateCreated** | **OffsetDateTime** |  |  [optional] |
|**dateUpdated** | **OffsetDateTime** |  |  [optional] |



