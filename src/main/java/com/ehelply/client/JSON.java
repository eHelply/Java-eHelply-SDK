/*
 * eHelply SDK - 1.1.108
 * eHelply SDK for SuperStack Services
 *
 * The version of the OpenAPI document: 1.1.108
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
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AddressBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmAcknowledge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmAssign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmIgnore.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmNote.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmTerminate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AlarmTicket.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AppointmentBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AppointmentResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.AttachPaymentToProject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Basic.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.BasicMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.BasicMetaCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CatalogBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CatalogReturn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CategoryBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CategoryDb.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Company.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CompanyBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CompanyResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Contact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ContactBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ContactMethod.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ContactResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CreateKeyResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CreateProjectCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CreateProjectInvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CreateReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CreateTicket.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Credential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.CustomList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.DatesMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Detailed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.DetailedMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.DetailedMetaCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.DetailedMetaGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Discount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Email.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Field.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.FieldDynamo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetAppointment403Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetInvoiceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetProjectCredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetProjectInvoiceHistory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetProjectInvoiceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetSecret.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetServiceServiceWithSpecsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetServiceSpecResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetServiceSpecsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.GetTransactionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.HTTPValidationError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.HeartbeatResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.History.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.KpiResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.LineItem.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.LoggingDynamo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.MetaChildren.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.MetaCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.MetaCustom.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.MetaDynamo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.MetaGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.MetaSlugger.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Note.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.NoteBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.NoteDynamoHistoryResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.NoteDynamoResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.NoteMeta.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.OptionGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Options.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Page.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Pagination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ParticipantCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ParticipantUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ParticipantUserReturn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Payment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.PaymentMethodResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.PlaceBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.PlaceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProductBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProductReturn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectDB.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectMemberDB.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsProjectUsageDB.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeDB.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeUnitPrice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ProjectsUsageTypeUpdate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseAddmembertoproject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseArchiveproject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseCreatekey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseCreateprojectcredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseCreateprojectinvoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseDeletekey.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseDeleteprojectcredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseDeleteusagetype.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseGeneratetoken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseRemovememberfromproject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ResponseUpdateprojectcredential.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.SecurityCreateToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.SecurityEncryptionKeyGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.SecurityEncryptionKeyResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.SecurityKeyCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.SecurityKeyGet.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.SecurityKeyVerify.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Selection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ServiceCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ServiceMessageResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ServiceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.StaffCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.StaffDb.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.StaffResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.StatsVitalsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.StripeAccountResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.StripeCustomerSecretResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.TagBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.TagDb.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Tax.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.TicketResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.TicketsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UpdateProjectCredentialRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UpdateReview.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserConfirmation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserFlags.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserLogin.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserLoginReturn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserPasswordReset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserPasswordResetConfirmation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserSignup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserSignupReturn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserTokenReturn.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.UserValidations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.ValidationError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.ehelply.client.model.Validations.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
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
