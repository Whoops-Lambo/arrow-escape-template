package com.applovin.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class AppLovinUserData {
    private String a;
    private String b;
    private String c;

    @Nullable
    public String getEmail() {
        return this.a;
    }

    @Nullable
    public String getPhone() {
        return this.b;
    }

    @Nullable
    public String getUserId() {
        return this.c;
    }

    public void setEmail(@Nullable String str) {
        this.a = str;
    }

    public void setPhone(@Nullable String str) {
        this.b = str;
    }

    public void setUserId(@Nullable String str) {
        this.c = str;
    }
}
