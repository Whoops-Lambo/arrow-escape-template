package com.inmobi.media;

import android.content.Context;
import com.inmobi.sdk.SdkInitializationListener;
import defpackage.s71;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Pa {
    public final Context a;
    public final String b;
    public final byte c;
    public final JSONObject d;
    public final SdkInitializationListener e;
    public final long f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pa)) {
            return false;
        }
        Pa pa = (Pa) obj;
        return s71.b(this.a, pa.a) && s71.b(this.b, pa.b) && this.c == pa.c && s71.b(this.d, pa.d) && s71.b(this.e, pa.e) && this.f == pa.f;
    }

    public static Pa a(Pa pa, Context context, String str, int i) {
        if ((i & 2) != 0) {
            str = pa.b;
        }
        return new Pa(context, str, pa.c, pa.d, pa.e, pa.f);
    }

    public final int hashCode() {
        Context context = this.a;
        int iHashCode = (context == null ? 0 : context.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (Byte.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        JSONObject jSONObject = this.d;
        int iHashCode3 = (iHashCode2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        SdkInitializationListener sdkInitializationListener = this.e;
        return Long.hashCode(this.f) + ((iHashCode3 + (sdkInitializationListener != null ? sdkInitializationListener.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Context context = this.a;
        String str = this.b;
        byte b = this.c;
        return "InitRequest(context=" + context + ", accountId=" + str + ", source=" + ((int) b) + ", consentObject=" + this.d + ", sdkInitializationListener=" + this.e + ", startTime=" + this.f + ")";
    }

    public Pa(Context context, String str, byte b, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener, long j) {
        this.a = context;
        this.b = str;
        this.c = b;
        this.d = jSONObject;
        this.e = sdkInitializationListener;
        this.f = j;
    }
}
