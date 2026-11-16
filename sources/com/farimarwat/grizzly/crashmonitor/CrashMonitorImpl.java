package com.farimarwat.grizzly.crashmonitor;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\b\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/farimarwat/grizzly/crashmonitor/CrashMonitorImpl;", "Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "Landroid/content/Context;", "mContext", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "mCrashLytics", "", "mTitle", "mMessage", "", "mNormalCrashEnabled", "<init>", "(Landroid/content/Context;Lcom/google/firebase/crashlytics/FirebaseCrashlytics;Ljava/lang/String;Ljava/lang/String;Z)V", "Laz2;", "startMonitor", "()V", "stopMonitor", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "getMCrashLytics", "()Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "setMCrashLytics", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "Ljava/lang/String;", "getMTitle", "()Ljava/lang/String;", "setMTitle", "(Ljava/lang/String;)V", "getMMessage", "setMMessage", "Z", "getMNormalCrashEnabled", "()Z", "setMNormalCrashEnabled", "(Z)V", "Ljava/lang/Thread$UncaughtExceptionHandler;", "mDefaultHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashMonitorImpl implements CrashMonitor {

    @NotNull
    private Context mContext;

    @Nullable
    private FirebaseCrashlytics mCrashLytics;

    @Nullable
    private Thread.UncaughtExceptionHandler mDefaultHandler;

    @NotNull
    private String mMessage;
    private boolean mNormalCrashEnabled;

    @NotNull
    private String mTitle;

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    @NotNull
    public Context getMContext() {
        return this.mContext;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    @Nullable
    public FirebaseCrashlytics getMCrashLytics() {
        return this.mCrashLytics;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    @NotNull
    public String getMMessage() {
        return this.mMessage;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public boolean getMNormalCrashEnabled() {
        return this.mNormalCrashEnabled;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    @NotNull
    public String getMTitle() {
        return this.mTitle;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void setMCrashLytics(@Nullable FirebaseCrashlytics firebaseCrashlytics) {
        this.mCrashLytics = firebaseCrashlytics;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void setMNormalCrashEnabled(boolean z) {
        this.mNormalCrashEnabled = z;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void stopMonitor() {
        Thread.setDefaultUncaughtExceptionHandler(this.mDefaultHandler);
        this.mDefaultHandler = null;
    }

    public CrashMonitorImpl(@NotNull Context context, @Nullable FirebaseCrashlytics firebaseCrashlytics, @NotNull String str, @NotNull String str2, boolean z) {
        context.getClass();
        str.getClass();
        str2.getClass();
        this.mContext = context;
        this.mCrashLytics = firebaseCrashlytics;
        this.mTitle = str;
        this.mMessage = str2;
        this.mNormalCrashEnabled = z;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void setMContext(@NotNull Context context) {
        context.getClass();
        this.mContext = context;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void setMMessage(@NotNull String str) {
        str.getClass();
        this.mMessage = str;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void setMTitle(@NotNull String str) {
        str.getClass();
        this.mTitle = str;
    }

    @Override // com.farimarwat.grizzly.crashmonitor.CrashMonitor
    public void startMonitor() {
        this.mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new CustomExceptionHandlerImpl(getMContext(), getMCrashLytics(), getMTitle(), getMMessage(), getMNormalCrashEnabled()));
    }
}
