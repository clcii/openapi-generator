/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.client.model.ShapeInterface;
import org.openapitools.client.model.TriangleInterface;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;

/**
 * ScaleneTriangle
 */
@JsonPropertyOrder({
  ScaleneTriangle.JSON_PROPERTY_SHAPE_TYPE,
  ScaleneTriangle.JSON_PROPERTY_TRIANGLE_TYPE
})

public class ScaleneTriangle {
  public static final String JSON_PROPERTY_SHAPE_TYPE = "shapeType";
  private String shapeType;

  public static final String JSON_PROPERTY_TRIANGLE_TYPE = "triangleType";
  private String triangleType;


  public ScaleneTriangle shapeType(String shapeType) {
    this.shapeType = shapeType;
    return this;
  }

   /**
   * Get shapeType
   * @return shapeType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHAPE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getShapeType() {
    return shapeType;
  }


  public void setShapeType(String shapeType) {
    this.shapeType = shapeType;
  }


  public ScaleneTriangle triangleType(String triangleType) {
    this.triangleType = triangleType;
    return this;
  }

   /**
   * Get triangleType
   * @return triangleType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRIANGLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTriangleType() {
    return triangleType;
  }


  public void setTriangleType(String triangleType) {
    this.triangleType = triangleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScaleneTriangle scaleneTriangle = (ScaleneTriangle) o;
    return Objects.equals(this.shapeType, scaleneTriangle.shapeType) &&
        Objects.equals(this.triangleType, scaleneTriangle.triangleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shapeType, triangleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScaleneTriangle {\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
    sb.append("    triangleType: ").append(toIndentedString(triangleType)).append("\n");
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

