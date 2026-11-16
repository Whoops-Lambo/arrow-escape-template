package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.d;
import defpackage.nj;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@zzv
public final class UnfetchedProduct {
    private final String jsonString;
    private final String productId;
    private final String productType;

    @Nullable
    private final String serializedDocid;
    private final int statusCode;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {

        @zzv
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;

        @zzv
        public static final int NO_ELIGIBLE_OFFER = 4;

        @zzv
        public static final int PRODUCT_NOT_FOUND = 3;

        @zzv
        public static final int UNKNOWN = 0;
    }

    @NonNull
    @VisibleForTesting
    public static UnfetchedProduct fromJson(@NonNull String str) throws JSONException {
        return new UnfetchedProduct(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnfetchedProduct) {
            return TextUtils.equals(this.jsonString, ((UnfetchedProduct) obj).jsonString);
        }
        return false;
    }

    @NonNull
    @zzv
    public String getProductId() {
        return this.productId;
    }

    @NonNull
    @zzv
    public String getProductType() {
        return this.productType;
    }

    @Nullable
    public String getSerializedDocid() {
        return this.serializedDocid;
    }

    @zzv
    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.jsonString.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UnfetchedProduct{productId='");
        sb.append(this.productId);
        sb.append("', productType='");
        sb.append(this.productType);
        sb.append("', statusCode=");
        return nj.l(this.statusCode, "}", sb);
    }

    public UnfetchedProduct(String str) throws JSONException {
        int iOptInt;
        this.jsonString = str;
        JSONObject jSONObject = new JSONObject(str);
        this.productId = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        String strOptString = jSONObject.optString("type");
        this.productType = strOptString;
        if (jSONObject.has("statusCode")) {
            iOptInt = jSONObject.optInt("statusCode");
        } else {
            iOptInt = 0;
        }
        this.statusCode = iOptInt;
        if (!TextUtils.isEmpty(strOptString)) {
            this.serializedDocid = jSONObject.optString("serializedDocid");
        } else {
            d.r("Product type cannot be empty.");
            throw null;
        }
    }
}
