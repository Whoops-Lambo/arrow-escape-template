package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class InneractiveUserConfig {
    public Gender a = null;
    public String b = null;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum Gender {
        MALE,
        FEMALE
    }

    public Gender getGender() {
        return this.a;
    }

    @Deprecated
    public String getZipCode() {
        return this.b;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.a = gender;
            return this;
        }
        IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
            return this;
        }
        this.b = str;
        return this;
    }
}
