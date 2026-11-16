package com.farimarwat.grizzly.crashmonitor;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000b\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u00020\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010 \u001a\u00020\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "", "Laz2;", "startMonitor", "()V", "stopMonitor", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "mContext", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getMCrashLytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "setMCrashLytics", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "mCrashLytics", "", "getMTitle", "()Ljava/lang/String;", "setMTitle", "(Ljava/lang/String;)V", "mTitle", "getMMessage", "setMMessage", "mMessage", "", "getMNormalCrashEnabled", "()Z", "setMNormalCrashEnabled", "(Z)V", "mNormalCrashEnabled", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CrashMonitor {
    @NotNull
    Context getMContext();

    @Nullable
    FirebaseCrashlytics getMCrashLytics();

    @NotNull
    String getMMessage();

    boolean getMNormalCrashEnabled();

    @NotNull
    String getMTitle();

    void setMContext(@NotNull Context context);

    void setMCrashLytics(@Nullable FirebaseCrashlytics firebaseCrashlytics);

    void setMMessage(@NotNull String str);

    void setMNormalCrashEnabled(boolean z);

    void setMTitle(@NotNull String str);

    void startMonitor();

    void stopMonitor();
}
