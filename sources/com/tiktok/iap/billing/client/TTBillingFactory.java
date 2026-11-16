package com.tiktok.iap.billing.client;

import com.tiktok.iap.billing.GPBillVersions;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class TTBillingFactory {
    public static IBillingProxy createBillingProxy() {
        if (GPBillVersions.getMajorVersion() == GPBillVersions.GPBillingVer.V5_V8) {
            return new V5_V8BillingProxy();
        }
        return new EmptyBillingProxy();
    }
}
