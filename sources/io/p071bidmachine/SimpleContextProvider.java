package io.p071bidmachine;

import android.app.Activity;
import android.content.Context;
import io.p071bidmachine.util.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/bidmachine/SimpleContextProvider;", "Lio/bidmachine/ContextProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "getActivity", "Landroid/app/Activity;", "getApplicationContext", "getContext", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SimpleContextProvider implements ContextProvider {

    @NotNull
    private final Context applicationContext;

    @Override // io.p071bidmachine.ContextProvider
    @Nullable
    public Activity getActivity() {
        AtomicBoolean atomicBoolean = k1.a;
        WeakReference weakReference = p.f;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // io.p071bidmachine.ContextProvider
    @NotNull
    public Context getApplicationContext() {
        return this.applicationContext;
    }

    @Override // io.p071bidmachine.ContextProvider
    @NotNull
    public Context getContext() {
        return this.applicationContext;
    }

    public SimpleContextProvider(@NotNull Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.applicationContext = applicationContext;
    }
}
