package com.google.games.bridge;

import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class PayloadCallbackProxy extends PayloadCallback {
    private Callback callback;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Callback {
        void onPayloadReceived(String str, Payload payload);
    }

    @Override // com.google.android.gms.nearby.connection.PayloadCallback
    public void onPayloadTransferUpdate(String str, PayloadTransferUpdate payloadTransferUpdate) {
    }

    @Override // com.google.android.gms.nearby.connection.PayloadCallback
    public void onPayloadReceived(String str, Payload payload) {
        this.callback.onPayloadReceived(str, payload);
    }

    public PayloadCallbackProxy(Callback callback) {
        this.callback = callback;
    }
}
