package id.ac.its.myits.courier.data.network.model.courier;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {
    @Expose
    @SerializedName("sub")
    private String sub;

    @Expose
    @SerializedName("preferred_username")
    private String preferredUsername;

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getPreferredUsername() {
        return preferredUsername;
    }

    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }
}
