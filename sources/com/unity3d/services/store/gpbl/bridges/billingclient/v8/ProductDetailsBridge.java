package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import com.unity3d.services.core.reflection.GenericBridge;
import com.unity3d.services.store.gpbl.BillingOriginalJsonResponse;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.kk2;
import defpackage.qh1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/store/gpbl/bridges/billingclient/v8/ProductDetailsBridge;", "Lcom/unity3d/services/store/gpbl/BillingOriginalJsonResponse;", "Lcom/unity3d/services/core/reflection/GenericBridge;", "internalRef", "", "<init>", "(Ljava/lang/Object;)V", ProductDetailsBridge.TO_STRING_METHOD, "", "getClassName", "getOriginalJson", "Lorg/json/JSONObject;", "parseOriginalJson", "productDetailsString", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductDetailsBridge extends GenericBridge implements BillingOriginalJsonResponse {

    @NotNull
    private static final String TO_STRING_METHOD = "toString";

    @NotNull
    private final Object internalRef;

    private final String parseOriginalJson(String productDetailsString) {
        try {
            int iX = dk2.X(productDetailsString, "jsonString='", 0, false, 6) + 12;
            int iX2 = dk2.X(productDetailsString, "', parsedJson=", 0, false, 6);
            if (1 > iX || iX >= iX2) {
                return null;
            }
            return kk2.I(productDetailsString.substring(iX, iX2), "\\/", "/", false);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    @NotNull
    public String getClassName() {
        return "com.android.billingclient.api.ProductDetails";
    }

    @NotNull
    public String toString() {
        Object objCallNonVoidMethod = callNonVoidMethod(TO_STRING_METHOD, this.internalRef, new Object[0]);
        objCallNonVoidMethod.getClass();
        return (String) objCallNonVoidMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsBridge(@NotNull Object obj) {
        super(qh1.W(new dt1(TO_STRING_METHOD, new Class[0])));
        obj.getClass();
        this.internalRef = obj;
    }

    @Override // com.unity3d.services.store.gpbl.BillingOriginalJsonResponse
    @NotNull
    public JSONObject getOriginalJson() {
        try {
            String originalJson = parseOriginalJson(toString());
            if (originalJson != null) {
                return new JSONObject(originalJson);
            }
            return new JSONObject();
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }
}
