/*
 * AI Core
 * Provides tools to manage your scenarios and workflows in SAP AI Core. Execute pipelines as a batch job, for example to pre-process or train your models, or perform batch inference.  Serve inference requests of trained models. Deploy а trained machine learning model as a web service to serve inference requests with high performance.  Register your own Docker registry, synchronize your AI content from your own git repository, and register your own object store for training data and trained models.
 *
 * The version of the OpenAPI document: 2.35.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.core.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** BckndTenant */
// CHECKSTYLE:OFF
public class BckndTenant
// CHECKSTYLE:ON
{
  @JsonProperty("tenantId")
  private String tenantId;

  @JsonProperty("zoneId")
  private String zoneId;

  @JsonProperty("realSubaccountId")
  private String realSubaccountId;

  @JsonProperty("servicePlan")
  private String servicePlan;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for BckndTenant. */
  protected BckndTenant() {}

  /**
   * Set the tenantId of this {@link BckndTenant} instance and return the same instance.
   *
   * @param tenantId tenant id
   * @return The same instance of this {@link BckndTenant} class
   */
  @Nonnull
  public BckndTenant tenantId(@Nullable final String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * tenant id
   *
   * @return tenantId The tenantId of this {@link BckndTenant} instance.
   */
  @Nonnull
  public String getTenantId() {
    return tenantId;
  }

  /**
   * Set the tenantId of this {@link BckndTenant} instance.
   *
   * @param tenantId tenant id
   */
  public void setTenantId(@Nullable final String tenantId) {
    this.tenantId = tenantId;
  }

  /**
   * Set the zoneId of this {@link BckndTenant} instance and return the same instance.
   *
   * @param zoneId zone id
   * @return The same instance of this {@link BckndTenant} class
   */
  @Nonnull
  public BckndTenant zoneId(@Nullable final String zoneId) {
    this.zoneId = zoneId;
    return this;
  }

  /**
   * zone id
   *
   * @return zoneId The zoneId of this {@link BckndTenant} instance.
   */
  @Nonnull
  public String getZoneId() {
    return zoneId;
  }

  /**
   * Set the zoneId of this {@link BckndTenant} instance.
   *
   * @param zoneId zone id
   */
  public void setZoneId(@Nullable final String zoneId) {
    this.zoneId = zoneId;
  }

  /**
   * Set the realSubaccountId of this {@link BckndTenant} instance and return the same instance.
   *
   * @param realSubaccountId real sub account id
   * @return The same instance of this {@link BckndTenant} class
   */
  @Nonnull
  public BckndTenant realSubaccountId(@Nullable final String realSubaccountId) {
    this.realSubaccountId = realSubaccountId;
    return this;
  }

  /**
   * real sub account id
   *
   * @return realSubaccountId The realSubaccountId of this {@link BckndTenant} instance.
   */
  @Nonnull
  public String getRealSubaccountId() {
    return realSubaccountId;
  }

  /**
   * Set the realSubaccountId of this {@link BckndTenant} instance.
   *
   * @param realSubaccountId real sub account id
   */
  public void setRealSubaccountId(@Nullable final String realSubaccountId) {
    this.realSubaccountId = realSubaccountId;
  }

  /**
   * Set the servicePlan of this {@link BckndTenant} instance and return the same instance.
   *
   * @param servicePlan service plan
   * @return The same instance of this {@link BckndTenant} class
   */
  @Nonnull
  public BckndTenant servicePlan(@Nullable final String servicePlan) {
    this.servicePlan = servicePlan;
    return this;
  }

  /**
   * service plan
   *
   * @return servicePlan The servicePlan of this {@link BckndTenant} instance.
   */
  @Nonnull
  public String getServicePlan() {
    return servicePlan;
  }

  /**
   * Set the servicePlan of this {@link BckndTenant} instance.
   *
   * @param servicePlan service plan
   */
  public void setServicePlan(@Nullable final String servicePlan) {
    this.servicePlan = servicePlan;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link BckndTenant}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link BckndTenant} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException("BckndTenant has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link BckndTenant} instance. If the map previously
   * contained a mapping for the key, the old value is replaced by the specified value.
   *
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField(@Nonnull String customFieldName, @Nullable Object customFieldValue) {
    cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }

  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final BckndTenant bckndTenant = (BckndTenant) o;
    return Objects.equals(this.cloudSdkCustomFields, bckndTenant.cloudSdkCustomFields)
        && Objects.equals(this.tenantId, bckndTenant.tenantId)
        && Objects.equals(this.zoneId, bckndTenant.zoneId)
        && Objects.equals(this.realSubaccountId, bckndTenant.realSubaccountId)
        && Objects.equals(this.servicePlan, bckndTenant.servicePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, zoneId, realSubaccountId, servicePlan, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class BckndTenant {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
    sb.append("    realSubaccountId: ").append(toIndentedString(realSubaccountId)).append("\n");
    sb.append("    servicePlan: ").append(toIndentedString(servicePlan)).append("\n");
    cloudSdkCustomFields.forEach(
        (k, v) ->
            sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /** Create a new {@link BckndTenant} instance. No arguments are required. */
  public static BckndTenant create() {
    return new BckndTenant();
  }
}
