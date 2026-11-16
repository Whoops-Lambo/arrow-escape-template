package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class PurchaseHistoryRecordBridge extends CommonJsonResponseBridge {
    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return "com.android.billingclient.api.PurchaseHistoryRecord";
    }

    public PurchaseHistoryRecordBridge(Object obj) {
        super(obj);
    }
}
