package com.tiktok.appevents;

import com.tiktok.util.JSON;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class TTPurchaseInfo {
    private String eventId;
    private boolean isAutoTrack;
    private boolean isSubs;
    private final JSONObject purchase;
    private final JSONObject skuDetails;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class InvalidTTPurchaseInfoException extends Exception {
        public InvalidTTPurchaseInfoException(String str) {
            super(str);
        }
    }

    private boolean isValidPurchase(JSONObject jSONObject) {
        return (jSONObject.isNull("orderId") || jSONObject.isNull(InAppPurchaseMetaData.KEY_PRODUCT_ID)) ? false : true;
    }

    private boolean isValidSkuDetails(JSONObject jSONObject) {
        return (jSONObject.isNull("price") || jSONObject.isNull(InAppPurchaseMetaData.KEY_PRODUCT_ID)) ? false : true;
    }

    public String getEventId() {
        return this.eventId;
    }

    public JSONObject getPurchase() {
        return this.purchase;
    }

    public JSONObject getSkuDetails() {
        return this.skuDetails;
    }

    public boolean isAutoTrack() {
        return this.isAutoTrack;
    }

    public boolean isSubs() {
        return this.isSubs;
    }

    public void setAutoTrack(boolean z) {
        this.isAutoTrack = z;
    }

    public void setSubs(boolean z) {
        this.isSubs = z;
    }

    public TTPurchaseInfo(JSONObject jSONObject, JSONObject jSONObject2) throws InvalidTTPurchaseInfoException {
        this.isSubs = false;
        if (isValidPurchase(jSONObject)) {
            if (isValidSkuDetails(jSONObject2)) {
                String string = JSON.getString(jSONObject, InAppPurchaseMetaData.KEY_PRODUCT_ID);
                String string2 = JSON.getString(jSONObject2, InAppPurchaseMetaData.KEY_PRODUCT_ID);
                if (string != null && !string.equals(string2)) {
                    throw new InvalidTTPurchaseInfoException("Product Id does not match");
                }
                this.purchase = jSONObject;
                this.skuDetails = jSONObject2;
                return;
            }
            throw new InvalidTTPurchaseInfoException("Not a valid skuDetails Object");
        }
        throw new InvalidTTPurchaseInfoException("Not a valid purchase object");
    }

    public TTPurchaseInfo(JSONObject jSONObject, JSONObject jSONObject2, String str) throws InvalidTTPurchaseInfoException {
        this(jSONObject, jSONObject2);
        this.eventId = str;
    }
}
