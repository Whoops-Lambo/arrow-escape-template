package com.singular.sdk;

import com.singular.sdk.internal.Constants;
import com.singular.sdk.internal.Utils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class SingularUserDetails {
    private String email;
    private final Map<String, String> hashedValues = new LinkedHashMap();
    private String phoneNumber;

    public String getEmail() {
        return this.email;
    }

    public String getEmailNoDots() {
        return this.hashedValues.get(Constants.UserDetails.EMAIL_NODOTS_KEY);
    }

    public String getEmailSTD() {
        return this.hashedValues.get(Constants.UserDetails.EMAIL_STD_KEY);
    }

    public String getPhoneDigits() {
        return this.hashedValues.get(Constants.UserDetails.PHONE_DIGITS_KEY);
    }

    public String getPhoneE164() {
        return this.hashedValues.get(Constants.UserDetails.PHONE_E164_KEY);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setEmailNoDots(String str) {
        putHashed(Constants.UserDetails.EMAIL_NODOTS_KEY, str);
    }

    public void setEmailSTD(String str) {
        putHashed(Constants.UserDetails.EMAIL_STD_KEY, str);
    }

    public void setPhoneDigits(String str) {
        putHashed(Constants.UserDetails.PHONE_DIGITS_KEY, str);
    }

    public void setPhoneE164(String str) {
        putHashed(Constants.UserDetails.PHONE_E164_KEY, str);
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    private void putHashed(String str, String str2) {
        boolean zIsEmptyOrNull = Utils.isEmptyOrNull(str2);
        Map<String, String> map = this.hashedValues;
        if (zIsEmptyOrNull) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }
}
