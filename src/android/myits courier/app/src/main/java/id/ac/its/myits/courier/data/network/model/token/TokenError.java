package id.ac.its.myits.courier.data.network.model.token;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TokenError {
    @Expose
    @SerializedName("error")
    private String error;

    @Expose
    @SerializedName("error_description")
    private String errorDescription;

    public TokenError() {
    }

    public TokenError(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TokenError that = (TokenError) o;

        if (error != null ? !error.equals(that.error) : that.error != null) return false;
        return errorDescription != null ? errorDescription.equals(that.errorDescription) : that.errorDescription == null;

    }

    @Override
    public int hashCode() {
        int result = error != null ? error.hashCode() : 0;
        result = 31 * result + (errorDescription != null ? errorDescription.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TokenError{" +
                "error='" + error + '\'' +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }
}
