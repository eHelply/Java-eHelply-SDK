/*
 * eHelply SDK - 1.1.121
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.121
 * Contact: support@ehelply.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ehelply.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(new com.ehelply.client.model.AddressBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmAcknowledge.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmAssign.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmIgnore.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmNote.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmTerminate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AlarmTicket.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AppointmentBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AppointmentResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.AttachPaymentToProject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Basic.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.BasicMeta.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.BasicMetaCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CatalogBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CatalogReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CategoryBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CategoryResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Company.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CompanyBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CompanyResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Contact.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ContactBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ContactMethod.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ContactResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateField200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateFile200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateKeyResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateMeta200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateNote200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateProjectCredential.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateProjectCredit.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateProjectInvoice.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateReview.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateSlug200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CreateTicket.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Credential.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.CustomList.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DatesMeta.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DeleteFact200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DeleteField200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DeleteFile200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DeleteMeta200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DeleteNote200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Detailed.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DetailedMeta.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.DetailedMetaCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Discount.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Email.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Fact.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.FactCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Field.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.FieldDynamo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetAppointment403Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetInvoiceResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetProjectCredential.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetProjectInvoiceHistory.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetProjectInvoiceResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetSecret.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetServiceServiceWithSpecsResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetServiceSpecResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetServiceSpecsResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.GetTransactionResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.HTTPValidationError.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.HeartbeatResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.History.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.KpiResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.LineItem.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.LoggingDynamo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.MetaChildren.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.MetaCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.MetaCustom.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.MetaDynamo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Note.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.NoteBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.NoteDynamoHistoryResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.NoteDynamoResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.NoteMeta.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.OptionGroup.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Options.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Page.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Pagination.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ParticipantCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ParticipantUpdate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ParticipantUserReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Payment.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.PaymentMethodResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.PlaceBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.PlaceResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProductBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProductReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectCreditResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectDB.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectGet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectMemberDB.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectUpdate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectUsageDB.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeDB.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeGet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeUnitPrice.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeUpdate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseAddmembertoproject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseArchiveproject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseCreatekey.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseCreateprojectcredential.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseCreateprojectinvoice.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseDeletekey.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseDeleteprojectcredential.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseDeleteusagetype.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseGeneratetoken.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseRemovememberfromproject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseRevokeprojectcredit.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ResponseUpdateprojectcredential.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SaveFact200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SecurityCreateToken.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SecurityEncryptionKeyGet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SecurityEncryptionKeyResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SecurityKeyCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SecurityKeyGet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.SecurityKeyVerify.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Selection.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceCreate.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceMessageResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceSuperStackMeta.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceSuperStackMetaFaq.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceSuperStackMetaFeature.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceSuperStackMetaGettingStarted.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceSuperStackMetaGettingStartedEndpointTeaser.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ServiceSuperStackMetaUseCase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Slugger.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.StaffBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.StaffResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.StatsVitalsResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.StripeAccountResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.StripeCustomerSecretResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.TagBase.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.TagResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Tax.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.TicketResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.TicketsResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.TouchMeta200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UpdateField200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UpdateFile200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UpdateMeta200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UpdateNote200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UpdateProjectCredentialRequest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UpdateReview.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.User.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserConfirmation.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserEmail.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserFlags.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserLogin.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserLoginReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserPasswordReset.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserPasswordResetConfirmation.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserSignup.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserSignupReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserTokenReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.UserValidations.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.ValidationError.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new com.ehelply.client.model.Validations.CustomTypeAdapterFactory())
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
