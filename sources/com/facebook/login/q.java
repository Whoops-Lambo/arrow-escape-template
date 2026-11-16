package com.facebook.login;

import androidx.p003activity.result.ActivityResult;
import androidx.p003activity.result.ActivityResultCallback;
import defpackage.oi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements ActivityResultCallback {
    public final /* synthetic */ Object a;

    public /* synthetic */ q(Object obj) {
        this.a = obj;
    }

    @Override // androidx.p003activity.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        ((oi) this.a).invoke((ActivityResult) obj);
    }
}
