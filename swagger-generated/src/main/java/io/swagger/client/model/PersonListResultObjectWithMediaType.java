/*
 * API
 * ## Welcome  This is a place to put general notes and extra information, for internal use.  To get started designing/documenting this API, select a version on the left. # Title No Description
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ImagePath;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * PersonListResultObjectWithMediaType
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-09-03T23:12:37.025-03:00[America/Sao_Paulo]")
public class PersonListResultObjectWithMediaType {
  @SerializedName("profile_path")
  private ImagePath profilePath = null;

  @SerializedName("adult")
  private Boolean adult = null;

  @SerializedName("id")
  private Integer id = null;

  /**
   * Gets or Sets mediaType
   */
  @JsonAdapter(MediaTypeEnum.Adapter.class)
  public enum MediaTypeEnum {
    PERSON("person");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MediaTypeEnum fromValue(String text) {
      for (MediaTypeEnum b : MediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MediaTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MediaTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MediaTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MediaTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("media_type")
  private MediaTypeEnum mediaType = null;

  @SerializedName("known_for")
  private List<Object> knownFor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("popularity")
  private BigDecimal popularity = null;

  public PersonListResultObjectWithMediaType profilePath(ImagePath profilePath) {
    this.profilePath = profilePath;
    return this;
  }

   /**
   * Get profilePath
   * @return profilePath
  **/
  @Schema(description = "")
  public ImagePath getProfilePath() {
    return profilePath;
  }

  public void setProfilePath(ImagePath profilePath) {
    this.profilePath = profilePath;
  }

  public PersonListResultObjectWithMediaType adult(Boolean adult) {
    this.adult = adult;
    return this;
  }

   /**
   * Get adult
   * @return adult
  **/
  @Schema(description = "")
  public Boolean isAdult() {
    return adult;
  }

  public void setAdult(Boolean adult) {
    this.adult = adult;
  }

  public PersonListResultObjectWithMediaType id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PersonListResultObjectWithMediaType mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @Schema(required = true, description = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PersonListResultObjectWithMediaType knownFor(List<Object> knownFor) {
    this.knownFor = knownFor;
    return this;
  }

  public PersonListResultObjectWithMediaType addKnownForItem(Object knownForItem) {
    if (this.knownFor == null) {
      this.knownFor = new ArrayList<Object>();
    }
    this.knownFor.add(knownForItem);
    return this;
  }

   /**
   * Get knownFor
   * @return knownFor
  **/
  @Schema(description = "")
  public List<Object> getKnownFor() {
    return knownFor;
  }

  public void setKnownFor(List<Object> knownFor) {
    this.knownFor = knownFor;
  }

  public PersonListResultObjectWithMediaType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PersonListResultObjectWithMediaType popularity(BigDecimal popularity) {
    this.popularity = popularity;
    return this;
  }

   /**
   * Get popularity
   * @return popularity
  **/
  @Schema(description = "")
  public BigDecimal getPopularity() {
    return popularity;
  }

  public void setPopularity(BigDecimal popularity) {
    this.popularity = popularity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonListResultObjectWithMediaType personListResultObjectWithMediaType = (PersonListResultObjectWithMediaType) o;
    return Objects.equals(this.profilePath, personListResultObjectWithMediaType.profilePath) &&
        Objects.equals(this.adult, personListResultObjectWithMediaType.adult) &&
        Objects.equals(this.id, personListResultObjectWithMediaType.id) &&
        Objects.equals(this.mediaType, personListResultObjectWithMediaType.mediaType) &&
        Objects.equals(this.knownFor, personListResultObjectWithMediaType.knownFor) &&
        Objects.equals(this.name, personListResultObjectWithMediaType.name) &&
        Objects.equals(this.popularity, personListResultObjectWithMediaType.popularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profilePath, adult, id, mediaType, knownFor, name, popularity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonListResultObjectWithMediaType {\n");
    
    sb.append("    profilePath: ").append(toIndentedString(profilePath)).append("\n");
    sb.append("    adult: ").append(toIndentedString(adult)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    knownFor: ").append(toIndentedString(knownFor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}