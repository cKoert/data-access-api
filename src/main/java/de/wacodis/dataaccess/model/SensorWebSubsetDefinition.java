package de.wacodis.dataaccess.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/** SensorWebSubsetDefinition */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2018-11-27T14:57:01.610+01:00[Europe/Berlin]")
public class SensorWebSubsetDefinition extends AbstractSubsetDefinition implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("serviceUrl")
    private String serviceUrl;

    @JsonProperty("offering")
    private String offering;

    @JsonProperty("featureOfInterest")
    private String featureOfInterest;

    @JsonProperty("observedProperty")
    private String observedProperty;

    @JsonProperty("procedure")
    private String procedure;

    public SensorWebSubsetDefinition serviceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get serviceUrl
     *
     * @return serviceUrl
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getServiceUrl() {
        return serviceUrl;
    }

    public void setServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    public SensorWebSubsetDefinition offering(String offering) {
        this.offering = offering;
        return this;
    }

    /**
     * Get offering
     *
     * @return offering
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getOffering() {
        return offering;
    }

    public void setOffering(String offering) {
        this.offering = offering;
    }

    public SensorWebSubsetDefinition featureOfInterest(String featureOfInterest) {
        this.featureOfInterest = featureOfInterest;
        return this;
    }

    /**
     * Get featureOfInterest
     *
     * @return featureOfInterest
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getFeatureOfInterest() {
        return featureOfInterest;
    }

    public void setFeatureOfInterest(String featureOfInterest) {
        this.featureOfInterest = featureOfInterest;
    }

    public SensorWebSubsetDefinition observedProperty(String observedProperty) {
        this.observedProperty = observedProperty;
        return this;
    }

    /**
     * Get observedProperty
     *
     * @return observedProperty
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getObservedProperty() {
        return observedProperty;
    }

    public void setObservedProperty(String observedProperty) {
        this.observedProperty = observedProperty;
    }

    public SensorWebSubsetDefinition procedure(String procedure) {
        this.procedure = procedure;
        return this;
    }

    /**
     * Get procedure
     *
     * @return procedure
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull
    public String getProcedure() {
        return procedure;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SensorWebSubsetDefinition sensorWebSubsetDefinition = (SensorWebSubsetDefinition) o;
        return Objects.equals(this.serviceUrl, sensorWebSubsetDefinition.serviceUrl)
                && Objects.equals(this.offering, sensorWebSubsetDefinition.offering)
                && Objects.equals(
                        this.featureOfInterest, sensorWebSubsetDefinition.featureOfInterest)
                && Objects.equals(this.observedProperty, sensorWebSubsetDefinition.observedProperty)
                && Objects.equals(this.procedure, sensorWebSubsetDefinition.procedure)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                serviceUrl,
                offering,
                featureOfInterest,
                observedProperty,
                procedure,
                super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SensorWebSubsetDefinition {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
        sb.append("    offering: ").append(toIndentedString(offering)).append("\n");
        sb.append("    featureOfInterest: ")
                .append(toIndentedString(featureOfInterest))
                .append("\n");
        sb.append("    observedProperty: ").append(toIndentedString(observedProperty)).append("\n");
        sb.append("    procedure: ").append(toIndentedString(procedure)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
