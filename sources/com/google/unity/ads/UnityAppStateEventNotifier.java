package com.google.unity.ads;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class UnityAppStateEventNotifier implements DefaultLifecycleObserver {
    private final Activity activity;
    private final UnityAppStateEventCallback callback;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        this.callback.onAppStateChanged(false);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        this.callback.onAppStateChanged(true);
    }

    public void startListening() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.UnityAppStateEventNotifier.1
            final /* synthetic */ UnityAppStateEventNotifier this$0;

            @Override // java.lang.Runnable
            public void run() {
                ProcessLifecycleOwner.i.f.a(this.this$0);
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    public void stopListening() {
        this.activity.runOnUiThread(new Runnable(this) { // from class: com.google.unity.ads.UnityAppStateEventNotifier.2
            final /* synthetic */ UnityAppStateEventNotifier this$0;

            @Override // java.lang.Runnable
            public void run() {
                ProcessLifecycleOwner.i.f.c(this.this$0);
            }

            {
                Objects.requireNonNull(this);
                this.this$0 = this;
            }
        });
    }

    public UnityAppStateEventNotifier(Activity activity, UnityAppStateEventCallback unityAppStateEventCallback) {
        this.activity = activity;
        this.callback = unityAppStateEventCallback;
    }
}
