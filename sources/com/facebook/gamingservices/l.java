package com.facebook.gamingservices;

import android.content.Intent;
import com.facebook.FacebookRequestError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l implements com.facebook.internal.i {
    public final /* synthetic */ com.facebook.p a;

    @Override // com.facebook.internal.i
    public final boolean a(int i, Intent intent) {
        com.facebook.p pVar = this.a;
        if (intent == null || !intent.hasExtra("error")) {
            pVar.onSuccess(new m());
            return true;
        }
        pVar.onError(((FacebookRequestError) intent.getParcelableExtra("error")).i);
        return true;
    }

    public l(com.facebook.p pVar) {
        this.a = pVar;
    }
}
