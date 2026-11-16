package com.google.unity.ads.nextgen;

import android.app.Activity;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class UnityAdBase<AdT, CallbackT> {
    protected final Activity activity;
    protected AdT ad;
    protected final CallbackT callback;
    protected final Executor executor;

    public UnityAdBase(Activity activity, CallbackT callbackt, Executor executor) {
        this.activity = activity;
        this.callback = callbackt;
        this.executor = executor;
    }
}
