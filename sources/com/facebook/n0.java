package com.facebook;

import defpackage.h50;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class n0 {
    public static final /* synthetic */ int f = 0;
    public final HttpURLConnection a;
    public final JSONObject b;
    public final JSONArray c;
    public final FacebookRequestError d;
    public final JSONObject e;

    public final String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbR = h50.r("{Response:  responseCode: ", str, ", graphObject: ");
        sbR.append(this.b);
        sbR.append(", error: ");
        sbR.append(this.d);
        sbR.append("}");
        return sbR.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(k0 k0Var, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this(k0Var, httpURLConnection, null, jSONArray, null);
        k0Var.getClass();
        str.getClass();
        jSONArray.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(k0 k0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(k0Var, httpURLConnection, jSONObject, null, null);
        k0Var.getClass();
        str.getClass();
    }

    public n0(k0 k0Var, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        k0Var.getClass();
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = jSONArray;
        this.d = facebookRequestError;
        this.e = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n0(k0 k0Var, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(k0Var, httpURLConnection, null, null, facebookRequestError);
        k0Var.getClass();
    }
}
