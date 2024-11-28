/*
 * Orchestration
 * Orchestration is an inference service which provides common additional capabilities for business AI scenarios, such as content filtering and data masking. At the core of the service is the LLM module which allows for an easy, harmonized access to the language models of gen AI hub. The service is designed to be modular and extensible, allowing for the addition of new modules in the future. Each module can be configured independently and at runtime, allowing for a high degree of flexibility in the orchestration of AI services.
 *
 * The version of the OpenAPI document: 0.29.3
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.sap.ai.sdk.orchestration.client.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.annotations.Beta;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/** LLMChoice */
@Beta // CHECKSTYLE:OFF
public class LLMChoice implements ModuleResultsOutputUnmaskingInner
// CHECKSTYLE:ON
{
  @JsonProperty("index")
  private Integer index;

  @JsonProperty("message")
  private ChatMessage message;

  @JsonProperty("logprobs")
  private Map<String, List<BigDecimal>> logprobs = new HashMap<>();

  @JsonProperty("finish_reason")
  private String finishReason;

  @JsonAnySetter @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

  /** Default constructor for LLMChoice. */
  protected LLMChoice() {}

  /**
   * Set the index of this {@link LLMChoice} instance and return the same instance.
   *
   * @param index Index of the choice
   * @return The same instance of this {@link LLMChoice} class
   */
  @Nonnull
  public LLMChoice index(@Nonnull final Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Index of the choice
   *
   * @return index The index of this {@link LLMChoice} instance.
   */
  @Nonnull
  public Integer getIndex() {
    return index;
  }

  /**
   * Set the index of this {@link LLMChoice} instance.
   *
   * @param index Index of the choice
   */
  public void setIndex(@Nonnull final Integer index) {
    this.index = index;
  }

  /**
   * Set the message of this {@link LLMChoice} instance and return the same instance.
   *
   * @param message The message of this {@link LLMChoice}
   * @return The same instance of this {@link LLMChoice} class
   */
  @Nonnull
  public LLMChoice message(@Nonnull final ChatMessage message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   *
   * @return message The message of this {@link LLMChoice} instance.
   */
  @Nonnull
  public ChatMessage getMessage() {
    return message;
  }

  /**
   * Set the message of this {@link LLMChoice} instance.
   *
   * @param message The message of this {@link LLMChoice}
   */
  public void setMessage(@Nonnull final ChatMessage message) {
    this.message = message;
  }

  /**
   * Set the logprobs of this {@link LLMChoice} instance and return the same instance.
   *
   * @param logprobs Log probabilities
   * @return The same instance of this {@link LLMChoice} class
   */
  @Nonnull
  public LLMChoice logprobs(@Nullable final Map<String, List<BigDecimal>> logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  /**
   * Put one logprobs instance to this {@link LLMChoice} instance.
   *
   * @param key The String key of this logprobs instance
   * @param logprobsItem The logprobs that should be added under the given key
   * @return The same instance of type {@link LLMChoice}
   */
  @Nonnull
  public LLMChoice putlogprobsItem(
      @Nonnull final String key, @Nonnull final List<BigDecimal> logprobsItem) {
    if (this.logprobs == null) {
      this.logprobs = new HashMap<>();
    }
    this.logprobs.put(key, logprobsItem);
    return this;
  }

  /**
   * Log probabilities
   *
   * @return logprobs The logprobs of this {@link LLMChoice} instance.
   */
  @Nonnull
  public Map<String, List<BigDecimal>> getLogprobs() {
    return logprobs;
  }

  /**
   * Set the logprobs of this {@link LLMChoice} instance.
   *
   * @param logprobs Log probabilities
   */
  public void setLogprobs(@Nullable final Map<String, List<BigDecimal>> logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * Set the finishReason of this {@link LLMChoice} instance and return the same instance.
   *
   * @param finishReason Reason the model stopped generating tokens. &#39;stop&#39; if the model hit
   *     a natural stop point or a provided stop sequence, &#39;length&#39; if the maximum token
   *     number was reached, &#39;content_filter&#39; if content was omitted due to a filter
   *     enforced by the LLM model provider or the content filtering module
   * @return The same instance of this {@link LLMChoice} class
   */
  @Nonnull
  public LLMChoice finishReason(@Nonnull final String finishReason) {
    this.finishReason = finishReason;
    return this;
  }

  /**
   * Reason the model stopped generating tokens. &#39;stop&#39; if the model hit a natural stop
   * point or a provided stop sequence, &#39;length&#39; if the maximum token number was reached,
   * &#39;content_filter&#39; if content was omitted due to a filter enforced by the LLM model
   * provider or the content filtering module
   *
   * @return finishReason The finishReason of this {@link LLMChoice} instance.
   */
  @Nonnull
  public String getFinishReason() {
    return finishReason;
  }

  /**
   * Set the finishReason of this {@link LLMChoice} instance.
   *
   * @param finishReason Reason the model stopped generating tokens. &#39;stop&#39; if the model hit
   *     a natural stop point or a provided stop sequence, &#39;length&#39; if the maximum token
   *     number was reached, &#39;content_filter&#39; if content was omitted due to a filter
   *     enforced by the LLM model provider or the content filtering module
   */
  public void setFinishReason(@Nonnull final String finishReason) {
    this.finishReason = finishReason;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link LLMChoice}.
   *
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link LLMChoice} instance.
   *
   * @param name The name of the property
   * @return The value of the property
   * @throws NoSuchElementException If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if (!cloudSdkCustomFields.containsKey(name)) {
      throw new NoSuchElementException("LLMChoice has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link LLMChoice} instance. If the map previously
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
    final LLMChoice llMChoice = (LLMChoice) o;
    return Objects.equals(this.cloudSdkCustomFields, llMChoice.cloudSdkCustomFields)
        && Objects.equals(this.index, llMChoice.index)
        && Objects.equals(this.message, llMChoice.message)
        && Objects.equals(this.logprobs, llMChoice.logprobs)
        && Objects.equals(this.finishReason, llMChoice.finishReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, message, logprobs, finishReason, cloudSdkCustomFields);
  }

  @Override
  @Nonnull
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class LLMChoice {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
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

  /**
   * Create a type-safe, fluent-api builder object to construct a new {@link LLMChoice} instance
   * with all required arguments.
   */
  public static Builder create() {
    return (index) ->
        (message) ->
            (finishReason) ->
                new LLMChoice().index(index).message(message).finishReason(finishReason);
  }

  /** Builder helper class. */
  public interface Builder {
    /**
     * Set the index of this {@link LLMChoice} instance.
     *
     * @param index Index of the choice
     * @return The LLMChoice builder.
     */
    Builder1 index(@Nonnull final Integer index);
  }

  /** Builder helper class. */
  public interface Builder1 {
    /**
     * Set the message of this {@link LLMChoice} instance.
     *
     * @param message The message of this {@link LLMChoice}
     * @return The LLMChoice builder.
     */
    Builder2 message(@Nonnull final ChatMessage message);
  }

  /** Builder helper class. */
  public interface Builder2 {
    /**
     * Set the finishReason of this {@link LLMChoice} instance.
     *
     * @param finishReason Reason the model stopped generating tokens. &#39;stop&#39; if the model
     *     hit a natural stop point or a provided stop sequence, &#39;length&#39; if the maximum
     *     token number was reached, &#39;content_filter&#39; if content was omitted due to a filter
     *     enforced by the LLM model provider or the content filtering module
     * @return The LLMChoice instance.
     */
    LLMChoice finishReason(@Nonnull final String finishReason);
  }
}
