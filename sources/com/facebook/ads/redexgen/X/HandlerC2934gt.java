package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public class HandlerC2934gt extends Handler {
    public final /* synthetic */ C2937gw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC2934gt(C2937gw c2937gw, Looper looper) {
        super(looper);
        this.A00 = c2937gw;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                this.A00.A02();
                break;
            default:
                super.handleMessage(message);
                break;
        }
    }
}
