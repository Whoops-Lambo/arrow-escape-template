package com.farimarwat.grizzly.crashmonitor;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/farimarwat/grizzly/crashmonitor/CrashMonitorBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mFirebaseCrashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "mMessage", "", "mNormalCrashEnabled", "", "mTitle", "build", "Lcom/farimarwat/grizzly/crashmonitor/CrashMonitor;", "withFirebaseCrashlytics", "firebaseCrashlytics", "withMessage", "message", "withNormalCrashEnabled", "enabled", "withTitle", "title", "grizzly_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashMonitorBuilder {

    @NotNull
    private final Context context;

    @Nullable
    private FirebaseCrashlytics mFirebaseCrashlytics;

    @NotNull
    private String mMessage;
    private boolean mNormalCrashEnabled;

    @NotNull
    private String mTitle;

    @NotNull
    public final CrashMonitor build() {
        return new CrashMonitorImpl(this.context, this.mFirebaseCrashlytics, this.mTitle, this.mMessage, this.mNormalCrashEnabled);
    }

    @NotNull
    public final CrashMonitorBuilder withFirebaseCrashlytics(@Nullable FirebaseCrashlytics firebaseCrashlytics) {
        this.mFirebaseCrashlytics = firebaseCrashlytics;
        return this;
    }

    @NotNull
    public final CrashMonitorBuilder withNormalCrashEnabled(boolean enabled) {
        this.mNormalCrashEnabled = enabled;
        return this;
    }

    public CrashMonitorBuilder(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.mTitle = "Application Error";
        this.mMessage = "An unexpected error occurred. Please restart the app.";
    }

    @NotNull
    public final CrashMonitorBuilder withMessage(@NotNull String message) {
        message.getClass();
        this.mMessage = message;
        return this;
    }

    @NotNull
    public final CrashMonitorBuilder withTitle(@NotNull String title) {
        title.getClass();
        this.mTitle = title;
        return this;
    }
}
