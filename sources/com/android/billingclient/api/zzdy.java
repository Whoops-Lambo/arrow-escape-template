package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
final class zzdy extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.hasExtra("RESPONSE_CODE")) {
            com.google.android.gms.internal.play_billing.zzc.h("ProxyBillingBroadcastReceiver", "Null intent or intent missing response code!");
            return;
        }
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(intent.getIntExtra("RESPONSE_CODE", 0));
        String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
        if (stringExtra == null) {
            stringExtra = "";
        }
        builderNewBuilder.setDebugMessage(stringExtra);
        builderNewBuilder.build();
    }
}
